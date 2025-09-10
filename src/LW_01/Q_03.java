package LW_01;

import java.util.Scanner;

public class Q_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter length(cm): ");
        double cm = scanner.nextDouble();

        double totalInches = cm/2.54;
        int feet = (int) totalInches/12;
        double inches = totalInches % 12;
        System.out.println(cm+" cm"+feet+" feet" +inches+" inches");
    }
}
