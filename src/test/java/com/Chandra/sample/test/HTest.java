package com.Chandra.sample;
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
