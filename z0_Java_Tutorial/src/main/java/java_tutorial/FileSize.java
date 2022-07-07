package java_tutorial;

public class FileSize {
    public static void main(String[] args) {
        long size = new java.io.File("test.txt").length();
        System.out.println(size); // Länge der Datei in Bytes
    }
}
