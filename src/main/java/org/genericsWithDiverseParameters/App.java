package org.genericsWithDiverseParameters;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "--- GENERICS ---" );
        GenericMethods genericMethods = new GenericMethods();
        Person person = new Person("Adriana", "Villarroel", 27);
        String city = "Bolivia";
        int birthdate = 1998;

        genericMethods.printElements(person,city, birthdate);

    }
}
