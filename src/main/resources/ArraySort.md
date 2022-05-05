import static org.junit.Assert.*;

import org.junit.*;
import org.junit.runner.*;

class GooseIsland {

    // The integer array passed in with be a combination of the numbers 3, 1, and 2, in any order.
    // You may assume valid input. That is, there will be no other numbers present in the numbers array, although
    // numbers may be duplicated.
    //
    // Your task is to sort the numbers in the order of 3s first, then 1s, then 2s. Like the Beer, 312.
    // Some examples inputs and the expected sort order after sorting:
    //
    // [3,1,2] => [3,1,2]
    // [1,2,3] => [3,1,2]
    // [2,1,3] => [3,1,2]
    // [1,1,1,2,2,2,3,3,3] => [3,3,3,1,1,1,2,2,2]
    // [1,2,1,2,1,2,3] => [3,1,1,1,2,2,2]
    //
    // Your test cases must pass, and you must sort the array in place.
    public static void sortIt(int[] arr) {
        // Implement me.
    }
}

/**
* Below are all of the tests that will be run against your solution.
  */
  public class Solution {
  @Test
  public void test1() {
  int arr[] = new int[]{};
  GooseIsland.sortIt(arr);
  assertArrayEquals(new int[]{}, arr);
  }

  @Test
  public void test2() {
  int arr[] = new int[]{1, 2, 3};
  GooseIsland.sortIt(arr);
  assertArrayEquals(new int[]{3, 1, 2}, arr);
  }

  @Test
  public void test3() {
  int arr[] = new int[]{1, 1, 2, 2, 3, 3};
  GooseIsland.sortIt(arr);
  assertArrayEquals(new int[]{3, 3, 1, 1, 2, 2}, arr);
  }

  @Test
  public void test4() {
  int arr[] = new int[]{1, 2, 3, 2, 3, 1, 2, 2, 3, 2, 3, 2, 2, 2};
  GooseIsland.sortIt(arr);
  assertArrayEquals(new int[]{3, 3, 3, 3, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2}, arr);
  }

  @Test
  public void test5() {
  int arr[] = new int[]{1};
  GooseIsland.sortIt(arr);
  assertArrayEquals(new int[]{1}, arr);
  }

  @Test
  public void test6() {
  int arr[] = new int[]{2, 1};
  GooseIsland.sortIt(arr);
  assertArrayEquals(new int[]{1, 2}, arr);
  }

  @Test
  public void test7() {
  int arr[] = new int[]{2, 1, 3};
  GooseIsland.sortIt(arr);
  assertArrayEquals(new int[]{3, 1, 2}, arr);
  }

  @Test
  public void test8() {
  int arr[] = new int[]{2, 3};
  GooseIsland.sortIt(arr);
  assertArrayEquals(new int[]{3, 2}, arr);
  }

  @Test
  public void test9() {
  int arr[] = new int[]{3, 1, 2};
  GooseIsland.sortIt(arr);
  assertArrayEquals(new int[]{3, 1, 2}, arr);
  }


    public static void main(String[] args) {
        JUnitCore.main("Solution");
    }
}