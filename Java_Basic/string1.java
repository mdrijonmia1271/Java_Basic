

public class string1 {
    public static void main(String[] args) {
        
        String firstName = "Mohosin";
        String lastName = " Islam";
        
        //Use concat Mathod-------------
        String fullName = firstName.concat(lastName);
        System.out.print("FullName = "+fullName);

        //Use to UpperCase---------------
        String upperName = fullName.toUpperCase();
        System.out.print("\nUpperName = "+upperName);

         //Use to LowerCase---------------
         String lowerName = fullName.toLowerCase();
         System.out.print("\nLowerName = "+lowerName);

         //Checking Start Character--------------------
         boolean first = firstName.startsWith("Mo");
         System.out.print("\nStart Name Mo = "+first);

         //Checking End Character--------------------
         boolean end = lastName.endsWith("l");
         System.out.print("\nEnd Name M = "+end);

         System.out.print("\n\nSecond Part------------------------------");

         String country = "Bangladesh in my country";
         //index value show------
         char ch = country.charAt(0);
         System.out.print("\nIndex of value = "+ch);

         // pringting Acci value-------------
         int value = country.codePointAt(0);
         System.out.print("\nIndex of Acci value = "+value);

        // pringting Index of-------------
        int pos = country.indexOf("n");
        System.out.print("\nIndex of  = "+pos);

        // pringting last Index of-------------
        int lastIndex = country.lastIndexOf("n");
        System.out.print("\nLast Index of  = "+lastIndex);

        System.out.print("\n\nThard Part-------------------------------------");

        String s1 = "01752-501271";
        System.out.print("\n"+s1);

        String s2 = s1.replace('7','9');
        System.out.print("\nReplace digit = "+s2);

        //The Split Result Checking -----------
        String[] s3 = s1.split("-");
        for(String x : s3){
            System.out.print("\n"+x);
        }
    }
}
