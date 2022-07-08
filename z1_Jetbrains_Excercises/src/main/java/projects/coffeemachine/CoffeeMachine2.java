package projects.coffeemachine;

/*
Stage 5/6: Keep track of the supplies
Description
But just one action isn’t interesting. Let's improve the program so it can do multiple actions, one after another. The program should repeatedly ask what the user wants to do. If the user types "buy", "fill" or "take", then just do what the program did in the previous step. However, if the user wants to switch off the coffee machine, he should type "exit". Then the program should terminate. Also, when the user types "remaining", the program should output all the resources that the coffee machine has. This means that you shouldn't show the remaining stock levels at the beginning/end of the program.

Also, do not forget that you can be out of resources for making coffee. If the coffee machine doesn’t have enough resources to make coffee, the program should output a message that says it can't make a cup of coffee and state what is missing.

And the last improvement to the program at this step—if the user types "buy" to buy a cup of coffee and then changes his mind, he should be able to type "back" to return into the main cycle.

Remember, that:

For the espresso, the coffee machine needs 250 ml of water and 16 g of coffee beans. It costs $4.
For the latte, the coffee machine needs 350 ml of water, 75 ml of milk, and 20 g of coffee beans. It costs $7.
And for the cappuccino, the coffee machine needs 200 ml of water, 100 ml of milk, and 12 g of coffee. It costs $6.
Instruction
Write a program that will work endlessly to make coffee for all interested persons until the shutdown signal is given.

Example
Your coffee machine should have the same initial resources as in the example (400 ml of water, 540 ml of milk, 120 g of coffee beans, 9 disposable cups, $550 in cash).
The symbol > represents the user input. Note that it's not part of the input.

Write action (buy, fill, take, remaining, exit):
> remaining

The coffee machine has:
400 ml of water
540 ml of milk
120 g of coffee beans
9 disposable cups
$550 of money

Write action (buy, fill, take, remaining, exit):
> buy

What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:
> 2
I have enough resources, making you a coffee!

Write action (buy, fill, take, remaining, exit):
> remaining

The coffee machine has:
50 ml of water
465 ml of milk
100 g of coffee beans
8 disposable cups
$557 of money

Write action (buy, fill, take, remaining, exit):
> buy

What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:
> 2
Sorry, not enough water!

Write action (buy, fill, take, remaining, exit):
> fill

Write how many ml of water you want to add:
> 1000
Write how many ml of milk you want to add:
> 0
Write how many grams of coffee beans you want to add:
> 0
Write how many disposable cups of coffee you want to add:
> 0

Write action (buy, fill, take, remaining, exit):
> remaining

The coffee machine has:
1050 ml of water
465 ml of milk
100 g of coffee beans
8 disposable cups
$557 of money

Write action (buy, fill, take, remaining, exit):
> buy

What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:
> 2
I have enough resources, making you a coffee!

Write action (buy, fill, take, remaining, exit):
> remaining

The coffee machine has:
700 ml of water
390 ml of milk
80 g of coffee beans
7 disposable cups
$564 of money

Write action (buy, fill, take, remaining, exit):
> take

I gave you $564

Write action (buy, fill, take, remaining, exit):
> remaining

The coffee machine has:
700 ml of water
390 ml of milk
80 g of coffee beans
7 disposable cups
$0 of money

Write action (buy, fill, take, remaining, exit):
> exit
 */

import java.math.BigDecimal;
import java.util.Scanner;

public class CoffeeMachine2 {
        /*
    private static final int WATER = 200;
    private static final int MILK = 50;
    private static final int COFFEEBEANS = 15;

     */

    private static BigDecimal money = BigDecimal.valueOf(550);
    private static int water = 400;
    private static int milk = 540;
    private static int coffeebeans = 120;
    private static int disposableCups = 9;
    private static final int WATER_FOR_CAPPUCCINO = 200;
    private static final int MILK_FOR_CAPPUCCINO = 100;
    private static final int COFFEE_FOR_CAPPUCCINO = 12;
    private static final int PRICE_FOR_CAPPUCCINO = 6;

    private static final int WATER_FOR_LATTE = 350;
    private static final int MILK_FOR_LATTE = 75;
    private static final int COFFEE_FOR_LATTE = 20;
    private static final int PRICE_FOR_LATTE = 7;

