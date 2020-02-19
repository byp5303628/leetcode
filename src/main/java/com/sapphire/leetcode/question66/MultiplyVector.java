package com.sapphire.leetcode.question66;

import org.junit.Assert;

import java.util.Arrays;

/**
 * Author: 柏云鹏
 * Date: 2020/2/19.
 */
public class MultiplyVector {
    public int[] constructArr(int[] a) {
        public int[] constructArr(int[] a) {
            if(a.length==0)return a;
            int[] left = new int[a.length];   // save a[0]*a[1]*..
            int[] right = new int[a.length];  // save a[n-1]*a[n-2]*..
            left[0] = a[0];
            right[a.length-1] = a[a.length-1];

            for(int i=1;i<a.length-1;i++){
                left[i] = left[i-1]*a[i];
                right[a.length-i-1] = right[a.length-i]*a[a.length-i-1];
            }
            right[0] = right[1];
            for(int i=1;i<a.length-1;i++){
                right[i] = left[i-1]*right[i+1];
            }
            right[a.length-1] = left[a.length-2];
            return right;
        }
    }

    public static void main(String[] args) {
        int[] a = new int[]{1, 2, 3, 4, 5};

        int[] b = new MultiplyVector().constructArr(a);

        Assert.assertNotNull(b);
    }
}
