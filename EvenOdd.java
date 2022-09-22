import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter integer number = ");
        int num = input.nextInt();
        input.close();

        if(num%2 == 0){
            System.out.println("Even = "+num);
        }
        else{
            System.out.println("Odd = "+num);
        }
    }
}
