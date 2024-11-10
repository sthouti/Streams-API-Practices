package com.java.stream.problems.numbers;

import com.java.stream.solutions.GeneralNumbersProblemSolution;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/*
 * Given an array of {5,6,7,8,5,5,8,8,7)
 * Find the sum of the unique elements.
 * The output should be in this case is: 26.
 */
public class F_SumOfDigitsTest {

  @Test
  void testSumOfUniqueDigitsTest() {
    final var input = List.of(5, 6, 7, 8, 5, 5, 8, 8, 7);
    var mySolution = GeneralNumbersProblemSolution.sumOfDigits(input);
    var yourSolution = input.stream().mapToLong(i -> i).sum();

    Assertions.assertEquals(mySolution, yourSolution);
  }
}
