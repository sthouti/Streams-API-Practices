package com.java.stream.interview;

import com.github.javafaker.Faker;
import com.java.stream.interview.ignore.domain.Employee;
import com.java.stream.solutions.InterviewProblemSolutions;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/*
 * There is a list of Employees and Employee object has a field called e-mail.
 *
 * Find the list of domains ( gmail.com, yahoo.com..) and the no of occurrences for each domain?
 * */
public class D_UniqueEmailCountTest {
  @Test
  void findUniqueDomainsWithCount() {
    final var employees =
        List.of(
            new Employee(Faker.instance().internet().emailAddress()),
            new Employee(Faker.instance().internet().emailAddress()),
            new Employee(Faker.instance().internet().emailAddress()),
            new Employee(Faker.instance().internet().emailAddress()),
            new Employee(Faker.instance().internet().emailAddress()),
            new Employee(Faker.instance().internet().emailAddress()),
            new Employee(Faker.instance().internet().emailAddress()),
            new Employee(Faker.instance().internet().emailAddress()),
            new Employee(Faker.instance().internet().emailAddress()),
            new Employee(Faker.instance().internet().emailAddress()),
            new Employee(Faker.instance().internet().emailAddress()));

    final var mySolution = InterviewProblemSolutions.findUniqueDomainsCount(employees);

    final Map<String, ? extends Number> yourSolution = employees.stream()
            .map(Employee::email)
            .map(s -> s.split("@")[1])
            .collect(Collectors.toMap(Function.identity(), i -> 1L, Long::sum));

    Assertions.assertEquals(mySolution, yourSolution);
  }
}
