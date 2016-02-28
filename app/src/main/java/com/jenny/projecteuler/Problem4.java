package com.jenny.projecteuler;
import android.os.SystemClock;

public class Problem4 implements Problem
{
	// Find the largest pallindromic number that can be made by multiplying two 3-digit numbers
	public String getAnswer() {
		long startTime = SystemClock.currentThreadTimeMillis();
		int greatestPallindrome = 0;
		for (int i = 999; i > 700; i--) {
			for (int j = 999; j > 700; j--) {
				if (isPallindrome(i * j)) {
					if (i * j > greatestPallindrome) {
						greatestPallindrome = i * j;		
					}
				}
			}
		}
		long endTime = SystemClock.currentThreadTimeMillis();
		return "Value: " + greatestPallindrome + "\nTime: " + (endTime - startTime);
	}
	
	private boolean isPallindrome(Integer value) { 
		String digits = value.toString(); 
		for (int i = 0, j = digits.length() - 1; i < j; i++, j--){ 
			if (digits.charAt(i) != digits.charAt(j)) { 
				return false; 
			} 
		} 
		return true;
	}

	@Override
	public String getProblemDescriptor() {
		return "Largest palindrome product";
	}
	
}
