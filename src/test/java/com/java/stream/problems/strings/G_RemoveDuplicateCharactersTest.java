package com.java.stream.problems.strings;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.java.stream.solutions.GeneralStringProblemsSolution;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

public class G_RemoveDuplicateCharactersTest {
  @Test
  public void testRemoveDuplicates() {
    final String input = "dabfcadef";
    final String yourSolution = input
            .chars()
            .distinct()
            .mapToObj(i -> (char) i)
            .reduce("", (a, b) -> a + b, String::concat);

    final String mySolution = GeneralStringProblemsSolution.getUniqueCharacters(input);

    assertEquals(mySolution, yourSolution);
  }
}
