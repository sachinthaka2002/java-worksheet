package LW_04;

import java.util.Scanner;

public class Q_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int num1 = input.nextInt();

        System.out.println("Enter first number: ");
        int num2 = input.nextInt();

        System.out.println("Enter first number: ");
        int num3 = input.nextInt();

        int small;

        if(num1 <= num2 && num1 <= num3){
            small= num1;
        } else if (num2 <= num1 && num2 <= num3) {
            small = num2;
        } else {
            small = num3;
        }

        System.out.println("The smallest number is : "+small);
        input.close();
    }
}
