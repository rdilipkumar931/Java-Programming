public class Method_Overload {
    static int myName(int x , int y){
        return x+y;
    }
    static double myName(double x , double y){
        return x+y;
    }

    public static void main(String[] args) {
        int myNum1 = myName(4,7);
        double myNum2 = myName(4.5 , 5.5);

        System.out.println(myNum1);
        System.out.println(myNum2);
    }
}
