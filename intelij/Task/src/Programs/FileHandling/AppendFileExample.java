package Programs.FileHandling;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class AppendFileExample {
    public static void main(String[] args) {


        try {
            FileWriter writer = new FileWriter("student.txt");

            writer.write("Student ID:02 \n");
            writer.write("Student name:Meena \n");
            writer.write("marks:80 \n");
            writer.write("Student ID:03\n");
            writer.write("Student name:Ravi \n");
            writer.write("marks:90\n");
            writer.close();
            System.out.println("Data appended successfully");
        } catch (IOException e) {
            System.out.println("Error , while appending data");


        }

    }
}

