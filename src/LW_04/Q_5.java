package LW_04;

import java.util.Scanner;

public class Q_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Entree Menu: ");
        System.out.println("1. Tofu Burger - $3.49");
        System.out.println("2. Cajun Chicken - $4.59");
        System.out.println("3. Buffalo Wings - $3.99");
        System.out.println("4. Rainbow Fillet - $2.99");
        System.out.print("Enter your choice (1-4): ");
        int entreeChoice = input.nextInt();


        System.out.println("Side Dish Menu:");
        System.out.println("1. Rice Cracker - $0.79");
        System.out.println("2. No-Salt Fries - $0.69");
        System.out.println("3. Zucchini - $1.09");
        System.out.println("4. Brown Rice - $0.59");
        System.out.print("Enter your choice (1-4): ");
        int sideChoice = input.nextInt();

        System.out.println("Drink Menu:");
        System.out.println("1. Cafe Mocha - $1.99");
        System.out.println("2. Cafe Latte - $1.90");
        System.out.println("3. Espresso - $2.49");
        System.out.println("4. Oolong Tea - $0.99");
        System.out.print("Enter your choice (1-4): ");
        int drinkChoice = input.nextInt();

        double entryPrice=0,sidePrice=0,drinkPrice=0;

        if (entreeChoice == 1) entryPrice=3.49;
        else if (entreeChoice == 2) entryPrice = 4.59;
        else if (entreeChoice == 3) entryPrice = 3.99;
        else if (entreeChoice == 4) entryPrice = 2.99;

        if (sideChoice == 1) sidePrice = 0.79;
        else if (sideChoice == 2) sidePrice = 0.69;
        else if (sideChoice == 3) sidePrice = 1.09;
        else if (sideChoice == 4) sidePrice = 0.59;

        if (drinkChoice == 1) drinkPrice = 1.99;
        else if (drinkChoice == 2) drinkPrice = 1.90;
        else if (drinkChoice == 3) drinkPrice = 2.49;
        else if (drinkChoice == 4) drinkPrice = 0.99;

        double total = entryPrice + sidePrice + drinkPrice;
        System.out.println("_____________________");

        System.out.println("Total Price: $"+total);

        input.close();

    }
}
