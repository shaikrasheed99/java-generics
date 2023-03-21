package org.generics;

import java.util.Arrays;
import java.util.List;

public class UpperBoundedWildCard {
    public static void main(String[] args) {
        System.out.println("List of integers:");
        List<Integer> integers = Arrays.asList(10, 20, 30, 40);
        printItemsInList(integers);

        System.out.println("List of doubles:");
        List<Double> doubles = Arrays.asList(10.2, 12.3, 14.3, 12.12);
        printItemsInList(doubles);

        System.out.println("List of floats:");
        List<Float> floats = Arrays.asList(12.2f, 10.2f, 11.4f);
        printItemsInList(floats);
    }

    private static void printItemsInList(List<? extends Number> list) {
        for (Number number : list) {
            System.out.println(number);
        }
        System.out.println();
    }
}
