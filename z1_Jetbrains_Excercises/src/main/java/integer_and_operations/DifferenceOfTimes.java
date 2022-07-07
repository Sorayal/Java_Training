package integer_and_operations;

import java.util.Scanner;

/*
Difference of times
Find how many seconds passed between the two moments of time on the same day.

You are given the integer values representing these moments: hours, minutes and seconds for each of them. It is guaranteed that the earlier moment goes first in the input.

Input data format

The program gets the input of six integers: three defining the first moment of time in hours, minutes, seconds, and the other three defining the second one.

For example, six numbers 1, 2, 30, 15, 21, 1 will represent two moments of time: 1:02:30 am and 3:21:01 pm (or just 15:21:01).

Output data format

Just one number: seconds between these two moments of time. It's 51511 (14 hours, 18 minutes and 31 seconds) in our example.


Sample Input:
1
1
1
2
2
2

Sample Output:
3661

 */
public class DifferenceOfTimes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int hourInSeconds = 3600;
        final int minuteInSeconds = 60;

        int startHour = scanner.nextInt();
        int startMinute = scanner.nextInt();
        int startSecond = scanner.nextInt();
        int endHour = scanner.nextInt();
        int endMinute = scanner.nextInt();
        int endSecond = scanner.nextInt();

        int startMoment = startHour * hourInSeconds + startMinute * minuteInSeconds + startSecond;
        int endMoment = endHour * hourInSeconds + endMinute * minuteInSeconds + endSecond;

        System.out.println(endMoment - startMoment);
    }
}
