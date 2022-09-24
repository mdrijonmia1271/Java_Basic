import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Radius Number = ");
        double Radius = input.nextDouble();
        input.close();

        double Area = 3.1416*Radius*Radius;
        System.out.println("The Area of Circle = "+Area);
    }
}