    private static final int WATER_FOR_ESPRESSO = 250;
    private static final int MILK_FOR_ESPRESSO = 0;
    private static final int COFFEE_FOR_ESPRESSO = 16;
    private static final int PRICE_FOR_ESPRESSO = 4;

    public static void main(String[] args) {
        boolean shouldNotEnd = true;
        while (shouldNotEnd) {
            System.out.println("Write action (buy, fill, take, remaining, exit):");
            Scanner input = new Scanner(System.in);
            String choice = input.nextLine();
            switch (choice) {
                case "buy":
                    buyCoffeeDialog();
                    break;
                case "fill":
                    inputForFillMachine();
                    break;
                case "take":
                    takeMoneyAndPrintMessage();
                    break;
                case "remaining":
                    printStatusMessage();
                    break;
                case "exit":
                    shouldNotEnd = false;
                    break;
                default:
                    System.out.println("No valid choice");
                    break;
            }
        }


        // printStatusMessage();
        // askingForIngredientsAndCoffee();
        // printIngredientResult(wantedCups);
        // printCoffeeProcessMessage();
    }

    public static void buyCoffeeDialog() {
        Scanner input = new Scanner(System.in);
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
        String choice = input.nextLine();
        switch (choice) {
            case "1":
                takeOneEspresso();
                break;
            case "2":
                takeOneLatte();
                break;
            case "3":
                takeOneCappuccino();
                break;
            case "back":
                break;
            default:
                System.out.println("No valid choice");
        }
    }

    public static void takeOneEspresso() {
        if (checkForResources("Espresso")) {
            servingMessage();
            water -= WATER_FOR_ESPRESSO;
            coffeebeans -= COFFEE_FOR_ESPRESSO;
            disposableCups -= 1;
            money = money.add(BigDecimal.valueOf(PRICE_FOR_ESPRESSO));
        }
    }

    public static void takeOneLatte() {
        if (checkForResources("Latte")) {
            servingMessage();
            water -= WATER_FOR_LATTE;
            milk -= MILK_FOR_LATTE;
            coffeebeans -= COFFEE_FOR_LATTE;
            disposableCups -= 1;
            money = money.add(BigDecimal.valueOf(PRICE_FOR_LATTE));
        }
    }

    public static void takeOneCappuccino() {
        if (checkForResources("Cappuccino")) {
            servingMessage();
            water -= WATER_FOR_CAPPUCCINO;
            milk -= MILK_FOR_CAPPUCCINO;
            coffeebeans -= COFFEE_FOR_CAPPUCCINO;
            disposableCups -= 1;
            money = money.add(BigDecimal.valueOf(PRICE_FOR_CAPPUCCINO));
        }
    }

    public static void servingMessage() {
        System.out.println("I have enough resources, making you a coffee!");
    }

    public static void lackOfResourcesMessage(String resource) {
        System.out.printf("Sorry not enough %s!\n", resource);
    }

    public static boolean checkForResources(String coffeetype) {
        switch (coffeetype) {
            case "Cappuccino":
                boolean hasEnough = checkForWater(WATER_FOR_CAPPUCCINO)
                        && checkForMilk(MILK_FOR_CAPPUCCINO)
                        && checkForCoffee(COFFEE_FOR_CAPPUCCINO)
                        && checkForCups(1);
                if (hasEnough) {
                    return true;
                }
                break;
            case "Latte":
                hasEnough = checkForWater(WATER_FOR_LATTE)
                        && checkForMilk(MILK_FOR_LATTE)
                        && checkForCoffee(COFFEE_FOR_LATTE)
                        && checkForCups(1);
                if (hasEnough) {
                    return true;
                }
                break;
            case "Espresso":
                hasEnough = checkForWater(WATER_FOR_ESPRESSO)
                        && checkForMilk(MILK_FOR_ESPRESSO)
                        && checkForCoffee(COFFEE_FOR_ESPRESSO)
                        && checkForCups(1);
                if (hasEnough) {
                    return true;
                }
                break;
            default:
                System.out.println("No valid coffee type");
                break;
        }
        return false;
    }

    public static boolean checkForWater(int waterDemand) {
        if (water - waterDemand >= 0) {
            return true;
        }
        lackOfResourcesMessage("water");
        return false;
    }

