import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        System.out.println("Enter the Char :");
        char a = cs.next().charAt(0);

        switch (a){
            case 'a','e','i','o','u' :
                System.out.println(" This is Vowel");
                break;

            default:
                System.out.println(" This is Consonant");
        }
    }
}
