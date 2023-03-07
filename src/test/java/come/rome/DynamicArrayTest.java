package come.rome;

import com.rome.exercises.DynamicArray.DynamicArray;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class DynamicArrayTest {

    DynamicArray dynamicArray = new DynamicArray();

    @BeforeEach
    void Setup(){
        dynamicArray = new DynamicArray();
    }

    @Test
    @DisplayName("Dynamic Array Test")
    void TestDynamicArrays(){
        dynamicArray.Add("a");
        Assertions.assertEquals("a", dynamicArray.Get(0), "value should be a");
        Assertions.assertEquals(1, dynamicArray.Size(), "size should be 1");
        dynamicArray.Add("b");
        Assertions.assertEquals("b", dynamicArray.Get(1), "value should be b");
        Assertions.assertEquals(2, dynamicArray.Size(), "size should be 2");
        dynamicArray.Add("c");
        Assertions.assertEquals("c", dynamicArray.Get(2), "value should be c");
        Assertions.assertEquals(3, dynamicArray.Size(), "size should be 3");

    }
}
