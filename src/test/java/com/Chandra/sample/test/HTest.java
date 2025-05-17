package com.Chandra.sample;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class HTest {

    @Test
    public void testSayHello() {
        HelloWorld hw = new HelloWorld();
        assertEquals("Hello, World!", hw.sayHello());
    }
}

