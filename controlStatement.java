import java.util.Scanner;

public class controlStatement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Integer Number = ");
        int number = input.nextInt();
        input.close();

        if(number>0){
            System.out.println("The number is positive = "+number);
        }
        else if(number == 0){
            System.out.println("The Number is Zero = "+number);
        }
        else{
            System.out.println("The is Negative = "+number);
        }
    }
}
