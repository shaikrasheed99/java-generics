package org.generics;

public class GenericClass<T> {
    private final T item;

    public GenericClass(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }

    public static void main(String[] args) {
        System.out.println("Generic class with string item:");
        GenericClass<String> stringGenericClass = new GenericClass<>("String item");
        System.out.println(stringGenericClass.getItem());
        System.out.println();

        System.out.println("Generic class with integer item:");
        GenericClass<Integer> integerGenericClass = new GenericClass<>(12);
        System.out.println(integerGenericClass.getItem());
        System.out.println();

        System.out.println("Generic class with float item:");
        GenericClass<Float> floatGenericClass = new GenericClass<>(12.2f);
        System.out.println(floatGenericClass.getItem());
        System.out.println();

        System.out.println("Generic class with double item:");
        GenericClass<Double> doubleGenericClass = new GenericClass<>(12.12);
        System.out.println(doubleGenericClass.getItem());
        System.out.println();
    }
}
