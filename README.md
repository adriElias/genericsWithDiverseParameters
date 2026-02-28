# Generic Method with Mixed Parameters

Educational Java project to explore the power and flexibility of **generic methods** in Java.

## Objective

- Create a simple `Person` class with basic attributes
- Implement a generic method that accepts **three arguments of any type** and prints them
- Demonstrate that generic methods can handle:
    - Mixed types (custom objects, strings, primitives)
    - Any argument order
    - Type safety at compile time

## Statement Summary

1. Create `Person` class with fields: `name` (String), `surname` (String), `age` (int)
2. Create `GenericMethods` class with a generic method:
  ``` public <T, U, V> void printElements(T arg1, U arg2, V arg3)```
that prints the three arguments.

3. In main(), call the method with different combinations:

   * Person object
   * String
   * Primitive types (int, double, etc.)

4. Verify the method works with any type combination and order

## Project Structure
```text
src/
├── Person.java
├── GenericMethods.java
└── Main.java 

genericsWithDiverseParameters/
├── pom.xml
└── src/
├── main/java/
│   └── GenericMethods.java
│   └── Main.java
│   └── Person.java
└── test/java/
└── GenericTest.java    
```     
### How to Run
```bash
# Maven
mvn test
```
### Example Output
```text
textPerson{name='Anna', surname='Smith', age=28}
Hello World
42

Person{name='John', surname='Doe', age=35}
3.14
Test string
``