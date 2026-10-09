package Programs.ByteStream;

import java.io.*;

public class ByteStreamExample {

    public static void main(String[] args) {

        try {
            FileInputStream fis = new FileInputStream("C:/Users/Chaturth.H.S Gowda/OneDrive/Pictures/input.jpg");
            FileOutputStream fos = new FileOutputStream("output.jpg");

            int data;

            while ((data = fis.read()) != -1) {
                fos.write(data);
            }

            fis.close();
            fos.close();

            System.out.println("File copied successfully");

        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
