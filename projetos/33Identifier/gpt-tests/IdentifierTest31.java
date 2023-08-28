package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class IdentifierTest31{


    @Test
    public void testValidIdentifier() {
        Identifier identifier = new Identifier();
        assertTrue(identifier.validateIdentifier("abc"));
        assertTrue(identifier.validateIdentifier("Abc"));
        assertTrue(identifier.validateIdentifier("a1b2c"));
    }

    @Test
    public void testInvalidIdentifier() {
        Identifier identifier = new Identifier();
        assertFalse(identifier.validateIdentifier(""));
        assertFalse(identifier.validateIdentifier("123"));
        assertFalse(identifier.validateIdentifier("abc123"));
        assertFalse(identifier.validateIdentifier("ABC"));
        assertFalse(identifier.validateIdentifier("a_b_c"));
    }

    @Test
    public void testNullIdentifier() {
        Identifier identifier = new Identifier();
        assertFalse(identifier.validateIdentifier(null));
    }
}