package playground;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * Lernziel: erste Lambda Ausdrücke
 * - Funktionale Schnittstellen
 * - Grundlegende Lambda-Syntax
 * - Zieltyp
 * - Annotation @Functional Interface
 * - Konflikte bei bestimmten Parametertypen
 *
 * - Funktionale Schnittstelle darf eine einzige Methode als abstrakt gekennzeichnet haben.
 * - Der Compiler braucht den Zieltyp.
 */




public class LambdaIntroPredicate {
    public static void main(String[] args) {

        // Lokal definierte Klasse, eng an die Mainmethode gebunden
//        class StringEmptyPredicate implements Predicate<String> {
//            @Override public boolean test(String s){
//                return s.isEmpty();
//            }
//        }

        // innere anonyme Klasse
//        Predicate<String> isEmpty = new Predicate<String>(){
//            @Override public boolean test(String s){
//                return s.isEmpty();
//            }
//        };

        // Ersetzen mit Lambdaausdruck , der Ergebnistyp ist dem Compiler bekannt. Die funktionale Schnittstelle enthält
        // eh nur eine abstrakte Methode. Daher fliegt das override auch raus.

        Predicate<String> isEmpty = (String s) -> { return s.isEmpty();};

        List<String> names = new ArrayList<>();
        names.add("Joe");
        names.add("Jill");
        names.add("");
        //names.removeIf(isEmpty);
        // Direkt eingesetzt
        names.removeIf((String s) -> { return s.isEmpty();});
        System.out.println(names);
    }
}

//class StringEmptyPredicate implements Predicate<String>{
//    @Override public boolean test(String s){
//        return s.isEmpty();
//    }
//}
