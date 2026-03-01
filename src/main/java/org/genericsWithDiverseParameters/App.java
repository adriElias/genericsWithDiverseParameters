package org.genericsWithDiverseParameters;

public class App {
    public static void main(String[] args) {
        System.out.println("--- GENERICS ---");
        GenericMethods genericMethods = new GenericMethods();
        Person person = new Person("Adriana", "Villarroel", 27);
        String city = "Bolivia";
        int birthdate = 1998;

        genericMethods.printElements(person, city, birthdate);

        System.out.println("--- Level 2, exercise 1 ---");

        genericMethods.printElementsPartialGeneric(100, "Hello", true);
        genericMethods.printElementsPartialGeneric(3.14, "Madrid", person);

        System.out.println("--- Level 2, exercise 2 ---");

        genericMethods.printAll("Hello", "World", "!");
        genericMethods.printAll(1, 2, 3, 4, 5);
        genericMethods.printAll(person, "Bolivia", 1998, "Barcelona", 2016);

    }
}
