package com.java.stream.problems.strings;

import com.java.stream.solutions.GeneralStringProblemsSolution;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class B_LargestWordTest {
  /**
   * Find the largest word in a given string.
   * <br>
   * <br>
   * Example string:
   *
   * <pre>
   * Input: "I am interested123455 to grow in my organization"
   * Output: "interested123455"
   * </pre>
   *
   * @author ZahidKhan
   *
   * @see GeneralStringProblemsSolution#findLargestWordInTheString(String)
   */
  @Test
  public void findLargestWordInTheString() {
    final String input = "I am interested123455 interested123456 to grow in my organization";
    final String mySolution = GeneralStringProblemsSolution.findLargestWordInTheString(input);

    String yourSolution = Arrays.stream(input.split(" ")).reduce("",(a, b) -> a.length() < b.length() ? b : a);

    Assertions.assertEquals(mySolution, yourSolution);
  }
}
