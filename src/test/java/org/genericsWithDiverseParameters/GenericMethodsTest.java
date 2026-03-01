package org.genericsWithDiverseParameters;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

public class GenericMethodsTest {
    private GenericMethods genericMethods;
    private ByteArrayOutputStream outputStream;

    @BeforeEach
    void setUp() {
        genericMethods = new GenericMethods();
        outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
    }

    @Test
    void testPrintElementsWithPersonStringAndNumber() {
        Person person = new Person("Adriana", "Villarroel", 27);
        String city = "Bolivia";
        int birthdate = 1998;

        genericMethods.printElements(person, city, birthdate);
        String output = outputStream.toString();

        assertTrue(output.contains("Person{name='Adriana', surname='Villarroel', age=27}"));
        assertTrue(output.contains("Bolivia"));
        assertTrue(output.contains("1998"));
    }

    @Test
    void testPrintElementsInDifferentOrder() {
        Person person = new Person("Carlos", "López", 35);
        genericMethods.printElements(99, "test", person);
        String output = outputStream.toString();

        assertTrue(output.contains("99"));
        assertTrue(output.contains("test"));
        assertTrue(output.contains("Person{name='Carlos', surname='López', age=35}"));
    }

    @Test
    void testPartialGenericSecondArgumentMustBeString() {
        Person person = new Person("Adriana", "Villarroel", 27);

        genericMethods.printElementsPartialGeneric(person, "Barcelona", 1998);

        String output = outputStream.toString();
        assertTrue(output.contains("Person{name='Adriana', surname='Villarroel', age=27}"));
        assertTrue(output.contains("Barcelona"));
        assertTrue(output.contains("1998"));
    }

    @Test
    void testPartialGenericWithNumberAndBoolean() {
        genericMethods.printElementsPartialGeneric(100, "Hello", true);

        String output = outputStream.toString();
        assertTrue(output.contains("100"));
        assertTrue(output.contains("Hello"));
        assertTrue(output.contains("true"));
    }

    @Test
    void testPartialGenericWithDoubleAndPerson() {
        Person person = new Person("Carlos", "López", 35);

        genericMethods.printElementsPartialGeneric(3.14, "Madrid", person);

        String output = outputStream.toString();
        assertTrue(output.contains("3.14"));
        assertTrue(output.contains("Madrid"));
        assertTrue(output.contains("Person{name='Carlos', surname='López', age=35}"));
    }

    @Test
    void testPrintAllWithThreeStrings() {
        genericMethods.printAll("Hello", "World", "!");

        String output = outputStream.toString();
        assertTrue(output.contains("Hello"));
        assertTrue(output.contains("World"));
        assertTrue(output.contains("!"));
    }

    @Test
    void testPrintAllWithFiveIntegers() {
        genericMethods.printAll(1, 2, 3, 4, 5);

        String output = outputStream.toString();
        for (int i = 1; i <= 5; i++) {
            assertTrue(output.contains(String.valueOf(i)));
        }
    }

    @Test
    void testPrintAllWithMixedTypes() {
        Person person = new Person("Adriana", "Villarroel", 27);

        genericMethods.printAll(person, "Bolivia", 1998, "Barcelona", 2016);

        String output = outputStream.toString();
        assertTrue(output.contains("Person{name='Adriana', surname='Villarroel', age=27}"));
        assertTrue(output.contains("Bolivia"));
        assertTrue(output.contains("1998"));
        assertTrue(output.contains("Barcelona"));
        assertTrue(output.contains("2016"));
    }
}