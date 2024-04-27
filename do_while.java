import java.util.Scanner;

public class do_while {
    public static void main(String[] args) {
        System.out.println( "Enter the Number :");
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        do{
            System.out.println("The number is :" +a);
            a++;
        }while (a<5);
    }
}
