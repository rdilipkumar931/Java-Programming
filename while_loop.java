import java.util.Scanner;

public class while_loop {
    public static void main(String[] args) {
        System.out.println( "Enter the Number :");
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();


        while (a<5){
            System.out.println(a);
            a++;
        }
    }
}
