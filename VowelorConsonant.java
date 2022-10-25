import java.util.Scanner;

public class VowelorConsonant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a character");
        char val = scanner.next().charAt(0);
        char ch=val.toLowerCase(val);
        switch (ch)
        {
            case 'a':
            case 'e' :
            case 'i':
            case 'o':
            case 'u':
                System.out.println(character + " is vowel.");
                break;
            default:
                System.out.println(character + " is consonant.");
                break;

        }


    }
}