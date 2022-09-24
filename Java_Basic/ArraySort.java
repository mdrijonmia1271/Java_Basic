import java.util.Arrays;

public class ArraySort {
    public static void main(String[] args) {
        
        int[] numbers = {10,-3,45,67,4,90};

        Arrays.sort(numbers);
        
        System.out.print("Ascending : ");
        for(int i=0; i<numbers.length; i++){
            System.out.print(" "+numbers[i]);
        }

        System.out.print("\nDecending : ");
        for(int i=5; i>=0; i--){
            System.out.print(" "+numbers[i]);
        }

        String[] names = {"Rijon","Mohosin","Anis","Momin"};

        Arrays.sort(names);

        System.out.print("\nAscending Name : ");
        for(int i=0; i<names.length; i++){
            System.out.print(" "+names[i]);
        }
        System.out.print("\nDecending Name : ");
        for(int i=3; i>=0; i--){
            System.out.print(" "+names[i]);
        }
    }
}
