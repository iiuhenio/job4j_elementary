package ru.job4j.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReduceExample {
    public static void main(String[] args) {
        List<Integer> nums = List.of(1, 2, 3, 4);
        Optional<Integer> sum = nums.stream()
                .reduce((a, b) -> a + b);
        System.out.println(sum.get());

        List<String> nums1 = List.of("Один", "Два", "Три");
        Optional<String> sum1 = nums1.stream()
                .reduce((a, b) -> a + ", " + b);
        System.out.println(sum1.get());

        List<Integer> nums3 = Arrays.asList(1, 2, 3, 4);
        int sum3 = nums3.stream()
                .reduce(2, (a, b) -> a + b);
        System.out.println(sum3);
    }
}