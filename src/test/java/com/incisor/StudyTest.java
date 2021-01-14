package com.incisor;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class StudyTest {
    @Fast
    void test() {
        System.out.println("StudyTest.test()");
    }

    static class SubTest1{
        @Test
        void test1() {
            System.out.println("SubTest1.test1()");
        }
    }
}

class Test2 {
    @Test
    void test2() {
        System.out.println("Test2.test2()");
    }
}
