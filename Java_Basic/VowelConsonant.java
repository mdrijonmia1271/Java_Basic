import java.util.Scanner;

public class VowelConsonant {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any Character = ");
        char ch = input.next().charAt(0);
        input.close();

        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
        {
            System.out.println("The Vowel = "+ch);
        }
        else if(ch>0 || ch<0 ){
            System.out.println("Not Character");
        }
        else{
            System.out.println("The Consonant = "+ch);
        }
    }
}
