package org.example;

public class BoundedGenericType {
    public static void main(String[] args) {
        System.out.println("Addition of two integers is: " + add(10, 20));
        System.out.println("Addition of two floats is: " + add(10.1f, 20.3f));
        System.out.println("Addition of two doubles is: " + add(10.1, 20.5));
    }

    private static <T extends Number> double add(T numOne, T numTwo) {
        return numOne.doubleValue() + numTwo.doubleValue();
    }
}
