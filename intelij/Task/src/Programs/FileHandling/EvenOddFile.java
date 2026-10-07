package Programs.FileHandling;
import java.io.*;

public class EvenOddFile {

    public static void main(String[] args) {

        try {

            BufferedWriter writer =
                    new BufferedWriter(new FileWriter("numbers.txt"));

            writer.write("10");
            writer.newLine();
            writer.write("25");
            writer.newLine();
            writer.write("36");
            writer.newLine();
            writer.write("41");
            writer.newLine();
            writer.write("52");
            writer.newLine();
            writer.write("67");
            writer.newLine();
            writer.write("80");

            writer.close();

            BufferedReader br =
                    new BufferedReader(new FileReader("numbers.txt"));

            BufferedWriter even =
                    new BufferedWriter(new FileWriter("even.txt"));

            BufferedWriter odd =
                    new BufferedWriter(new FileWriter("odd.txt"));

            String line;

            while ((line = br.readLine()) != null) {

                int number = Integer.parseInt(line);

                if (number % 2 == 0) {

                    even.write(String.valueOf(number));
                    even.newLine();

                } else {

                    odd.write(String.valueOf(number));
                    odd.newLine();
                }
            }

            br.close();
            even.close();
            odd.close();

            System.out.println("Numbers created successfully.");
            System.out.println("Even and odd numbers separated successfully.");

        } catch (IOException e) {

            System.out.println("Error processing file.");
        }
    }
}
