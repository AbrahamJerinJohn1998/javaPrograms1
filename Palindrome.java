import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = sc.next();
        char ch[]=str.toCharArray();
        String rev="";

       for (int i = ch.length-1; i >=0; i--) {
           rev = rev+ch[i];
        }
        System.out.println("The reverse of the string is:-"+rev);

        if(rev.equals(str))
        {
            System.out.println("String is palindrome.");
        }
        else
        {
            System.out.println(" String is not palindrome.");
        }
    }
}