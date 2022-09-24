import java.util.Scanner;

public class pattern {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any number = ");
        int n = input.nextInt();
        input.close();

        for(int row=1; row<=n; row++){
            for(int col=1; col<=row; col++){
                System.out.print(" "+col);
            }
            System.out.println();
        }
    }
}
