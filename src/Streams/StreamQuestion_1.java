package Streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class StreamQuestion_1 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6);
        System.out.println("Even number: ");
        numbers.stream()
                .filter(num -> num%2 == 0)
                .forEach(System.out::println);
        System.out.println();
        List<String> names = Arrays.asList("john","adam","alex");
        System.out.println("Names in Upper Case: ");
        names.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);
        System.out.println();
        List<Integer> number = Arrays.asList(1,2,4,7,8);
        System.out.println("Count of even number: ");
        long result = number.stream()
                .filter(n -> n%2==0)
                .count();
        System.out.println(result);
        System.out.println();
        List<Integer> list = Arrays.asList(5,2,5,1,3,2);
        System.out.println("Unique element in sorted order:");
        list.stream()
                .distinct()
                .sorted()
                .forEach(System.out::println);
        System.out.println();
        List<Integer> highest = Arrays.asList(10,40,30,90,70,20);
        System.out.println("Highest 3 number in list:");
        highest.stream()
                .sorted(Comparator.reverseOrder())
                .limit(3)
                .forEach(System.out::println);
        System.out.println();
        List<Integer> skipList = Arrays.asList(10,20,30,40,50);
        System.out.println("After skipping first 2 number: ");
        skipList.stream()
                .skip(2)
                .forEach(System.out::println);
        System.out.println();
        List<Integer> marks = Arrays.asList(45,70,92,80);
        System.out.println("Any 1 student has mark > 90:");
        boolean anyMark = marks.stream()
                .anyMatch(mark -> mark>90);
        System.out.println(anyMark);
        System.out.println();
        List<Integer> salaries = Arrays.asList(35000,45000,60000);
        System.out.println("Are all employees salary greater than 30K: ");
        boolean allSalary = salaries.stream()
                .allMatch(salary -> salary>30000);
        System.out.println(allSalary);
        System.out.println();
        List<Integer> price = Arrays.asList(100,250,300);
        System.out.println("No price in negative range: ");
        boolean nonePrice = price.stream()
                .noneMatch(rate -> rate<0);
        System.out.println(nonePrice);
        System.out.println();
        List<Integer> first = Arrays.asList(1,5,7,8,10);
        System.out.println("first even number: ");
        Optional<Integer> evenFirst = first.stream()
                .filter(n -> n%2 == 0)
                .findFirst();
        System.out.println(evenFirst);
        System.out.println();
        List<String> languages = Arrays.asList("Java","Python","Java","C++","Python");
        System.out.println("Count of unique words:");
        long unique = languages.stream()
                .distinct()
                .count();
        System.out.println(unique);
        List<Integer> salary = Arrays.asList(50000,70000,40000,90000,80000,60000);
        System.out.println("Top 5 highest salaries: ");
        salary.stream()
                .sorted(Comparator.reverseOrder())
                .limit(5)
                .forEach(System.out::println);
        System.out.println();
        List<Integer> lists = Arrays.asList(5, 1, 3, 1, 2);
        System.out.println("Tricky 1: ");
        lists.stream()
                .distinct()
                .limit(3)
                .sorted()
                .forEach(System.out::println);
        System.out.println();



    }
}
