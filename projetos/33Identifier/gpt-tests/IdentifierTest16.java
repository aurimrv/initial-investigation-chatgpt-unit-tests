package ds;import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class IdentifierTest16{

    private Identifier identifier;

    @Before
    public void setUp() {
        identifier = new Identifier();
    }

    @Test
    public void testValidIdentifier() {
        assertTrue(identifier.validateIdentifier("abc"));
    }

    @Test
    public void testInvalidIdentifier() {
        assertFalse(identifier.validateIdentifier("123"));
    }

    @Test
    public void testEmptyIdentifier() {
        assertFalse(identifier.validateIdentifier(""));
    }

    @Test
    public void testIdentifierLengthLessThanOne() {
        assertFalse(identifier.validateIdentifier("a"));
    }

    @Test
    public void testIdentifierLengthGreaterThanFive() {
        assertFalse(identifier.validateIdentifier("abcdef"));
    }

    @Test
    public void testIdentifierWithValidFirstCharacter() {
        assertTrue(identifier.validateIdentifier("a123"));
    }

    @Test
    public void testIdentifierWithInvalidFirstCharacter() {
        assertFalse(identifier.validateIdentifier("123a"));
    }
}