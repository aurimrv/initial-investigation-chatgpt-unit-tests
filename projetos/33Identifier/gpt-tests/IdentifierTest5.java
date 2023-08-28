
package ds;import ds.Identifier;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class IdentifierTest5 {

    @Test
    public void testValidIdentifier() {
        Identifier identifier = new Identifier();
        boolean result = identifier.validateIdentifier("Test");
        assertEquals(true, result);
    }

    @Test
    public void testInvalidIdentifier() {
        Identifier identifier = new Identifier();
        boolean result = identifier.validateIdentifier("123Test");
        assertEquals(false, result);
    }

    @Test
    public void testEmptyIdentifier() {
        Identifier identifier = new Identifier();
        boolean result = identifier.validateIdentifier("");
        assertEquals(false, result);
    }

    @Test
    public void testNullIdentifier() {
        Identifier identifier = new Identifier();
        boolean result = identifier.validateIdentifier(null);
        assertEquals(false, result);
    }

    @Test
    public void testMinLengthIdentifier() {
        Identifier identifier = new Identifier();
        boolean result = identifier.validateIdentifier("A");
        assertEquals(true, result);
    }

    @Test
    public void testMaxLengthIdentifier() {
        Identifier identifier = new Identifier();
        boolean result = identifier.validateIdentifier("AbCdEf");
        assertEquals(true, result);
    }

    @Test
    public void testInvalidFirstChar() {
        Identifier identifier = new Identifier();
        boolean result = identifier.validateIdentifier("1Test");
        assertEquals(false, result);
    }

    @Test
    public void testInvalidChar() {
        Identifier identifier = new Identifier();
        boolean result = identifier.validateIdentifier("Te@st");
        assertEquals(false, result);
    }
}