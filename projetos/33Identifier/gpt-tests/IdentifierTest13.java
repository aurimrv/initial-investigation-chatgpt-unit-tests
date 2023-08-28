package ds;import ds.Identifier;
import org.junit.Assert;
import org.junit.Test;

public class IdentifierTest13{


    @Test
    public void testValidIdentifier() {
        Identifier identifier = new Identifier();
        boolean result = identifier.validateIdentifier("valid");
        Assert.assertTrue(result);
    }

    @Test
    public void testInvalidIdentifier() {
        Identifier identifier = new Identifier();
        boolean result = identifier.validateIdentifier("invalid!");
        Assert.assertFalse(result);
    }

    @Test
    public void testEmptyIdentifier() {
        Identifier identifier = new Identifier();
        boolean result = identifier.validateIdentifier("");
        Assert.assertFalse(result);
    }

    @Test
    public void testIdentifierLengthGreaterThanFive() {
        Identifier identifier = new Identifier();
        boolean result = identifier.validateIdentifier("abcdef");
        Assert.assertFalse(result);
    }

    @Test
    public void testFirstCharacterNotValid() {
        Identifier identifier = new Identifier();
        boolean result = identifier.validateIdentifier("1valid");
        Assert.assertFalse(result);
    }

    @Test
    public void testInvalidCharacterInMiddle() {
        Identifier identifier = new Identifier();
        boolean result = identifier.validateIdentifier("val!id");
        Assert.assertFalse(result);
    }

    @Test
    public void testLastCharacterNotValid() {
        Identifier identifier = new Identifier();
        boolean result = identifier.validateIdentifier("valid1");
        Assert.assertFalse(result);
    }
}