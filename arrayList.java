import java.util.ArrayList;

public class arrayList {
    public static void main(String[] args) {
        
        ArrayList<Integer> number = new ArrayList<>();

        //Adding Elements
        number.add(10);
        number.add(20);
        number.add(30);
        number.add(3, 40);
        number.add(50);

        // for(int i : number){
        //     System.out.print(i+" ");
        // }
        System.out.print("ArrayList contain = "+number);
        System.out.print("\nSize = "+number.size());

        //Removing Elements-----------------------------------------
        // number.remove(2);
        // System.out.print("\nAfter Removing ArrayList contain = "+number);
        
        //Removing All-----------------------------------
        // number.removeAll(number);
        // System.out.print("\nAfter Removing All ArrayList containg = "+number);

        //Clear ArrayList-------------------
        // number.clear();
        // System.out.print("\nAfter Clear ArrayList contain = "+number);

        //Replace mathod---------------------------
        // number.set(4, 100);
        // System.out.print("\nAfter Setting(replace) ArrayList = "+number);

        //Index Check
        int pos = number.indexOf(30);
        System.out.print("\nAfter Checking IndexOf = "+pos);
    }
}
