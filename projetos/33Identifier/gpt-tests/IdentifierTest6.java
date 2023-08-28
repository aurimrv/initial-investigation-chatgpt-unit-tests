package ds;import static org.junit.Assert.*;
import org.junit.Test;
import ds.Identifier;

public class IdentifierTest6 {
@Test
public void testValidIdentifierLength1() {
    Identifier identifier = new Identifier();
    boolean result = identifier.validateIdentifier("a");
    assertTrue(result);
}

@Test
public void testValidIdentifierLength5() {
    Identifier identifier = new Identifier();
    boolean result = identifier.validateIdentifier("abcde");
    assertTrue(result);
}


@Test
public void testInvalidIdentifierLength0() {
    Identifier identifier = new Identifier();
    boolean result = identifier.validateIdentifier("");
    assertFalse(result);
}


@Test
public void testInvalidIdentifierLength6() {
    Identifier identifier = new Identifier();
    boolean result = identifier.validateIdentifier("abcdef");
    assertFalse(result);
}

@Test
public void testInvalidIdentifierWithSpecialCharacters() {
    Identifier identifier = new Identifier();
    boolean result = identifier.validateIdentifier("ab@cde");
    assertFalse(result);
}


@Test
public void testInvalidIdentifierStartingWithNumber() {
    Identifier identifier = new Identifier();
    boolean result = identifier.validateIdentifier("1abc");
    assertFalse(result);
}


@Test
public void testValidIdentifierStartingWithLowercaseLetter() {
    Identifier identifier = new Identifier();
    boolean result = identifier.validateIdentifier("abc");
    assertTrue(result);
}


@Test
public void testValidIdentifierStartingWithUppercaseLetter() {
    Identifier identifier = new Identifier();
    boolean result = identifier.validateIdentifier("Abc");
    assertTrue(result);
}
}
