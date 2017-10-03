package com.artsam.app;

import com.artsam.app.tools.MyBundleControl;
import junit.framework.TestCase;

import java.util.Locale;
import java.util.ResourceBundle;

public class GreeterTest extends TestCase {

    public void testGetEnGreetingFromRes() throws Exception {
        Locale.setDefault(new Locale("en", "US"));
        ResourceBundle bundle = ResourceBundle.getBundle("greetings");

        assertEquals("Good morning, World!", bundle.getString("good_morning"));
    }

    public void testGetRuGreetingFromRes() throws Exception {
        Locale.setDefault(new Locale("ru", "UA"));
        ResourceBundle bundle = ResourceBundle.getBundle("greetings", new MyBundleControl());

        assertEquals("Доброе утро, Мир!", bundle.getString("good_morning"));
    }



    public void testMsgShouldBePrinted() throws Exception {
        assertTrue(true);
    }
}