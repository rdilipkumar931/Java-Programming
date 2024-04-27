import java.util.Scanner;

public class ScanerFunction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter a : ");
        int a = sc.nextInt();

        System.out.println( " Enter b :");
        int b = sc.nextInt();

        System.out.println( " Enter c : ");
        int c = sc.nextInt();

        long si = (a*b*c)/100;

        System.out.println(" result is :" + si);
    }
}
