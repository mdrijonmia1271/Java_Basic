import java.util.Scanner;

public class Operator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two Interger Number = ");
        int a = input.nextInt();
        int b = input.nextInt();
        input.close();
        // int a = 10, b = 3;

        int sum = a+b;
        int sub = a-b;
        int mul = a*b;
        double div = (double)a/b;
        int mod = a%b;
        System.out.println("The Addition Number = "+sum);
        System.out.println("The Substraction Number = "+sub);
        System.out.println("The Multiplication Number = "+mul);
        System.out.println("The Divition Number = "+div);
        System.out.println("The Modulation Number = "+mod);

    }
    
}
