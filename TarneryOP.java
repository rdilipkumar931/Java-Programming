import java.util.Scanner;

public class TarneryOP {
    public static void main(String[] args) {
        System.out.println(" Enter the Number:");
        Scanner sc = new Scanner(System.in);
        int num  = sc.nextInt();

        String res;

        if (num % 2 == 0){
            res = " Even Number ";
        }else {
            res = " Odd Number ";
        }

        String ans = num % 2 == 0 ? " Even Number ":"Odd number";
        System.out.println( ans );

        //System.out.println(res);
    }
}
