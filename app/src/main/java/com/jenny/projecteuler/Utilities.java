package com.jenny.projecteuler;

import java.util.List;

/**
 * Created by Jenny on 29-Feb-16.
 */
public class Utilities {

    public static boolean isPrime(int value, List<Integer> primes) {
        int sqrtValue = (int)Math.sqrt(value);
        for (int i = 0; i < sqrtValue; i++) {
            if ((value % primes.get(i)) == 0) {
                return false;
            }
        }
        primes.add(value);
        return true;
    }
}
