package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class IdentifierTest20{


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
    public void testNullString() {
        Identifier identifier = new Identifier();
        assertFalse(identifier.validateIdentifier(null));
    }

    @Test
    public void testValidSingleCharacterIdentifier() {
        Identifier identifier = new Identifier();
        assertTrue(identifier.validateIdentifier("a"));
    }

    @Test
    public void testInvalidSingleCharacterIdentifier() {
        Identifier identifier = new Identifier();
        assertFalse(identifier.validateIdentifier("1"));
    }

    @Test
    public void testValidLongIdentifier() {
        Identifier identifier = new Identifier();
        assertTrue(identifier.validateIdentifier("abc123"));
    }

    @Test
    public void testInvalidLongIdentifier() {
        Identifier identifier = new Identifier();
        assertFalse(identifier.validateIdentifier("abc1234"));
    }
}