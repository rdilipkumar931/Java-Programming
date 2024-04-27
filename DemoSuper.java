class DemoBox{
    double width;
    double height;
    double depth;
    double weight;

    DemoBox(DemoBoxWeigh ob){
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
        weight = ob.weight;
    }
    DemoBox(double x, double y,double z, double m){
        width = x;
        height = y;
        depth = z;
        weight = m;
    }
    DemoBox(){
        height = -1;
        width = -1;
        depth = -1;
    }
    DemoBox(double len){
        width=height=depth=len;
    }
    double volume(){
        return width*height*depth*weight;
    }
}
class DemoBoxWeigh extends DemoBox{
    double weight;
    DemoBoxWeigh(DemoBoxWeigh obj){
        super(obj);
        weight = obj.weight;
    }
    DemoBoxWeigh(double w ,double h ,double d, double m){
        super(w,h,d,m);
        weight=m;
    }
    DemoBoxWeigh(){
        super();
        weight = -1;
    }
    DemoBoxWeigh(double len , double m){
        super(len);
        weight = m;
    }
}

public class DemoSuper {
    public static void main(String[] args) {
        DemoBoxWeigh myBox1 = new DemoBoxWeigh(10,20,15,34.3);
        DemoBoxWeigh myBox2 = new DemoBoxWeigh(2,3,4,0.076);
        DemoBoxWeigh myBox3 = new DemoBoxWeigh();
        DemoBoxWeigh myCube = new DemoBoxWeigh(3,2);
        DemoBoxWeigh myclone = new DemoBoxWeigh(myBox1);
        double val;

        val = myBox1.volume();
        System.out.println("volume of myBox1 is:" + val);
        System.out.println("weight of myBox1 is :" + myBox1.weight);
        System.out.println();

        val =myBox2.volume();
        System.out.println("volume of myBox2 is:" + val);
        System.out.println("weight of myBox2 is :" + myBox2.weight);
        System.out.println();

        val =myBox3.volume();
        System.out.println("volume of myBox3 is:" + val);
        System.out.println("weight of myBox3 is :" + myBox3.weight);
        System.out.println();

        val =myclone.volume();
        System.out.println("volume of myclone is:" + val);
        System.out.println("weight of myclone is :" + myclone.weight);
        System.out.println();

        val =myCube.volume();
        System.out.println("volume of myBox1 is:" + val);
        System.out.println("weight of myBox1 is :" + myCube.weight);
    }
}
