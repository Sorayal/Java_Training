package output_streams.system_error;/* Quiz: Warum heißt es System.out.println(...), nicht println(...)?
 *
 * Die Objekte und Klassen müssen angesprochen, da sonst keine Eindeutigkeit besteht.
 *
 * - Zwei Ausgabekanäle kennenlernen: für normale Ausgaben und Fehlerausgaben
 */


public class PrintSystemOutSystemErr {
    public static void main(String[] args){
        System.out.println("Hello Universe");
        System.err.println("Hello Universe");
        // System.err.println writes the code in red
        System.out.println("There is a message");
    }
}
