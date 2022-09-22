import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Celsius Number = ");
        double Celsius = input.nextDouble();
        input.close();

        double Fahrenheit = (1.8)*Celsius+32;
        System.out.println("The Fahrenheit Temperature = "+Fahrenheit); 
    }
}
