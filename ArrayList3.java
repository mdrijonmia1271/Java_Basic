import java.util.ArrayList;
import java.util.Collections;

public class ArrayList3 {
    public static void main(String[] args) {
        
        ArrayList<Integer> number = new ArrayList<>();
        number.add(10);
        number.add(-3);
        number.add(5);
        number.add(19);
        number.add(1);
        System.out.print("Before Sorting = "+number);

        Collections.sort(number);
        System.out.print("\n After sorting in Ascending = "+number);

        Collections.sort(number,Collections.reverseOrder());
        System.out.print("\n After sorting in Decending = "+number);
    }
}
