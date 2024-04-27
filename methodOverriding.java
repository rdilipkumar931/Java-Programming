class shape{
    void draw(){
        System.out.println("Inside draw method");
    }
}
class square extends shape{
    @Override
    void draw(){
        System.out.println("Inside draw sub class method");
    }
}

public class methodOverriding {
    public static void main(String[] args) {
        square s = new square();
        s.draw();
    }
}
