public class Class_object {

    int x = 85;

    public static void main(String[] args) {
        Class_object myObj = new Class_object();
        System.out.println(myObj.x);
        int x1 = 29;

        myStaticMethod();

        System.out.println(x1);

        myObj.myPublicMethod();
        System.out.println();

    }
    static int name(){
        int a;
        return a = 75;
    }
    // static can accessible without creating object.
    static void myStaticMethod() {
        int a = 100;
        System.out.println("Static methods can be called without creating objects");
    }
    // public method can only accessible creating object . 
    public void myPublicMethod() {
        int b = 200;
        System.out.println("Public methods must be called by creating objects");
    }

}