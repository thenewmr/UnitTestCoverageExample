package com.example.unittestcoverageexample;

import android.test.AndroidTestCase;

/**
 * Created by agami on 25/06/2015.
 */
public class MainActivityTest extends AndroidTestCase {

    public void testDummyMethod() {
        boolean actualValue = MainActivity.dummyMethod();

        assertEquals(true, actualValue);
    }
}
