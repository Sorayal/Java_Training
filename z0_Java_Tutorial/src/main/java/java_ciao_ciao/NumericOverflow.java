package java_ciao_ciao;

/**
 * 2.2.2 Quiz: Wertebereiche einhalten ★
 */
public class NumericOverflow {
    public static void main(String[] args) {
        // Der Bereich für Integer ist nicht gross genug, um das Resultat richtig anzugeben.
        System.out.println(1000000 * 1000000);

        // Ein Argument als Long zu kennzeichnen, reicht aus, damit der Compiler das andere Argument
        // implizit zum Long umwandelt.
        System.out.println(1000000 * 1000000L);
    }
}
