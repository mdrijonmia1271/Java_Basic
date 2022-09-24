public class wrapperClass1 {
    public static void main(String[] args) {
        
        //Primitive -> Object-----------
        int x = 10;
        Integer y = Integer.valueOf(x);
        System.out.println("y = "+y);

        //Integer.valueof(x) //This is Autoboxing--------------
        Integer z = x;
        System.out.println("Z = "+z);

        //Object -> Primitive Data type-------------
        System.out.println("\nObject to Primitive data type : ");
        Double d = 20.25;
        System.out.println("D = "+d);

        //d.doubleValue() //This is Unboxing-----------
        double e = d;
        System.out.println("E = "+e);
    }
}
