
class Demo{
    static int a = 43;
    static int b =54;
    int c = 24315;

    static void callme(){

        int m = 30; // how to access this variable in main class ?? is it possible??
        System.out.println("a = " + a);
    }
}
public class useStatic1 {
    public static void main(String[] args) {
        Demo.callme();
        System.out.println("b = " + Demo.b);
        Demo m= new Demo();
        System.out.println("c = " + m.c);
        System.out.println();
    }
}
