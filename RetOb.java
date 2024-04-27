class TestA{
    int a;
    TestA(int i){
        a=i;
    }
    TestA incrByTen(){
        TestA temp = new TestA(a+10);
        return temp;
    }
}

public class RetOb {
    public static void main(String[] args) {
        TestA ob1=new TestA(2);
        TestA ob2;

        ob2=ob1.incrByTen();
        System.out.println("ob1.a:" + ob1.a);
        System.out.println("ob2.a : " + ob2.a);
        ob2=ob2.incrByTen();
        System.out.println("ob2.a after second increase :" + ob2.a);
    }
}
