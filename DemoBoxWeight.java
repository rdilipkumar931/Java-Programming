class Box{
    double width;
    double height;
    double depth;

    Box(Box ob){
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }
    Box(double x, double y,double z){
        width = x;
        height = y;
        depth = z;
    }
    Box(){
        height = -1;
        width = -1;
        depth = -1;
    }
    Box(double len){
        width=height=depth=len;
    }
     double volume(){
        return width*height*depth;
    }
}
class BoxWeight extends Box{
    double weight;
    BoxWeight(double w ,double h ,double d, double m){
        width =w;
        height=h;
        depth=d;
        weight=m;
    }
}

public class DemoBoxWeight {
    public static void main(String[] args) {
        BoxWeight myBox1 = new BoxWeight(10,20,15,34.3);
        BoxWeight myBox2 = new BoxWeight(2,3,4,0.076);
        double val;

        val = myBox1.volume();
        System.out.println("volume of myBox1 is:" + val);
        System.out.println("weight of myBox1 is :" + myBox1.weight);

        val =myBox2.volume();
        System.out.println("volume of myBox1 is:" + val);
        System.out.println("weight of myBox1 is :" + myBox2.weight);
    }
}
