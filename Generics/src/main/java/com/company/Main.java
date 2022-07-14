package com.company;

public class Main {
    public static void main(String[] args) {
        /**
         * Generic class
         * Syntax: class classname <Typ Variablen Liste>
         *
         */

        Socke s1 = new Socke();
        Socke s2 = new Socke();

        GenPaar<Socke> sockenPaar = new GenPaar<Socke>(s1, s2);
        System.out.println("1. Paar: " + sockenPaar);

        Ohrring o1 = new Ohrring();
        Ohrring o2 = new Ohrring();

        GenPaar<Ohrring> ohrRingPaar = new GenPaar<Ohrring>(o1, o2);
        System.out.println("1. Paar: " + ohrRingPaar);

        Socke s = sockenPaar.getL();
        System.out.println(s);

        AbstractService aService = new ConcreteService();
        RestModel restModel = new RestModel();
        aService.readRest(restModel);
    }
}
