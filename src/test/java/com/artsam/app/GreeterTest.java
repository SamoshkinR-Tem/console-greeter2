package com.artsam.app;

import com.artsam.app.tools.MyBundleControl;
import junit.framework.TestCase;

import java.util.Locale;
import java.util.ResourceBundle;

public class GreeterTest extends TestCase {

    public void testGetMsgFromRes() throws Exception {
        String greetingText;
        ResourceBundle bundle = ResourceBundle.getBundle(
                "bundle", new Locale("en","US"), new MyBundleControl());

        greetingText = bundle.getString("good_morning");

        assertEquals("Good morning, World!", greetingText);
    }

    public void testMsgShouldBePrinted() throws Exception {
        assertTrue(true);
    }
}