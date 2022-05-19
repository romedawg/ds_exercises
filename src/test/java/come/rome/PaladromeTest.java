package come.rome;

import com.rome.exercises.numbers.GooseIsland;

import com.rome.exercises.text.Paladrome;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class PaladromeTest {

    Paladrome paladrome = new Paladrome();

    @BeforeEach
    void Setup(){
        paladrome = new Paladrome();
    }

    /*
    *  * aaa
    *  * abba
    *  * A Man, A Plan, A Canal: Panama!
    *  * Jelenovi pivo nelej!
    */
    @Test
    @DisplayName("testing Paladrom")
    void testVowelCount(){
        Assertions.assertEquals(true, Paladrome.isPaladrome("A Man, A Plan, A Canal: Panama!"), "A Man, A Plan, A Canal: Panama! is incorrect");
        Assertions.assertEquals(true, Paladrome.isPaladrome("abba"), "abba is incorrect");
        Assertions.assertEquals(true, Paladrome.isPaladrome("aaa"), "aaa");
        Assertions.assertEquals(false, Paladrome.isPaladrome("abc"), "abc is incorrect");

    }
}
