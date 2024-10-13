/*
 * The MIT License
 *
 * Copyright 2016 CloudBees, Inc.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

package test;

import org.junit.Test;

public class SomeTest extends Base {

    @Test
    public void testAddPositiveNumbers() {
        // 测试两个正数相加
        int result = add(5, 3);
        assertEquals(8, result);  // 5 + 3 应该等于 8
    }

    @Test
    public void testAddNegativeNumbers() {
        // 测试两个负数相加
        int result = add(-5, -3);
        assertEquals(-8, result);  // -5 + -3 应该等于 -8
    }

    @Test
    public void testAddPositiveAndNegative() {
        // 测试正数和负数相加
        int result = add(5, -3);
        assertEquals(2, result);  // 5 + -3 应该等于 2
    }

    @Test
    public void testAddZero() {
        // 测试加零的情况
        int result = add(5, 0);
        assertEquals(5, result);  // 5 + 0 应该等于 5
    }

    @Test
    public void testAddBothZeros() {
        // 测试两个零相加
        int result = add(0, 0);
        assertEquals(0, result);  // 0 + 0 应该等于 0
    }
}