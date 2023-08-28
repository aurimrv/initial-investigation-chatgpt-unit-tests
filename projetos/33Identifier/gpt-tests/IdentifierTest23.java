package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class IdentifierTest23{


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
    public void testEmptyString() {
        Identifier identifier = new Identifier();
        assertFalse(identifier.validateIdentifier(""));
    }

    @Test
    public void testSingleCharacter() {
        Identifier identifier = new Identifier();
        assertTrue(identifier.validateIdentifier("a"));
    }

    @Test
    public void testMaxLengthIdentifier() {
        Identifier identifier = new Identifier();
        assertTrue(identifier.validateIdentifier("abcdef"));
    }

    @Test
    public void testInvalidFirstCharacter() {
        Identifier identifier = new Identifier();
        assertFalse(identifier.validateIdentifier("1abc"));
    }

    @Test
    public void testInvalidCharacterInMiddle() {
        Identifier identifier = new Identifier();
        assertFalse(identifier.validateIdentifier("ab$c"));
    }

    @Test
    public void testInvalidLastCharacter() {
        Identifier identifier = new Identifier();
        assertFalse(identifier.validateIdentifier("abc!"));
    }
}