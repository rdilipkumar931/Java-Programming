class figure{
    double dim1;
    double dim2;
    figure(double a, double b){
        dim1=a;
        dim2=b;
    }
    double area(){      //method overriding
        System.out.println("area for figure is undefine");
        return 0;
    }
}
class rectangle extends figure{
    rectangle(double a , double b){
        super(a,b);
    }
    double area(){      //method overriding
        System.out.println("Inside the rectangle");
        return dim1*dim2;
    }
}
class Triangle extends figure{
    Triangle(double a, double b){
        super(a,b);
    }
    double area() {     //method overriding
        System.out.println("Inside the triangle");
        return dim1*dim2/2;
    }
}

public class methodOverring {
    public static void main(String[] args) {
        figure f = new figure(10,10);
        rectangle r = new rectangle(9,5);
        Triangle t = new Triangle(10,8);

        figure fig;

        fig = r;
        System.out.println("area is :" +fig.area());

        fig =t;
        System.out.println("Area is :"+ fig.area());

        fig =f;
        System.out.println("Area is :"+ fig.area());
    }
}
