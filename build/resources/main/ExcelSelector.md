import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.*;
import org.junit.runner.*;
import java.util.*;

class ExcelSelector {

/**
* Write a function that can parse an excel selector. An excel selector is a string that specifies a one or more of cells to be selected.
*
* A selector is a combination of a column, in a modified base-26 notation ("A", "AA", "ZZZ"), and a number, which is the 1-indexed row number.
* Examples: A1, B3, J20, J100, AA10, ZC1090
*
* Three operators are available that you must support.
*
* & - The AND operator. This selects boths cells or combinations of cells. Can be present 0 or more times.
* Examples:
*   A1&A2 => ["A1", "A2"]
*   A1&JJ20 => ["A1", "JJ20"]
*   A1&JJ20&D10 => ["A1", "D10", "JJ20"]
*
* : - The RANGE operator. This selects all cells (in a box, across and down) within the range. Can be present 0 or more times.
* Examples:
*   A1:A2 => ["A1", "A2"]
*   A1:C3 => ["A1", "A2", "A3", "B1", "B2", "B3", "C1", "C2", "C3"]
*   A1:C3:D5 - ILLEGAL
*
* The AND and RANGE operators can be combined.
* Examples:
*   A1:C3&D5 => ["A1", "A2", "A3", "B1", "B2", "B3", "C1", "C2", "C3", "D5"]
*   A1:C3&D5:E6 => ["A1", "A2", "A3", "B1", "B2", "B3", "C1", "C2", "C3", "D5", "D6", "E5", "E6"]
*
* ~ - The NOT operator - This negates previously selected cells. Can only be present once.
* Examples:
*   A1&A2~A2 => ["A1"]
*   A1:C2~B1 => ["A1", "A2", "B2", "C1", "C2"]
*   A1:C2~B1&C2 => ["A1", "A2", "B2", "C1"]
*   A1:C3~B1:C1&C2 => ["A1", "A2", "A3", "B2", "B3", "C3"]
    */
    public static List<String> parse(String selector) {
    return List.of();
    }
    }

/**
* Below are all of the tests that will be run against your solution.
  */
  public class Solution {
  @Test
  public void tests() {
  assertThat(ExcelSelector.parse(""), is(List.of()));
  assertThat(ExcelSelector.parse("A1"), is(List.of("A1")));
  assertThat(ExcelSelector.parse("A1&A2"), is(List.of("A1", "A2")));
  assertThat(ExcelSelector.parse("A1&A2&C3"), is(List.of("A1", "A2", "C3")));
  assertThat(ExcelSelector.parse("A1:B2"), is(List.of("A1", "A2", "B1", "B2")));
  assertThat(ExcelSelector.parse("A1&A2:D3"), is(List.of("A1","A2","A3", "B2","B3","C2","C3","D2","D3")));
  assertThat(ExcelSelector.parse("A1&A2:D3~C2:C3"), is(List.of("A1", "A2", "A3", "B2", "B3", "D2", "D3")));
  assertThat(ExcelSelector.parse("A1&A2:D3~C2:C3&D3"), is(List.of("A1", "A2", "A3", "B2", "B3", "D2")));
  assertThat(ExcelSelector.parse("AA1"), is(List.of("AA1")));
  assertThat(ExcelSelector.parse("AA1&BZ2"), is(List.of("AA1", "BZ2")));
  assertThat(ExcelSelector.parse("AA100:AB104"), is(List.of("AA100", "AA101", "AA102", "AA103", "AA104", "AB100", "AB101", "AB102", "AB103", "AB104")));
  }


public static void main(String[] args) {
JUnitCore.main("Solution");
}
}