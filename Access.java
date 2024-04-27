
class A{
    int i ;
    //private int j;
    int j;

    void setij(int x , int y){
        i=x;
        j=y;
    }

}
class B extends A{
    int total;
    void sum(){
        total= i+j;
    }
}
public class Access {
    public static void main(String[] args) {
        B subObj = new B();
        subObj.i = 10;

        subObj.setij(3,5);

        subObj.sum();
        System.out.println(subObj.total);

    }
}
