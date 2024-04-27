
    // Abstract class
    abstract class Animal {
        int a = 100 ; // how to access this variable in main class 

        public int getA() {
            return a;
        }

        // Abstract method (does not have a body)
        public abstract void animalSound();
        // Regular method
        public void sleep() {
            System.out.println("Zzz");
        }
    }

    // Subclass (inherit from Animal)
    class Pig extends Animal {
        public void animalSound() {
            // The body of animalSound() is provided here
            System.out.println("The pig says: wee wee");
        }
    }

    class AbstractCls {
        public static void main(String[] args){

//            Animal myObj = new Animal() {
//                @Override
//                public void animalSound() {
//
//                }
//            }

            Pig myPig = new Pig(); // Create a Pig object
            myPig.animalSound();
            myPig.sleep();
        }
    }

