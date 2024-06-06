package com.techcruz.arappformonuments;

import static org.junit.Assert.assertEquals;

import android.content.Context;


import androidx.test.InstrumentationRegistry;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {
    private androidx.test.InstrumentationRegistry InstrumentationRegistry;

    @Test
    public void useAppContext() {
        // Context of the app under test.
        Context appContext = androidx.test.InstrumentationRegistry.getInstrumentation().getTargetContext();
        assertEquals("com.techcruz.arappformonuments", appContext.getPackageName());
    }
}