package com.sapphire.leetcode.contest.contest137;

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;

/**
 * LastStoneWeight Tester.
 *
 * @author æäºé¹
 * @version 1.0
 * @since <pre>May 19, 2019</pre>
 */
public class LastStoneWeightTest {


    @Test
    public void test_lastStoneWeight_1() throws Exception {
        int[] array = new int[]{2, 7, 4, 1, 8, 1};

        int result = new LastStoneWeight().lastStoneWeight(array);

        Assert.assertEquals(result, 1);
    }

}
