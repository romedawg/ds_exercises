import static org.junit.Assert.*;

import org.junit.*;
import org.junit.runner.*;

class Palindrome {

/**
* Implement a function that will return boolean (true/false)
* to determine whether the passed input string is or is not a palindrome.
*
* Palindromes are strings that read the same forwards and backwards,
* ignoring case, spacing, and punctuation.
*
* Examples of Palindromes:
*
*  * aaa
*  * abba
*  * A Man, A Plan, A Canal: Panama!
*  * Jelenovi pivo nelej!
*
* Whereas `abc` would not be a palindrome because a != c.
*
* See the test cases for examples of expected palindromes.
  */
  public static boolean isPalindrome(String str) {
  // Implement me.
  return false;
  }
  }

/**
* Below are all of the tests that will be run against your solution.
  */
  public class Solution {
  @Test
  public void tests() {
  assertFalse(Palindrome.isPalindrome(null));
  assertFalse(Palindrome.isPalindrome(""));
  assertFalse(Palindrome.isPalindrome("!@#$%^&*(){}[].,;:<>?/\\|"));
  assertFalse(Palindrome.isPalindrome("abcdefg"));
  assertFalse(Palindrome.isPalindrome("this is not a palindrome"));
  assertTrue(Palindrome.isPalindrome("a"));
  assertTrue(Palindrome.isPalindrome("aba"));
  assertTrue(Palindrome.isPalindrome("abba"));
  assertTrue(Palindrome.isPalindrome("aabbaa7667aabbaa"));
  assertTrue(Palindrome.isPalindrome("A Man, A Plan, A Canal: Panama!"));
  }

public static void main(String[] args) {
JUnitCore.main("Solution");
}
}