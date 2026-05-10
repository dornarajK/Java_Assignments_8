package UnitTesting_8_1;

import org.example.UnitTesting_8_1.StringManipulator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StringManipulatorTest {

    private final StringManipulator manipulator = new StringManipulator();

    @Test
    void testConcatenate() {

        assertEquals("HelloWorld", manipulator.concatenate("Hello", "World"));
        assertEquals("Hello", manipulator.concatenate("Hello", ""));
        assertEquals("", manipulator.concatenate("", ""));
        assertEquals("test", manipulator.concatenate(null, "test"));
    }

    @Test
    void testFindLength() {
        assertEquals(5, manipulator.findLength("Hello"));
        assertEquals(0, manipulator.findLength(""));
        assertEquals(0, manipulator.findLength(null));
    }

    @Test
    void testConvertToUpperCase() {
        assertEquals("HELLO", manipulator.convertToUpperCase("Hello"));
        assertEquals("", manipulator.convertToUpperCase(""));
        assertNull(manipulator.convertToUpperCase(null));
    }

    @Test
    void testConvertToLowerCase() {
        assertEquals("hello", manipulator.convertToLowerCase("Hello"));
        assertEquals("", manipulator.convertToLowerCase(""));
        assertNull(manipulator.convertToLowerCase(null));
    }

    @Test
    void testContainsSubstring() {
        assertTrue(manipulator.containsSubstring("Hello World", "World"));
        assertFalse(manipulator.containsSubstring("Hello World", "world"));
        assertFalse(manipulator.containsSubstring(null, "test"));
        assertFalse(manipulator.containsSubstring("test", null));
        assertTrue(manipulator.containsSubstring("", ""));
    }
}