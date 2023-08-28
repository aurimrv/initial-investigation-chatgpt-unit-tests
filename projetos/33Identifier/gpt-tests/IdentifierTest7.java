
package ds;import ds.Identifier;
import org.junit.Test;
import static org.junit.Assert.*;

public class IdentifierTest7 {

    @Test
    public void testValidIdentifier() {
        Identifier identifier = new Identifier();
        assertTrue(identifier.validateIdentifier("valid"));
    }

    @Test
    public void testInvalidFirstCharacter() {
        Identifier identifier = new Identifier();
        assertFalse(identifier.validateIdentifier("9invalid"));
    }

    @Test
    public void testInvalidCharacter() {
        Identifier identifier = new Identifier();
        assertFalse(identifier.validateIdentifier("in*valid"));
    }

    @Test
    public void testShortIdentifier() {
        Identifier identifier = new Identifier();
        assertFalse(identifier.validateIdentifier("a"));
    }

    @Test
    public void testLongIdentifier() {
        Identifier identifier = new Identifier();
        assertFalse(identifier.validateIdentifier("verylong"));
    }

    @Test
    public void testEmptyIdentifier() {
        Identifier identifier = new Identifier();
        assertFalse(identifier.validateIdentifier(""));
    }

}
