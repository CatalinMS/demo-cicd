package com.catalinms.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DemoControllerTest {

    @Test
    public void demoTestPass() {
        assertEquals(1, 1);
    }

    @Test
    public void demoTestFail() {
        assertEquals(1, 2);
    }

}
