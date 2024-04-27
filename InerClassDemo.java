class outer{
    static int outer_x= 100;
    int outer_y = 200;

    void test(){
        Inner inner = new Inner();// to access inner non-static class context , first need  creating the object of that inner class
        inner.display();
    }
    static class Inner{  // inner nested class
        void display(){
            System.out.println( " display : outer_x = " + outer_x);
           // System.out.println(" Display : outer_y =" + outer_y); // outer-y cannot be accessible because static class can only access static variable
        }
    }
}

public class InerClassDemo {
    public static void main(String[] args) {
        outer dm = new outer();
        dm.test();
    }
}
