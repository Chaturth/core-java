package Programs.Oops;

public class StringOperationRunner {

    public static void main(String[] args) {

        StringManipulation s = new StringManipulation();

        s.search("Java Programming", 'a');

        s.search("Java Programming", "Java");

        s.search("java is easy Java is powerful", "Java", 10);
    }
}