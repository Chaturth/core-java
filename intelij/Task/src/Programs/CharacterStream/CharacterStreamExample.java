package Programs.CharacterStream;

import java.io.*;

public class CharacterStreamExample {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("data.txt");
            fw.write("Hello Java, I/O Streams\n");
            fw.write("Welcome");
            fw.close();

            FileReader fr = new FileReader("data.txt");
            int ch;

            while((ch = fr.read()) != -1) {
                System.out.print((char) ch);
            }

            fr.close();
        } catch(IOException e) {
            System.out.println(e);
        }
    }
}
