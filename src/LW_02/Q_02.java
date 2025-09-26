package LW_02;
import java.util.Scanner;

public class Q_02 {
    public static int countDigits(int number) {
        int digits = 0;

        if (number == 0) {
            return 1;
        }
        while (number != 0) {
            number /= 10;
            digits++;
        }
        return digits;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        while (true) {
            System.out.print("Enter an integer: ");
            num = sc.nextInt();

            if (num < 0) {
                System.out.println("Programme End...");
                break;
            }
            int result = countDigits(num);
            System.out.println(num+ " has " + result + "digit.");
        }

    }
}