package edu.MilaPetrova.advancedJava;
import org.junit.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import static junit.framework.Assert.assertEquals;

/**
 * Unit test for simple App.
 */
public class AppTest {
    @Test
    public void testApp1() {
        App app = new App("low");
        assertEquals(Double.doubleToLongBits(app.creditLine), Double.doubleToLongBits(1000.00));
    }
    @Test
    public void testApp2() {
        App app = new App("medium");
        assertEquals(Double.doubleToLongBits(app.creditLine), Double.doubleToLongBits(2000.00));
    }
    @Test
    public void testApp3() {
        App app = new App("high");
        assertEquals(Double.doubleToLongBits(app.creditLine), Double.doubleToLongBits(3000.00));
    }
    @Test
    public void testApp4() {
        App app = new App("test");
        assertEquals(Double.doubleToLongBits(app.creditLine), Double.doubleToLongBits(0.00));
    }

    @Test
    public void testSendMessage1() {
        App app = new App("low");
        String actualMessage = app.sendMessage(app.creditLine);
        String expectedMessage = "Y";
        assertEquals(actualMessage,expectedMessage);
    }
    @Test
    public void testSendMessage2() {
        App app = new App("medium");
        String actualMessage = app.sendMessage(app.creditLine);
        String expectedMessage = "Y";
        assertEquals(actualMessage,expectedMessage);
    }
    @Test
    public void testSendMessage3() {
        App app = new App("high");
        String actualMessage = app.sendMessage(app.creditLine);
        String expectedMessage = "N";
        assertEquals(actualMessage,expectedMessage);
    }
    @Test
    public void testSendMessage4() {
        App app = new App("test");
        String actualMessage = app.sendMessage(app.creditLine);
        String expectedMessage = "N";
        assertEquals(actualMessage,expectedMessage);
    }
}
