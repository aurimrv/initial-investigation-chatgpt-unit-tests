
package ds;import static org.junit.Assert.*;
import org.junit.Test;
import ds.Identifier;

public class IdentifierTest0 {

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
    public void testValidFirstCharacter() {
        Identifier identifier = new Identifier();
        assertTrue(identifier.valid_s('A'));
    }

    @Test
    public void testInvalidFirstCharacter() {
        Identifier identifier = new Identifier();
        assertFalse(identifier.valid_s('1'));
    }

    @Test
    public void testValidFollowingCharacter() {
        Identifier identifier = new Identifier();
        assertTrue(identifier.valid_f('a'));
    }

    @Test
    public void testInvalidFollowingCharacter() {
        Identifier identifier = new Identifier();
        assertFalse(identifier.valid_f('$'));
    }
}