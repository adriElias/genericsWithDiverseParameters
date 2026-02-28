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

}
