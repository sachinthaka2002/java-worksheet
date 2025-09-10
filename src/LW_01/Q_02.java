package LW_01;

import java.util.Scanner;

public class Q_02 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter your full name: ");
        String fullname= scanner.nextLine();
        String [] parts= fullname.split(" ");

        String firstName = parts[0];
        String middleName = parts[1];
        String lastName = parts[2];

        char middleInitial = middleName.charAt(0);

        System.out.println(lastName+" "+firstName+"."+middleInitial);

        scanner.close();

    }
}
