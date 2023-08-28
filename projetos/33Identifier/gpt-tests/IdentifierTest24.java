package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class IdentifierTest24{


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
    public void testLongIdentifier() {
        Identifier identifier = new Identifier();
        assertFalse(identifier.validateIdentifier("abcdefg"));
    }

    @Test
    public void testValidIdentifierWithNumbers() {
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
}