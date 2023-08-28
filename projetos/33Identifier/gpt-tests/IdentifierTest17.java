package ds;import static org.junit.Assert.*;
import org.junit.Test;

public class IdentifierTest17{


    @Test
    public void testValidIdentifier() {
        Identifier identifier = new Identifier();
        assertTrue(identifier.validateIdentifier("hello"));
        assertTrue(identifier.validateIdentifier("abcde"));
        assertTrue(identifier.validateIdentifier("A1b2C"));
    }

    @Test
    public void testInvalidIdentifier() {
        Identifier identifier = new Identifier();
        assertFalse(identifier.validateIdentifier(""));
        assertFalse(identifier.validateIdentifier("a"));
        assertFalse(identifier.validateIdentifier("12345"));
        assertFalse(identifier.validateIdentifier("abcde6"));
        assertFalse(identifier.validateIdentifier("A$C"));
    }

    @Test
    public void testNullIdentifier() {
        Identifier identifier = new Identifier();
        assertFalse(identifier.validateIdentifier(null));
    }
}