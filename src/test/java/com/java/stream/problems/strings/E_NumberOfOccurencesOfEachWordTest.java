package com.java.stream.problems.strings;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class E_NumberOfOccurencesOfEachWordTest {
  @Test
  public void numberOfOccurencesOfEachWord() {
    final var input = "the quick brown fox jumps right over the little lazy dog little";
    final Map<String, Long> mySolution =
        Map.ofEntries(
            Map.entry("over", 1L),
            Map.entry("the", 2L),
            Map.entry("quick", 1L),
            Map.entry("lazy", 1L),
            Map.entry("jumps", 1L),
            Map.entry("right", 1L),
            Map.entry("brown", 1L),
            Map.entry("dog", 1L),
            Map.entry("fox", 1L),
            Map.entry("little", 2L));

    Map<String, Long> yourSolution = Arrays.stream(input.split(" "))
            .collect(Collectors.toMap(Function.identity(), i -> 1L, Long::sum));
    assertEquals(mySolution, yourSolution);
  }

  private void solution1() {
    String input = "the quick brown fox jumps right over the little lazy dog little";
    Map<String, Long> collect =
        Arrays.stream(input.split(" "))
            .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    System.out.println(collect);
  }
}
