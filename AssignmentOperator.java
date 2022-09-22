import java.util.Scanner;

public class AssignmentOperator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter First Integer Number A = ");
        int a = input.nextInt();
        System.out.print("Enter Sedond Integer Number B = ");
        int b = input.nextInt();
        input.close();

        a += b;
        System.out.println("Add = "+a);
        a -=b;
        System.out.println("Sub = "+a);
        a *=b;
        System.out.println("Mul = "+a);
        a /=b;
        System.out.println("Div = "+(double)a);
        a %=b;
        System.out.println("Mod = "+a);
    }
}
