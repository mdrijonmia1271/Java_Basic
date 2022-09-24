import java.util.Scanner;

public class primeNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter  Integer Start number = ");
        int start = input.nextInt();
        System.out.print("Enter Integer End Number = ");
        int end = input.nextInt();
        input.close();

        int count = 0, totalPrime = 0;
        for(int i=start; i<=end; i++)
        {
            for(int j=2; j<i; j++)
            {
                if(i%j==0){
                    count++;
                    break;
                }
            }
            if(count==0)
                {
                    System.out.println(i);
                    totalPrime++;
                }
                count = 0;
            
        }
        System.out.println("total Priem = "+totalPrime);
 
    }
}
