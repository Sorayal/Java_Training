package com;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Collection<Double> c = new ArrayList<>();
        c.add(1.1);
        c.add(2.2);
        c.add(3.3);
        c.add(0.0);
        c.add(3.3);
        c.add(4.4);
        printInfo(c);
        c.remove(3.3);
        c.remove(0.0);
        c.remove(4.4);
        printInfo(c);

        List<Double> values = c.stream().filter(d -> d == 3.3).toList();
        for (Double value : values) {
            System.out.println(value);
        }
    }

    public static void printInfo(Collection<Double> c) {
        System.out.println("Die Liste enthaelt " + c.size() + " Elemente");
        System.out.println("Ist 3.3 in der Liste enthalten? " + c.contains(3.3));
        System.out.println("Alle Elemente der Liste:");
        for (Object o : c) {
            System.out.println(o + "   ");
        }
        System.out.println();
        System.out.println();
    }
}
