package com.java.stream.solutions;

import java.util.List;
import java.util.stream.Collectors;

public class GeneralProblemsNumbersSolution {

  public static List<String> getNumberOnly(List<String> values) {
    return values.stream().filter(x -> x.matches("\\d+")).toList();
  }

  public static String getSmallestPossibleValue(List<Integer> input) {
    return input.stream().map(String::valueOf).sorted().collect(Collectors.joining());
  }
}