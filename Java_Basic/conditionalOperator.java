import java.util.Scanner;

public class conditionalOperator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Two Interger Number = ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        input.close();

        int large = (num1>num2) ? num1:num2;
        System.out.println("The Large Number = "+large);
    }
}
