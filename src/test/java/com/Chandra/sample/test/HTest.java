package com.Chandra.sample;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class HelloWorldTest {

    @Test
    public void testGreeting() {
        String greeting = getGreeting();
        assertEquals("Hello, World!", greeting);
    }

    // Example method to test
    public String getGreeting() {
        return "Hello, World!";
    }
}
