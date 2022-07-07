package java_tutorial;

/**
 * Rekursive Methoden
 *
 * Methode ruft sich immer wieder selbst auf
 * dabei kann es zum Stack Overflow kommen, da die Rücksprungadresse auf den Stack hinterlegt wird
 * daher wird eine Abbruchbedingung gefordert.
 */
public class Methods5 {
    public static void main(String[] args) {
        // foo();
        inkrement(100);
    }

    static void foo(){
        foo();
    }

    static void inkrement(int value){
        System.out.println(value);
        if(value == 0){
            return;
        }
        inkrement(value -1);
    }
}
