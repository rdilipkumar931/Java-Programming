abstract class jain{
    int a ;
    jain(int x ){
        a=x;
    }
    abstract void university();

}
class uni extends jain{
    int b = 20;

    uni(int x) {
        super(x);
    }

    void university(){
        System.out.println("abstract class testing");
    }
}

public class demoAbstract {
    public static void main(String[] args) {
        uni r = new uni(10);
        //jain m = new uni();
        System.out.println(r.a);
        r.university();
    }

}
