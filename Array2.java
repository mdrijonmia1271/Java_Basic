import java.util.Scanner;

public class Array2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 5 numbers = ");

        double[] numbers = new double[5];
        double sum = 0;

        for(int i=0; i<numbers.length; i++){
            numbers[i] = input.nextDouble();
            
        }
        for(int i=0; i<numbers.length; i++){
            sum = sum+numbers[i];

        }
        System.out.print("Result of Array sum = "+sum);
        double avg = sum/numbers.length;
        System.out.print("\nResult of Arry Avarage  = "+avg);

        double max = numbers[0];
        double min = numbers[0];
        for(int i=1; i<numbers.length; i++){
            if(max<numbers[i]){
                max = numbers[i];
            }
            if(min>numbers[i]){
                min = numbers[i];
            }
        }
        System.out.println("\nArray of maximum number = "+max);
        System.out.println("Arrry of minimun number = "+min);
    }
}
