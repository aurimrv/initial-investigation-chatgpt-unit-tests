
package ds;import ds.Identifier;
import org.junit.Test;
import static org.junit.Assert.*;

public class IdentifierTest8 {
@Test
public void testValidateIdentifier_NullString() {
    Identifier identifier = new Identifier();
    boolean result = identifier.validateIdentifier(null);
    assertFalse(result);
}


@Test
public void testValidateIdentifier_EmptyString() {
    Identifier identifier = new Identifier();
    boolean result = identifier.validateIdentifier("");
    assertFalse(result);
}


@Test
public void testValidateIdentifier_ValidSingleCharacter() {
    Identifier identifier = new Identifier();
    boolean result = identifier.validateIdentifier("a");
    assertTrue(result);
}

@Test
public void testValidateIdentifier_ValidIdentifier() {
    Identifier identifier = new Identifier();
    boolean result = identifier.validateIdentifier("hello");
    assertTrue(result);
}


@Test
public void testValidateIdentifier_InvalidStartsWithDigit() {
    Identifier identifier = new Identifier();
    boolean result = identifier.validateIdentifier("1hello");
    assertFalse(result);
}


@Test
public void testValidateIdentifier_InvalidSpecialCharacter() {
    Identifier identifier = new Identifier();
    boolean result = identifier.validateIdentifier("hello@world");
    assertFalse(result);
}


@Test
public void testValidateIdentifier_InvalidLength() {
    Identifier identifier = new Identifier();
    boolean result = identifier.validateIdentifier("helloworld");
    assertFalse(result);
}
}
