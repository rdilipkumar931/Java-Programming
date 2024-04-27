abstract class animal {
    abstract void eat();

    public void run() {
        System.out.println("Every animal run ");
    }
}

class dog extends animal {
    @Override
    void eat() {
        System.out.println("Dog eat rice also ");
    }

    public void run() {
        System.out.println("Dog trots playfully");  // Specific dog running behavior
    }
}

class tiger extends animal {
    @Override
    void eat() {
        System.out.println("Tiger Eat any thing ");
    }

    public void run() {
        System.out.println("Tiger run ");
    }
}

public class demoAb {
    public static void main(String[] args) {
        tiger t = new tiger();
        dog d = new dog();
        t.eat();
        t.run();
        d.eat();
        d.run();
    }
}
