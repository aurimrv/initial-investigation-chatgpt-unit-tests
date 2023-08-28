package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class IdentifierTest32{


    @Test
    public void testValidIdentifier() {
        Identifier identifier = new Identifier();
        assertTrue(identifier.validateIdentifier("abc"));
    }

    @Test
    public void testInvalidIdentifier() {
        Identifier identifier = new Identifier();
        assertFalse(identifier.validateIdentifier("123"));
    }

    @Test
    public void testEmptyIdentifier() {
        Identifier identifier = new Identifier();
        assertFalse(identifier.validateIdentifier(""));
    }

    @Test
    public void testNullIdentifier() {
        Identifier identifier = new Identifier();
        assertFalse(identifier.validateIdentifier(null));
    }

    @Test
    public void testIdentifierLengthLessThanOne() {
        Identifier identifier = new Identifier();
        assertFalse(identifier.validateIdentifier("a"));
    }

    @Test
    public void testIdentifierLengthGreaterThanFive() {
        Identifier identifier = new Identifier();
        assertFalse(identifier.validateIdentifier("abcdef"));
    }

    @Test
    public void testIdentifierWithSpecialCharacters() {
        Identifier identifier = new Identifier();
        assertFalse(identifier.validateIdentifier("abc$"));
    }

    @Test
    public void testIdentifierWithValidFirstCharacterButInvalidFollowingCharacters() {
        Identifier identifier = new Identifier();
        assertFalse(identifier.validateIdentifier("a1b2c3"));
    }

    @Test
    public void testIdentifierWithValidFirstCharacterAndValidFollowingCharacters() {
        Identifier identifier = new Identifier();
        assertTrue(identifier.validateIdentifier("a1b2c"));
    }
}