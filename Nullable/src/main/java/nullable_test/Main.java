package nullable_test;

public class Main {
    public static void main(String[] args) {
        // write your code here
    }

    public static boolean isDefined(final JsonNullable<?> value) {
        return !value.equals(JsonNullable.undefined());
    }
}
