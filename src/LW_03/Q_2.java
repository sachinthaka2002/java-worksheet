package LW_03;

import java.util.Scanner;
public class Q_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Temperature(in farenhiet): ");

        if (scanner.hasNextDouble()){
            double F = scanner.nextDouble();

            Temperature Temp = new Temperature();
            Temp.setFahrenheit(F);

            double c = Temp.toCelsius();
            System.out.println("Eqalent Celsius is : "+c);
        }
        else {
            System.out.println("Invalid input Reenter numeric value....");
        }
    }
}
