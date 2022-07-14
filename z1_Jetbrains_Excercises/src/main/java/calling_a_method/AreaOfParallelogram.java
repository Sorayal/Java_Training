package calling_a_method;

import java.util.Scanner;

/*
Area of parallelogram
According to the formula, the area of a parallelogram is the result of the multiplication of the base and the height of the figure. Call the method countAreaOfParallelogram that calculates the area of the parallelogram with the following parameters b and h.




Sample Input:
8 10

Sample Output:
80

 */

public class AreaOfParallelogram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int b = scanner.nextInt();
        int h = scanner.nextInt();
        countAreaOfParallelogram(b, h);
    }

    // Do not change code below
    public static void countAreaOfParallelogram(int b, int h) {
        System.out.println(b * h);
    }
}
