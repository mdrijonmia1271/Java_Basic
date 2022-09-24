import java.util.Scanner;


public class array2D2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Input A Matrix = " );

        int[][] A = new int[3][3];
        int[][] B = new int[3][3];
        
        //Getting inpur for A Matrix
        for(int row=0; row<3; row++){
            for(int col=0; col<3; col++){
                System.out.printf("A[%d][%d] = ",row,col);
                A[row][col] = input.nextInt();
            }
        }
         //Getting inpur for B Matrix
         System.out.println("Enter Input B Matrix = ");
         for(int row=0; row<3; row++){
            for(int col=0; col<3; col++){
                System.out.printf("B[%d][%d] = ",row,col);
                B[row][col] = input.nextInt();
            }
        }
        // Printing A Matrix
        System.out.println("Output for A Matrix : ");
        for(int row=0; row<3; row++){
            for(int col=0; col<3; col++){
                System.out.print(" "+A[row][col]);
            }
            System.out.println();
        }

        // Printing B Matrix
        System.out.println("OutPut for B Matrix : ");
        for(int row=0; row<3; row++){
            for(int col=0; col<3; col++){
                System.out.print(" "+B[row][col]);
            }
            System.out.println();
        }
        //Printing A+B Matrix 
        System.out.println("OutPut A+B Matrix : ");
        for(int row=0; row<3; row++){
            for(int col=0; col<3; col++){
                System.out.print(" "+(A[row][col] + B[row][col]));
            }
            System.out.println();
        }
        input.close();
    }
}
