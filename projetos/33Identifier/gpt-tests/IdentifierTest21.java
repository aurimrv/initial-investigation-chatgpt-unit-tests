package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class IdentifierTest21{


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
    public void testLongIdentifier() {
        Identifier identifier = new Identifier();
        assertFalse(identifier.validateIdentifier("abcdefg"));
    }

    @Test
    public void testValidIdentifierWithDigits() {
        Identifier identifier = new Identifier();
        assertTrue(identifier.validateIdentifier("abc123"));
    }

    @Test
    public void testValidIdentifierWithUpperCase() {
        Identifier identifier = new Identifier();
        assertTrue(identifier.validateIdentifier("Abc"));
    }

    @Test
    public void testValidIdentifierWithLowerCase() {
        Identifier identifier = new Identifier();
        assertTrue(identifier.validateIdentifier("abc"));
    }

    @Test
    public void testInvalidIdentifierWithSpecialCharacter() {
        Identifier identifier = new Identifier();
        assertFalse(identifier.validateIdentifier("abc!"));
    }
}