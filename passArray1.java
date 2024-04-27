public class passArray1 {
    static void vanTest(String msg , int mx[]){
        System.out.println(msg +  mx.length + "Contents :");

        for (int x : mx)
            System.out.println(x + "");
        System.out.println();
    }

    public static void main(String[] args) {
        vanTest("One vararg :" , new int[]{10});
        vanTest("Three vararg:" , new int[]{1,2,3});
    }
}
