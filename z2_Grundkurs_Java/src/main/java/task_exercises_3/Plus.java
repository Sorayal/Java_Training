package task_exercises_3;

public class Plus {
    public static void main(String[] args) {
        int a = 1, b = 2, c = 3, d = 4;
        System.out.println(++a); // 2
        System.out.println(a); // 2
        System.out.println(b++); // 2
        System.out.println(b); // 3
        System.out.println((++c) + (++c)); // 9
        System.out.println(c); // 5
        System.out.println((d++) + (d++)); // 9
        System.out.println(d); // 6
    }
}
