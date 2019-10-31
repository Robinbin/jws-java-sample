package com.jws.samples.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringHelperTest {

    @Test
    public void reverse() {
        assertEquals(StringHelper.reverse("abcd"), "dcba");
    }
}