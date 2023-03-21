# Generics in Java

Generics are a way to create type-safe classes and methods that can operate on different types of objects to catch the type errors at compile time rather than runtime.

It is introduced in version 5.2

## Generic class:

```java
public class GenericClass<T> {
    private final T item;
    
    public GenericClass(T item) {
        this.item = item;
    }
    
    public T getItem() {
        return item;
    }
}
```

## Generic method:
```java
    private static <T> void printItem(T item) {
        System.out.println(item.toString());
    }
```

## Bounded Generic type:
* It is used to restrict or bind to certain types or their subtypes.
* It will allow us to invoke methods of bounded classes or interfaces.
```java
    private static <T extends Number> double add(T numOne, T numTwo) {
        return numOne.doubleValue() + numTwo.doubleValue();
    }
```


## Type inference:
* It is a feature that allows the compiler to automatically determine the type of generic method or constructor parameter.
```java
    List<Integer> list = new ArrayList<>();
```

## Wild cards:
* It is a `<?>` symbol is used to represent an unknown type argument.

```java
    private static void printItemsInList(List<?> list) {
        for (Object item : list) {
            System.out.println(item);
        }
    }
```

## Upper bounded wildcard:
* It is used to specify that the type argument must be a subtype of a certain class or interface.
* It is used to access the items.
```java
    private static void printItemsInList(List<? extends Number> list) {
        for (Number number : list) {
            System.out.println(number);
        }
    }
```

## Lower bounded wildcard:
* It is used to specify that the type argument must be a supertype of a certain class or interface.
* It is used to modify the items.

```java
    List<? super Number> numbers = new ArrayList<>();
    numbers.add(10);
    numbers.add(10.2);
    numbers.add(10.4f);
    System.out.println(numbers);
```

## Advantages:
* **Type safety**
  * data types are corrected at compile time rather than runtime which makes code more robust and reliable.
* **Code re-usability**
  * write classes and methods that can work with multiple types of data which can help reduce the amount of code you need to write.
* **Performance**
  * improve performance by reducing the need for type casts and avoiding the overhead of runtime type checking.

## Disadvantages:
* **Type erasure**
  * it is a key feature where it erases the generic code at runtime which can limit the usefulness of generics in certain situations.
* **Limited support for primitive types**
  * Generics in Java do not support primitive types, such as int or double, directly. Instead, you must use their corresponding wrapper classes, such as Integer or Double. This can be less efficient than working with primitive types directly.
* **Complexity**
  * can add complexity to code which uses complex type hierarchies and wildcard types.
