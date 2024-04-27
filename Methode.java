public class Methode {
    public static void main(String[] args) {
        System.out.println("Welcome in Method ");
        myMethod();
        Num("Dilip" , 25);
        Num("Sumon" , 45);
        Num("jibon" , 40);
        Love(10);
    }
    static void myMethod(){
        int  a= 10;
        int  b= 20;
        System.out.println("sum :" + (a+b));
    }
    static void Num(String fname , int age){
        System.out.println(fname + " is " + age);
    }
    static int Love( int x ){
        return (5+x);
    }
}