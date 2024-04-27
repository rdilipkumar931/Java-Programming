public class WordCount {
    public static void main(String[] args) {
        String words = " Welcome Dilip , Jain University";
        int countWords = words.split("\\s").length;
        System.out.println(countWords);
    }
}
