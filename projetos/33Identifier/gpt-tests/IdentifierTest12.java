package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class IdentifierTest12{


    @Test
    public void testValidIdentifier() {
        Identifier identifier = new Identifier();
        assertTrue(identifier.validateIdentifier("abc"));
        assertTrue(identifier.validateIdentifier("Abc"));
        assertTrue(identifier.validateIdentifier("a123"));
        assertTrue(identifier.validateIdentifier("A123"));
    }

    @Test
    public void testInvalidIdentifier() {
        Identifier identifier = new Identifier();
        assertFalse(identifier.validateIdentifier(""));
        assertFalse(identifier.validateIdentifier("a"));
        assertFalse(identifier.validateIdentifier("A"));
        assertFalse(identifier.validateIdentifier("1"));
        assertFalse(identifier.validateIdentifier("abc123"));
        assertFalse(identifier.validateIdentifier("ABC123"));
    }

    @Test
    public void testNullIdentifier() {
        Identifier identifier = new Identifier();
        assertFalse(identifier.validateIdentifier(null));
    }
}