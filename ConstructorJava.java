public class ConstructorJava {
    int x = 20;
    String s;

    ConstructorJava( int y){
        x = y;
    }

    public static void main(String[] args) {
        ConstructorJava myObj = new ConstructorJava(27);
        ConstructorJava myObj1 = new ConstructorJava(33);
        ConstructorJava myObj2 = new ConstructorJava(500);

        myObj.x = 201;
        //myObj1.s = "Dilip";
        System.out.println(myObj1.x);
        System.out.println(myObj2.x);
        System.out.println(myObj.x);
        System.out.println(myObj.s);

    }
}
