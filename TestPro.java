class net{
    int  a = 29;
    int b;
    int sum(){
        System.out.println("Welcome:"+ a);
        return 0;
    }
}
class internet extends net{
    //int a ;
    void note(){
        System.out.println("sum :" + super.a);
        System.out.println(b);

    }

}
public class TestPro {
    public static void main(String[] args) {

        internet pro = new internet();
        pro.a=2000;
        pro.b=4555;
        pro.note();
        pro.sum();


    }

}