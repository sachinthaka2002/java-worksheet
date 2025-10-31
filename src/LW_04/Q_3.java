package LW_04;

import java.util.Scanner;

public class Q_3 {
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.println("Enter a power of 10: ");
            int power = input.nextInt();

            switch (power) {
                case 6:
                    System.out.println("Million");
                    break;
                case 9:
                    System.out.println("Billion");
                    break;
                case 12:
                    System.out.println("Trillion");
                    break;
                case 15:
                    System.out.println("Quadrallion");
                    break;
                case 18:
                    System.out.println("Quintillion");
                    break;
                case 21:
                    System.out.println("Sextillion");
                    break;
            }

        }

}
