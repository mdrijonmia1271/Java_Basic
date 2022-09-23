import java.util.ArrayList;

public class ArrayList2 {
    public static void main(String[] args) {
        
        ArrayList<Integer> number1 = new ArrayList<>();
        ArrayList<Integer> number2 = new ArrayList<>();
        ArrayList<Integer> number3 = new ArrayList<>();

        number1.add(10);
        number1.add(20);
        number1.add(30);
        number1.add(40);
        System.out.print("Number1 = "+number1);
        number2.add(1);
        number2.add(2);
        number2.add(3);
        number2.add(4);
        number2.add(5);
        System.out.print("\nNumber2 = "+number2);
        number3.addAll(number1);
        System.out.print("\nNumber3 = "+number3);

        boolean Result = number1.equals(number2);
        System.out.print("\n Number1 == Number2  = "+Result);

        boolean Result1 = number1.equals(number3);
        System.out.print("\n Number1 == Number3  = "+Result1);

    }
}
