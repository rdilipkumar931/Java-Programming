
class X{
    void callme(){
        System.out.println("From call x");
    }
}
class Y extends X{
    void callme(){
        System.out.println("From class y");
    }
}
class Z extends X{
    void callme(){
        System.out.println("from class z");
    }
}
public class methodDispatch {
    public static void main(String[] args) {
        Z z = new Z();
        X x = new X();
        Y y = new Y();

        X r;

        r = x;
        r.callme();
    }
}
