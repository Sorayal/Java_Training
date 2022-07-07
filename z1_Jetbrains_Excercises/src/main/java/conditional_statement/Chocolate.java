package conditional_statement;

import java.util.Scanner;

/*
Chocolate
Wow! This problem is kind of tricky. If you're ready to put your thinking cap on, brace yourself and good luck! Otherwise, you can skip it for now and return any time later
Imagine a chocolate bar. Remember how it is usually split into smaller bits by a special grid?

Now think of chocolate as an N x M rectangle divided into little segments: N segments in length and M in width. Each segment is 1x1 and unbreakable. Find out whether it is possible to break off exactly K segments from the chocolate with a single straight line: vertical or horizontal.

Input data format

The program gets an input of three integers: N, M, K.

Output data format

The program must output one of the two words: YES or NO.

If you're having trouble understanding the task, try drawing it on a piece of paper.




Sample Input:
4
2
6

Sample Output:
YES


Sample Input:
2
10
7

Sample Output:
NO


Sample Input:
7
4
21

Sample Output:
YES

 */
public class Chocolate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int k = scanner.nextInt();

        boolean withinLowerBound = k >= n || k >= m;
        boolean withinUpperBound = k <= n * m;
        boolean isModulo = k % n == 0 || k % m == 0;
        boolean isExactly = withinLowerBound && withinUpperBound && isModulo;

        if (isExactly) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}

/*
K < N and K < M : always false
K > N x M : always false
K % N or K % M : true (within lower and upper bound)
 */
