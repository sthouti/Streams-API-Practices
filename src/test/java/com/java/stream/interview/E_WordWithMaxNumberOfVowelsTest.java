package com.java.stream.interview;

import com.github.javafaker.Faker;
import com.java.stream.solutions.InterviewProblemSolutions;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

/*
 * Given A String
 * Find the highest number of vowels present in a word.
 *
 * Example:
 * INPUT: HELLO HOW ARE YOU
 * OUTPUT: 2
 * EXPLANATION: HELLO contains 2 vowels.
 * */
public class E_WordWithMaxNumberOfVowelsTest {

  @Test
  void testNumberOfVowels() {
    var input = Faker.instance().chuckNorris().fact();
    final var mySolution = InterviewProblemSolutions.maxNumberOfVowels(input);
    final var yourSolution = Arrays.stream(input.split(" "))
            .mapToInt(s -> s.length() - s.replaceAll("[aeiouAEIOU]", "").length())
            .max()
            .orElse(0);
    Assertions.assertEquals(mySolution, yourSolution);
  }
}
