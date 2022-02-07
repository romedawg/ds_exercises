package come.rome;

import com.rome.exercises.TextManipulation;
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
        Assertions.assertEquals(1, text.countVowels("job"), "testing job string");
        Assertions.assertEquals(2, text.countVowels("steam"), "testing job string");
        Assertions.assertEquals(3, text.countVowels("turkey"), "testing job string");
    }
}
