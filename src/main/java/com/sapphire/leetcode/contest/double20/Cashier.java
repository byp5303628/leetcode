package com.sapphire.leetcode.contest.double20;

import java.util.HashMap;
import java.util.Map;

/**
 * Author: 柏云鹏
 * Date: 2020/2/22.
 */
public class Cashier {
    private int n;
    private int discount;
    Map<Integer, Integer> priceMap = new HashMap<Integer, Integer>();

    private int count = 0;

    public Cashier(int n, int discount, int[] products, int[] prices) {
        this.n = n;
        this.discount = discount;

        for (int i = 0; i < products.length; i++) {
            this.priceMap.put(products[i], prices[i]);
        }
    }

    public synchronized double getBill(int[] product, int[] amount) {
        count++;

        int total = 0;
        for (int i = 0; i < product.length; i++) {
            total += priceMap.get(product[i]) * amount[i];
        }

        if (count % n == 0) {
            return total - discount * total * 1.0 / 100;
        } else {
            return total;
        }
    }

    public static void main(String[] args) {
        Cashier cashier = new Cashier(3,50,new int[]{1,2,3,4,5,6,7},new int[]{100,200,300,400,300,200,100});
        System.out.println(cashier.getBill(new int[]{1,2},new int[]{1,2}));                        // 返回 500.0, 账单金额为 = 1 * 100 + 2 * 200 = 500.
        System.out.println(cashier.getBill(new int[]{3,7},new int[]{10,10}));                      // 返回 4000.0
        System.out.println(cashier.getBill(new int[]{1,2,3,4,5,6,7},new int[]{1,1,1,1,1,1,1}));    // 返回 800.0 ，账单原本为 1600.0 ，但由于该顾客是第三位顾客，他将得到 50% 的折扣，所以实际金额为 1600 - 1600 * (50 / 100) = 800 。
        System.out.println(cashier.getBill(new int[]{4},new int[]{10}));                           // 返回 4000.0
        System.out.println(cashier.getBill(new int[]{7,3},new int[]{10,10}));                      // 返回 4000.0
        System.out.println(cashier.getBill(new int[]{7,5,3,1,6,4,2},new int[]{10,10,10,9,9,9,7})); // 返回 7350.0 ，账单原本为 14700.0 ，但由于系统计数再次达到三，该顾客将得到 50% 的折扣，实际金额为 7350.0 。
        System.out.println(cashier.getBill(new int[]{2,3,5},new int[]{5,3,2}));                    // 返回 2500.0

    }
}
