package com.jenny.projecteuler;
import android.os.*;

public class Problem14 implements Problem
{

	public String getAnswer() {
		long startTime = SystemClock.currentThreadTimeMillis();
		
		// Make a list of all the numbers that will be used as starting numbers for the sequence
		int[] toCalculate = new int[1000000];
		for (int i = 5; i < 1000000; i++) {
			toCalculate[i] = i;
		}
		
		// Keep track of the longest sequence
		int longestSequence = 0;
		int longestSequenceNo = 0;
		
		for(int i = 5; i< 1000000; i++){
			// Ony calculate if we have not already had a sequence containing this
			// It will be set to < 0 if it has been in a sequence
			if(toCalculate[i] > 0) {
				int sequenceLength = calculateCollatzLength((long)i, toCalculate);
				// Replace highest value
				if(sequenceLength > longestSequence) {
					longestSequence = sequenceLength;
					longestSequenceNo = i;
				}
			}
		}
		long endTime = SystemClock.currentThreadTimeMillis();
		return "Value: " + longestSequenceNo + "\nTime: " + (endTime - startTime);
	}

	@Override
	public String getProblemDescriptor() {
		return "Longest Collatz Sequence";
	}
	
	private int calculateCollatzLength(long startNo, int[] toCalculate) {
		int length = 0;
		while (startNo > 4) {
			// Even 2n
			if (startNo % 2 == 0) {
				startNo /= 2;
			}
			// Odd 3n+1
			else {
				startNo = startNo * 3 + 1;
			}
			// Flag this value as a useless starting number
			if (startNo <1000000) {
				toCalculate[(int)startNo] = -1;
			}
			length++;
		}
		return length;
	}
}
