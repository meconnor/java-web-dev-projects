package org.launchcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedBracketsTest {
    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void testEmptyString() {
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }

    @Test
    public void testOnlyBrackets() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[]]"));
        assertFalse(BalancedBrackets.hasBalancedBrackets("[[[]"));
        assertFalse(BalancedBrackets.hasBalancedBrackets("[]]"));
    }

    @Test
    public void testNonBracketCharacters() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch[Code]"));
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch[C[]o]de"));
        assertFalse(BalancedBrackets.hasBalancedBrackets("La[un]ch]Code["));
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch]Co]de["));
    }

    @Test
    public void testNestedBrackets() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[Launch[Code]]"));
        assertFalse(BalancedBrackets.hasBalancedBrackets("[[Launch]Code[]"));
    }

    @Test
    public void testMixedBrackets() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[Launch]Code[Java]"));
        assertFalse(BalancedBrackets.hasBalancedBrackets("[Launch]Code[Java]]"));
    }

    @Test
    public void testUnbalancedBrackets() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[Launch[Code]"));
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch]Code["));
    }

    @Test
    public void testMultiplePairsOfBrackets() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[Launch][Code]"));
        assertTrue(BalancedBrackets.hasBalancedBrackets("[][]LaunchCode[][]"));
        assertFalse(BalancedBrackets.hasBalancedBrackets("[[Launch][Code]]"));
    }

    @Test
    public void testBracketsInsideNonBracketText() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("Hello [LaunchCode] World"));
        assertFalse(BalancedBrackets.hasBalancedBrackets("Hello [LaunchCode World"));
    }

    @Test
    public void testBracketsWithOtherCharacters() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("x[y]z"));
        assertTrue(BalancedBrackets.hasBalancedBrackets("x[y[z]]"));
        assertFalse(BalancedBrackets.hasBalancedBrackets("x[yz"));
    }

    @Test
    public void testMixedBracketsWithSpaces() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[ Launch ] Code"));
        assertFalse(BalancedBrackets.hasBalancedBrackets("[Launch ] Code["));
    }

    @Test
    public void testBracketsWithEscapedBrackets() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[Launch\\[Code\\]]"));
        assertFalse(BalancedBrackets.hasBalancedBrackets("[Launch\\[Code]]"));
    }

    @Test
    public void testBracketsWithDifferentBracketTypes() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("{[Launch]Code}"));
        assertFalse(BalancedBrackets.hasBalancedBrackets("{[Launch]Code"));
    }
}