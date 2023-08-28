
package ds;import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;
import ds.Identifier;

public class IdentifierTest10 {
    private Identifier identifier;

    @Before
    public void setup() {
        identifier = new Identifier();
    }

    @Test
    public void testValidIdentifier() {
        boolean result = identifier.validateIdentifier("java");
        assertEquals(true, result);
    }

    @Test
    public void testInvalidIdentifier_SpecialCharacter() {
        boolean result = identifier.validateIdentifier("@java");
        assertEquals(false, result);
    }

    @Test
    public void testInvalidIdentifier_Length() {
        boolean result = identifier.validateIdentifier("abcdabcdabcd");
        assertEquals(false, result);
    }

    @Test
    public void testInvalidIdentifier_StartsWithNumber() {
        boolean result = identifier.validateIdentifier("1Java");
        assertEquals(false, result);
    }

    @Test
    public void testInvalidIdentifier_ContainsInvalidCharacter() {
        boolean result = identifier.validateIdentifier("j$a_va");
        assertEquals(false, result);
    }
}