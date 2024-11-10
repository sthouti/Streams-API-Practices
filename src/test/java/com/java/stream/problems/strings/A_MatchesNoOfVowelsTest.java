package com.java.stream.problems.strings;

import com.java.stream.solutions.GeneralStringProblemsSolution;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/**
 * Finds the words with the given number of vowels in a given string. <br>
 * <br>
 * Example:
 *
 * <pre>
 *  "The quick brown fox jumps right over the little lazy dog.";
 * </pre>
 *
 * <pre>
 *   Number of Vowels: 2
 *   Words with Maximum Vowels: [quick, over, little]
 * </pre>
 *
 * <br>
 * Example:
 *
 * <pre>
 *  "Hello World";
 * </pre>
 *
 * <pre>
 *   Maximum Number of Vowels: 2
 *   Words with Maximum Vowels: [Hello, World]
 * </pre>
 */
public class A_MatchesNoOfVowelsTest {
  @Test
  void testAM_MaxNoOfVowelsTest() {
    var input = "The quick brown fox jumps right over the little lazy dog.";
    final var length = 2;

    var mySolution = GeneralStringProblemsSolution.getMatchesVowels(input, length);
    var yourSolution = Arrays.stream(input.split(" ")).filter(word -> word.replaceAll("[aeiouAEIOU]", "").length() == word.length() - length).toList();
    Assertions.assertEquals(mySolution, yourSolution);
  }
}
