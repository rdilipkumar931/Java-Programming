import java.util.Scanner;

public class recursion {
    public static void main(String[] args) {
        System.out.println(" enter the Number :");
        Scanner sc = new Scanner(System.in);
        //int m =sc.nextInt();
        int a =rec(sc.nextInt());
        System.out.println(a);

    }
    public static int rec(int k ){
        if (k>0){
            return k + rec(k-1);
        }else {
            return 0;
        }
    }
}
