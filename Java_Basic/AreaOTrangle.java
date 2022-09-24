import java.util.Scanner;

public class AreaOTrangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Trangle Base = ");
        double Base = input.nextDouble();
        System.out.print("Enter Trangle Hight = ");
        double Hight = input.nextDouble();
        input.close();

        Double Area = 0.5*Base*Hight;
        System.out.println("The Trangle Area = "+Area);

    }
}
