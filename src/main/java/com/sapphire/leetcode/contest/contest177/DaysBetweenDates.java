package com.sapphire.leetcode.contest.contest177;

import org.junit.Assert;

/**
 * Author: 柏云鹏
 * Date: 2020/2/23.
 */
public class DaysBetweenDates {
    // 1年1月1日
    public int daysBetweenDates(String date1, String date2) {

        if (date1.compareTo(date2) < 0) {
            return daysBetweenDates(date2, date1);
        }

        String[] date1s = date1.split("-");
        String[] date2s = date2.split("-");

        return calculate(date1s) - calculate(date2s);
    }

    private int calculate(String[] dateStrs) {
        int[] monthArray = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int year = Integer.parseInt(dateStrs[0]);
        int month = Integer.parseInt(dateStrs[1]);
        int day = Integer.parseInt(dateStrs[2]);

        int dayOfYear = (year - 1) * 365 + (year / 4) - (year / 100) + (year / 400);

        if (year % 100 == 0 && year % 400 == 0) {
            if (month <= 2) {
                dayOfYear -= 1;
            }
        } else if (year %100 != 0 && year % 4 == 0) {
            if (month <= 2) {
                dayOfYear -= 1;
            }
        }

        int dayOfMonth = 0;
        for (int i = 0; i < month - 1; i++) {
            dayOfMonth += monthArray[i];
        }

        return dayOfYear + dayOfMonth + day - 1;
    }

    public static void main(String[] args) {
        String date1 = "1971-06-29";
        String date2 = "2010-09-23";

        int result = new DaysBetweenDates().daysBetweenDates(date1, date2);

        Assert.assertNotNull(result);
    }
}
