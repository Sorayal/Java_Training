package strings.comparison;


public class App {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "  He   llo";

        s1 = stripWhitespaces(s1);
        s2 = stripWhitespaces(s2);

        //boolean isEqual = s2.replace(" ", "").equals(s1.replace(" ", ""));
        boolean isEqual = s1.equals(s2);
        System.out.println(isEqual);

        String s3 = "test";
        String s4 = new String("test");

        System.out.println(s3 == s4); // not the same references/ addresses => false
        System.out.println(s3.equals(s4)); // same values => true

    }

    public static String stripWhitespaces(String fromString) {
        return fromString.replaceAll("\\s+", "");
    }
}
