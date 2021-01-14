package com.incisor;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.*;

import org.junit.jupiter.api.*;

public class StandardTests {
    @BeforeAll
    static void initAll() {
        System.out.println("initAll()");
    }

    @BeforeEach
    void init() {
        System.out.println("init()");
    }

    @Test
    void succeedingTest() {
        System.out.println("succeedingTest()");
    }

    @Test
    void failingTest() {
        fail("failingTest()");
    }

    @Test
    @Disabled("disabled")
    void skippedTest() {
        System.out.println("skippedTest()");
    }

    @Test
    void abortedTest() {
        assumeTrue("abc".contains("Z"));
        fail("abortedTest()");
    }

    @AfterEach
    void tearDown() {
        System.out.println("tearDown()");
    }

    @AfterAll
    static void tearDownAll() {
        System.out.println("tearDownAll()");
    }
}
