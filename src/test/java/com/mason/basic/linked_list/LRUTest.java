package com.mason.basic.linked_list;

import org.junit.Test;

import java.util.Random;

/**
 * Created by mwu on 2020/9/1
 */
public class LRUTest {

    private final Random random = new Random();

    @Test
    public void testLRU() {
        LRU lru = new LRU(10);
        for (int i = 0; i < 20; i++) {
            int visitValue = random.nextInt(20) + 1;
            System.out.println("Visit value:" + visitValue + ", result:" + lru.visit(visitValue));
            System.out.println(lru);
        }
    }
}