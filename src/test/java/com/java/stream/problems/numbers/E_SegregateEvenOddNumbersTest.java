package com.java.stream.problems.numbers;

import com.java.stream.solutions.GeneralNumbersProblemSolution;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/**
 * Divides a list of integers into two separate lists, one containing all even numbers and the other
 * containing all odd numbers. Input: {1, 2, 3, 4, 5, 6, 7, 8, 9} Output: {2, 4, 6, 8, 1, 3, 5, 7, 9
 * }
 */
public class E_SegregateEvenOddNumbersTest {
  @Test
  void testSegregationOfEvenOddNumbersTest() {
    final var input = IntStream.range(1, 50).boxed();
    final var mySolution = GeneralNumbersProblemSolution.segregateEvenOddNumbers(input);
    final var yourSolution = IntStream.range(1, 50).boxed().sorted((a, b) -> {
      if (a % 2 == b % 2) {
        return 0;
      }
      if (a % 2 == 1) {
        return -1;
      }
      return 1;
    }).toList();

    Assertions.assertEquals(mySolution, yourSolution);
  }
}
