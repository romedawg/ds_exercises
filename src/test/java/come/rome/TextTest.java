package come.rome;

import com.rome.exercises.text.TextManipulation;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TextTest {

    TextManipulation text;

    @BeforeEach
    void Setup(){
        text = new TextManipulation();
    }

    @Test
    @DisplayName("testing reverseText function")
    void testReverstText(){
        Assertions.assertEquals("oyoy", text.ReverseString("yoyo"), "testing yoyo string");
        Assertions.assertEquals("nam", text.ReverseString("man"), "testing man string");
        Assertions.assertEquals("ko", text.ReverseString("ok"), "testing ok string");
    }

    @Test
    @DisplayName("testing vowelCount funciton")
    void testVowelCount(){
        Assertions.assertEquals(1, text.countVowels("job"), "vowel count wrong, should be 1");
        Assertions.assertEquals(2, text.countVowels("steam"), "vowel count wrong, should be 2");
        Assertions.assertEquals(2, text.countVowels("turkey"), "vowel count wrong, should be 3");
    }

    @Test
    @DisplayName("test remove punctuations")
    void removePunctuations(){
        Assertions.assertEquals("Blah", text.removePunctuations("Blah!?"), "testing Blah!?");
        Assertions.assertEquals("turkeys", text.removePunctuations("turkey's"), "testing turkey's");
        Assertions.assertEquals("brackets", text.removePunctuations("[brackets]"), "testing turkey's");
    }
}
