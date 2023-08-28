
package ds;
import org.junit.Test;
import static org.junit.Assert.*;

public class IdentifierTest9 {

    @Test
    public void testValidIdentifier() {
        Identifier identifier = new Identifier();
        
        assertTrue(identifier.validateIdentifier("abcde"));
    }

    @Test
    public void testInvalidIdentifier() {
        Identifier identifier = new Identifier();
        
        assertFalse(identifier.validateIdentifier("abcde#"));
    }

    @Test
    public void testIdentifierWithOnlyOneCharacter() {
        Identifier identifier = new Identifier();
        
        assertTrue(identifier.validateIdentifier("a"));
    }

    @Test
    public void testEmptyIdentifier() {
        Identifier identifier = new Identifier();
        
        assertFalse(identifier.validateIdentifier(""));
    }

    @Test
    public void testIdentifierWithSixCharacters() {
        Identifier identifier = new Identifier();
        
        assertFalse(identifier.validateIdentifier("abcdef"));
    }
}
