package com.sapphire.leetcode.algorithm.question905;

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;

/**
 * SortArrayByParity Tester.
 *
 * @version 1.0
 * @since <pre>May 22, 2019</pre>
 */
public class SortArrayByParityTest {

    @Before
    public void before() throws Exception {
    }


    @Test
    public void test_sortArrayByParity_1() throws Exception {
        int[] array = new int[]{3, 1, 2, 4};

        int[] result = new SortArrayByParity().sortArrayByParity(array);

        Assert.assertNotNull(result);
    }


} 
