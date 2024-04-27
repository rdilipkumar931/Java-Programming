
class A1{
    A1(){
        System.out.println("Inside A1 constructor");
    }
}
class B1 extends A1{
    B1(){
        System.out.println("Inside B constructor");
        }
}
class C1 extends B1{
    C1(){
        System.out.println("Inside C constructor");
    }
}
public class calledConstruction {
    public static void main(String[] args) {
        C1 cons = new C1();
    }
}
