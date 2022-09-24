public class stringBuilder1 {
    public static void main(String[] args) {
        
        StringBuilder sbr = new StringBuilder("Mohosin");
        System.out.println(sbr);

        sbr.append(" Islam");
        System.out.println(sbr);

        sbr.reverse();
        System.out.println(sbr);

        sbr.delete(2, 5);
        System.out.println(sbr);
    }
}
