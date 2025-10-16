package LW_03;

import java.util.Scanner;
public class Q_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the temperature(in celsius): ");

        if (scanner.hasNextDouble()){
            double C = scanner.nextDouble();

            Temperature temp = new Temperature();
            temp.setCelsius(C);

            double F = temp.toFahrenheit();
            System.out.println("Equivalent Farenheit: "+F);

        }
        else {
            System.out.println("Re-Enter please enter the numeric values.....");
        }

    }

}


class Temperature{
    private double celsius;

    public Temperature(){
        this.celsius = 0.0;
    }
    public Temperature(double celsius){
        this.celsius = celsius;
    }

    public double toCelsius(){
        return this.celsius;
    }

    public double toFahrenheit(){
        return this.celsius * (9.0 / 5.0) + 32.0;
    }

    public void setCelsius(double celsius){
        this.celsius = celsius;
    }

    public void setFahrenheit(double Fahrenheit){
        this.celsius = (Fahrenheit-32.0) * 5.0 / 9.0;
    }


}