package branching_statements;


/*
How many times will the letter 'f' be printed?
 */
public class PrintingF {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (char letter = 'a'; letter <= 'f'; letter++) {
                if (letter < 'f') {
                    continue;
                }
                System.out.println(letter);
            }
        }
    }
}
