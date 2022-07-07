package scanning_input;

import java.util.Scanner;

/*
Hiring a chef
Imagine that you are an HR manager at a restaurant and you need to hire a chef. To do that, you need to collect some preliminary data about the candidates.

You have a special form for the candidates that includes 3 fields: first name, years of experience and cuisine preference.

Your program should read all the words (or numbers) from the three lines and output "The form for first name is completed. We will contact you if we need a chef who cooks cuisine preference dishes and has years of experience years of experience."


Sample Input:
Eugene
8
fusion

Sample Output:
The form for Eugene is completed. We will contact you if we need a chef who cooks fusion dishes and has 8 years of experience.
 */

public class HiringAChief {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstName;
        String age;
        String stageOfEducation;
        String yearsOfExperience;
        String cuisinePreference;
        Scanner input = new Scanner(System.in);
        firstName = input.nextLine();
        age = input.nextLine();
        stageOfEducation = input.nextLine();
        yearsOfExperience = input.nextLine();
        cuisinePreference = input.nextLine();
        String output = "The form for " + firstName +
                " is completed. We will contact you if we need a chef that cooks " +
                cuisinePreference + " dishes.";
        System.out.println(output);

    }
}
