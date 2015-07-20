package com.example.unittestcoverageexample;

import org.junit.Test;

import static org.junit.Assert.fail;

/**
 * Created by agami on 13/07/2015.
 */
public class UtilityTest {

    @Test
    public void testDummyUtilityMethod() {
        boolean actualValue = Utility.dummyUtilityMethod();

        if(!actualValue) {
            fail("Dummy utility method fail");
        }
    }
}
