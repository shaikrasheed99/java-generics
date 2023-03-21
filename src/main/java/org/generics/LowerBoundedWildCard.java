package org.generics;

import java.util.ArrayList;
import java.util.List;

public class LowerBoundedWildCard {
    public static void main(String[] args) {
        List<? super Number> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(10.2);
        numbers.add(10.4f);

        System.out.println(numbers);
    }
}
