package Programs.FileHandling;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class WriteFileExample {

    public static void main(String[] args) {



        try{
            FileWriter writer = new FileWriter("student.txt");
            writer.write("Student ID: 01 \n");
            writer.write("Stdent name: Akash \n");
            writer.write("Course:Core java\n");
            writer.write("Marks: 70\n");


            writer.close();
            System.out.println("Data written successfully.");


        } catch (IOException e) {

            System.out.println("Error while writing file.");

        }
        }
    }