    public static boolean checkForMilk(int milkDemand) {
        if (milk - milkDemand >= 0) {
            return true;
        }
        lackOfResourcesMessage("milk");
        return false;
    }

    public static boolean checkForCoffee(int coffeeDemand) {
        if (coffeebeans - coffeeDemand >= 0) {
            return true;
        }
        lackOfResourcesMessage("coffee");
        return false;
    }

    public static boolean checkForCups(int cupDemand) {
        if (disposableCups - cupDemand >= 0) {
            return true;
        }
        lackOfResourcesMessage("cups");
        return false;
    }

    public static void takeMoneyAndPrintMessage() {
        System.out.printf("I gave you $%.0f\n", money);
        money = BigDecimal.valueOf(0);
    }

    public static void inputForFillMachine() {
        Scanner input = new Scanner(System.in);
        System.out.println("Write how many ml of water you want to add:");
        int addWater = input.nextInt();
        System.out.println("Write how many ml of milk you want to add:");
        int addMilk = input.nextInt();
        System.out.println("Write how many grams of coffee beans you want to add:");
        int addCoffeeBeans = input.nextInt();
        System.out.println("Write how many disposable cups of coffee you want to add:");
        int addCups = input.nextInt();
        fillMachine(addWater, addMilk, addCoffeeBeans, addCups);
    }

    public static void fillMachine(int addWater, int addMilk, int addCoffeeBeans, int addCups) {
        water += addWater;
        milk += addMilk;
        coffeebeans += addCoffeeBeans;
        disposableCups += addCups;
    }

    public static void printStatusMessage() {
        System.out.printf("The coffee machine has:\n" +
                "%d ml of water\n" +
                "%d ml of milk\n" +
                "%d g of coffee beans\n" +
                "%d disposable cups\n" +
                "$%.0f of money\n\n", water, milk, coffeebeans, disposableCups, money);
    }

    /*

    public static void askingForIngredientsAndCoffee() {
        Scanner input = new Scanner(System.in);

        System.out.println("Write how many ml of water the coffee machine has:");
        int amountWater = input.nextInt();
        System.out.println("Write how many ml of milk the coffee machine has: ");
        int amountMilk = input.nextInt();
        System.out.println("Write how many grams of coffee beans the coffee machine has: ");
        int amountBeans = input.nextInt();
        System.out.println("Write how many cups of coffee you will need:");
        int wantedCups = input.nextInt();
        int possibleCups = countPossibleCups(amountWater, amountMilk, amountBeans);
        returnMessageAboutCoffeeOrder(wantedCups, possibleCups);
    }

    public static void returnMessageAboutCoffeeOrder(int wantedCups, int possibleCups) {
        if (wantedCups > possibleCups) {
            System.out.printf("No, I can make only %d cup(s) of coffee", possibleCups);
        } else if (wantedCups == possibleCups) {
            System.out.println("Yes, I can make that amount of coffee");
        } else {
            System.out.printf("Yes, I can make that amount of coffee and even %d more of that",
                    possibleCups - wantedCups);
        }
    }

    public static int countPossibleCups(int amountWater,
                                        int amountMilk,
                                        int amountBeans) {
        int cups = amountWater / WATER;
        if (amountMilk / MILK < cups) {
            cups = amountMilk / MILK;
        } else if (amountBeans / COFFEEBEANS < cups) {
            cups = amountBeans / COFFEEBEANS;
        }
        return cups;
    }


    public static void printIngredientResult(int amountCups) {
        System.out.printf("For %d cups of coffee you will need:\n", amountCups);
        System.out.printf("%d ml of water\n", amountCups * WATER);
        System.out.printf("%d ml of milk\n", amountCups * MILK);
        System.out.printf("%d g of coffee beans\n", amountCups * COFFEEBEANS);
    }

    public static void printCoffeeProcessMessage() {
        System.out.println("Starting to make a coffee\n"
                + "Grinding coffee beans\n"
                + "Boiling water\n"
                + "Mixing boiled water with crushed coffee beans\n"
                + "Pouring coffee into the cup\n"
                + "Pouring some milk into the cup\n"
                + "Coffee is ready!\n");
    }

    */
}
