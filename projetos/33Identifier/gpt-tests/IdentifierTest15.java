package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class IdentifierTest15{


    @Test
    public void testValidIdentifier() {
        Identifier identifier = new Identifier();
        assertTrue(identifier.validateIdentifier("abc"));
        assertTrue(identifier.validateIdentifier("Abc"));
        assertTrue(identifier.validateIdentifier("a1b2c"));
        assertTrue(identifier.validateIdentifier("A1B2C"));
    }

    @Test
    public void testInvalidIdentifier() {
        Identifier identifier = new Identifier();
        assertFalse(identifier.validateIdentifier(""));
        assertFalse(identifier.validateIdentifier("a"));
        assertFalse(identifier.validateIdentifier("123"));
        assertFalse(identifier.validateIdentifier("Abcdefg"));
    }

    @Test
    public void testNullIdentifier() {
        Identifier identifier = new Identifier();
        assertFalse(identifier.validateIdentifier(null));
    }
}