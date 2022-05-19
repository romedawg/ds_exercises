package come.rome;

import com.rome.exercises.Bigrams;
import com.rome.exercises.numbers.GooseIsland;
import com.rome.exercises.text.TextManipulation;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ThreeOneTwoTest {

    GooseIsland gooseIsland = new GooseIsland();

    @BeforeEach
    void Setup(){
        gooseIsland = new GooseIsland();
    }

    // [3,1,2] => [3,1,2]
    // [1,2,3] => [3,1,2]
    // [2,1,3] => [3,1,2]
    // [1,1,1,2,2,2,3,3,3] => [3,3,3,1,1,1,2,2,2]
    // [1,2,1,2,1,2,3] => [3,1,1,1,2,2,2]
    @Test
    @DisplayName("312 testing")
    void testSort312(){
        int[] threeOneTwo2 = {1,2,3};
        int[] bb = {3,1,2};
        Assertions.assertArrayEquals(bb, gooseIsland.sortIt(threeOneTwo2), "testing 3, 1, 2");
        Assertions.assertArrayEquals(new int[]{3,1,2}, gooseIsland.sortIt(new int[]{1,2,3}), "testing 1,2,3");
        Assertions.assertArrayEquals(new int[]{3,1,2}, gooseIsland.sortIt(new int[]{2,3,1}), "testing 2,1,3");
        Assertions.assertArrayEquals(new int[]{3,3,3,1,1,1,2,2,2}, gooseIsland.sortIt(new int[]{1,1,1,2,2,2,3,3,3}), "testing 1,1,1,2,2,2,3,3,3");
        Assertions.assertArrayEquals(new int[]{3,1,1,1,2,2,2}, gooseIsland.sortIt(new int[]{1,2,1,2,1,2,3}), "testing 3,3,3,1,1,1,2,2,2");
    }
}
