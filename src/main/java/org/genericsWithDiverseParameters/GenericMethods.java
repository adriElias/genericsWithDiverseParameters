package org.genericsWithDiverseParameters;

public class GenericMethods {
    public <T,U,V> void printElements(T element1, U element2, V element3){
        System.out.println("Element 1: " + element1);
        System.out.println("Element 2: " + element2);
        System.out.println("Element 3: " + element3);
    }
}
