package projects.simplechatbot;

import java.util.Scanner;

/*
Now you will teach your bot to count. It's going to become an expert in numbers!

Objective
In this stage, you will program the bot to count from 0 to any positive number users enter.

Example
The greater-than symbol followed by a space (> ) represents the user input. Note that it's not part of the input.

Example 1: a dialogue with the new version of the bot

Hello! My name is Aid.
I was created in 2020.
Please, remind me your name.
> Max
What a great name you have, Max!
Let me guess your age.
Enter remainders of dividing your age by 3, 5 and 7.
> 1
> 2
> 1
Your age is 22; that's a good time to start programming!
Now I will prove to you that I can count to any number you want.
> 5
0!
1!
2!
3!
4!
5!
Completed, have a nice day!
Note: each number starts with a new line, and after a number, the bot should print the exclamation mark.

Use the provided template to simplify your work. You can change the text if you want, but be especially careful when counting numbers.
 */

public class SimpleBot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello! My name is Aid.");
        System.out.println("I was created in 2018.");
        System.out.println("Please, remind me your name.");

        String name = scanner.nextLine();

        System.out.println("What a great name you have, " + name + "!");
        System.out.println("Let me guess your age.");
        System.out.println("Enter remainders of dividing your age by 3, 5 and 7.");

        int rem3 = scanner.nextInt();
        int rem5 = scanner.nextInt();
        int rem7 = scanner.nextInt();

        int age = (rem3 * 70 + rem5 * 21 + rem7 * 15) % 105;

        System.out.println("Your age is " + age + "; that's a good time to start programming!");
        System.out.println("Now I will prove to you that I can count to any number you want.");

        // read a number and count to it here
        int number = scanner.nextInt();
        for (int i = 0; i <= number; i++) {
            System.out.printf("%d!\n", i);
        }

        System.out.println("Completed, have a nice day!");
    }
}
