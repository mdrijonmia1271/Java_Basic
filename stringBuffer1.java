public class stringBuffer1 {
    public static void main(String[] args) {
        
        String s1 = "Rijon";
        StringBuffer sb = new StringBuffer(s1);
        System.out.println(sb);

        //Adding Element-------------
        sb.append(" Islam");
        sb.append(71);
        System.out.println(sb);

        //Reverse elsements--------------
        sb.reverse();
        System.out.println(sb);

        //Deleting elements--------------
        sb.delete(0, 3);
        System.out.println(sb);

        //set String length-------
        sb.setLength(6);
        System.out.println(sb);

    }
}
