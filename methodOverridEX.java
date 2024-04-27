class Animals{

    void eat(){
        System.out.println("All Tiger eat meats");
    }
}
class Dog extends Animals{

    void lal(){  // check this line carefully
        System.out.println("Dog all so eat meat");
    }
}
class Fox extends Animals{

    @Override
    void eat() {
        System.out.println("Fox also eat meat ");
    }
}

public class methodOverridEX {
    public static void main(String[] args) {
        Animals A1 = new Dog();
        Dog D1 = new Dog();
        Fox F1 = new Fox();

        Animals x ;

        x = A1;
        x.eat();

        A1.eat();
        D1.lal();
        F1.eat();


    }
}
