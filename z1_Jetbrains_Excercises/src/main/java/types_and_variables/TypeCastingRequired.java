package types_and_variables;

/**
 * implicit casting (compiler does that automatically)
 * byte -> short -> int -> long -> float - double
 * ^
 * |
 * char
 * <p>
 * explicit casting (programmer has to do that manually)
 * reverse direction with lost precision or a possible type overflow
 */


public class TypeCastingRequired {
    public static void main(String[] args) {
        int q = 'q';
        char ch2 = (char) q;
        short s = 1;
        char ch3 = (char) s;

        long lo = Integer.MAX_VALUE;
        int i = (int) lo;
        char ch = (char) i;
        double d = ch;
        float f = (float)d;
    }
}
