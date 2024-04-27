import java.util.Scanner;

public class ma {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int n = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println("the number is "+(n*x));

        System.out.println("the string is "+str);

    }
}
