package com.arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale locale = Locale.getDefault();
        System.out.println(locale.getLanguage());
        System.out.println(locale.getDisplayName());

        List<String> names = new ArrayList<>();
        names.add("Sascha");
        names.add("Helmut");
        names.forEach(name -> {
            System.out.println("\n----");
            System.out.println(name);
            System.out.println("----\n");
        } );
    }
}
