package com.sapphire.leetcode.question461;

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;

/**
 * HammingDistance Tester.
 *
 * @version 1.0
 * @since <pre>May 20, 2019</pre>
 */
public class HammingDistanceTest {




    @Test
    public void test_hammingDistance_1() throws Exception {
        int x = 3;
        int y = 1;

        int z = new HammingDistance().hammingDistance(x, y);

        Assert.assertEquals(z, 2);
    }


} 
