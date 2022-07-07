package for_loop;

import java.util.Scanner;

/*
The count of numbers divisible by N
Write a program that reads three positive integers a, b, n and outputs the count of numbers divisible by n in the range from a to b (a < b) inclusively.

Note: it is possible to write this program more efficiently without any loops.


Sample Input:
10 20 10

Sample Output:
2


Sample Input:
15 25 5

Sample Output:
3

 */
public class CountNumbersDivisibleByN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int n = scanner.nextInt();
        int counter = 0;

/*        for (int i = a; i <= b; i++){
            if(i % n == 0){
                counter++;
            }
        }*/
        counter = (b - a) / n + 1;

        System.out.println(counter);
    }
}
