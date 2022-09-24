import java.util.Scanner;

public class InputClass {
    public static void main(String[] args){
       Scanner input = new Scanner(System.in);

       System.out.print("What's Your Name = ");
       String Name = input.nextLine();
       System.out.println("Your Name is = "+Name);

       System.out.print("\nEnter any Integer Number = ");
       int Number = input.nextInt();
       System.out.println("Your pass the Number = "+Number);

       System.out.print("\nEnter Float Number  = ");
       float Number1 = input.nextFloat();
       System.out.println("Your Float Number = "+Number1);
       
       input.close();

    
    }
}
