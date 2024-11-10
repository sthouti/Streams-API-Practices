package com.java.stream.problems.numbers;

import com.java.stream.solutions.GeneralNumbersProblemSolution;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static java.lang.Integer.sum;

/*
 * Given a numeric array , re arrange the elements to form a smallest possible value.
 *
 * input is: int arr[] = {1, 34, 3, 98, 9, 76, 45, 4};
 *
 * output is: 133444576998
 *
 * Explanation: 1,3,34,4,45,76,9,98
 * */
public class B_SortElementTest {

  @Test
  public void test() {
    var input = List.of(1, 34, 3, 98, 9, 76, 45, 4);
    var mySolution = GeneralNumbersProblemSolution.getSmallestPossibleValue(input);
    var yourSolution = input.stream().map(String::valueOf).sorted().collect(Collectors.joining());

    Assertions.assertEquals(mySolution, yourSolution);
  }
}
