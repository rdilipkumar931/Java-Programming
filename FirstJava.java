public class FirstJava {
    public static void main(String arg[]){
        System.out.println(" Hello Dilip, Congratulation ");
        System.out.print("Dilip Kumar "); // print method does not insert a new line at the end of the output:
        System.out.print("Welcome to jain university");
        String a  = "Dilip Kumar Roy";
        int b = 10;
        int c = 20;
        System.out.println(b+c);
        System.out.println(a);
        System.out.println("Welcome ! "+ a);
        System.out.println(20+10);

        long Sub = 4465;
        float ab=Sub;

        System.out.println(ab);

        double d = 2565.47d;
        int i = (int) d;

        System.out.println(d);
        System.out.println(i);

        String txt= "Amar sonar bangla ami tomai vlo basi ";
        System.out.println(txt.length());
        System.out.println(txt.toLowerCase());
        System.out.println(txt.toUpperCase());

        String text = "Hel \blo Mojo \bHostel";
        System.out.println(text);

        int randNum = (int) (Math.random()*101); // 0 to 100
        System.out.println(randNum);
        System.out.println(Math.random());

    }
}
