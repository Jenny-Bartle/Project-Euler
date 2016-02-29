package com.jenny.projecteuler;

import android.os.SystemClock;

/**
 * Created by Jenny on 29-Feb-16.
 */
public class Problem9 implements Problem {

    public String getAnswer() {
        long startTime = SystemClock.currentThreadTimeMillis();
        double answer = -1;
        for(int a = 1; a < 900; a++) {
            for (int b = 1; b < 300; b++) {
                double c = Math.sqrt((a*a)+(b*b));
                if (c == Math.floor(c)) {
                    // we have a triplet, check to see if factor of 1000
                    if (1000 % (a+b+c) == 0) {
                        answer = Math.pow((1000/(a+b+c)), 3) * a*b*c;
                        break;
                    }
                }
            }
            if (answer > 0)
                break;
        }

        long endTime = SystemClock.currentThreadTimeMillis();
        return "Value: " + answer + "\nTime: " + (endTime - startTime);
    }

    @Override
    public String getProblemDescriptor() {
        return "Special Pythagorean triplet";
    }
}
