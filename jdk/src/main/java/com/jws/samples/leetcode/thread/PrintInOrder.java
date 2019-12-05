package com.jws.samples.leetcode.thread;

import static java.lang.System.out;

/**
 * 题目来源：https://leetcode-cn.com/problems/print-in-order
 */
public class PrintInOrder {

    
    class Foo {
        public void one() {
            out.print("one");
        }

        public void two() {
            out.print("two");
        }

        public void three() {
            out.print("three");
        }
    }
}