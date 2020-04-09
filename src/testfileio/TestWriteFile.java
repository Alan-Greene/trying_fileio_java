package testfileio;

import java.io.*;

public class TestWriteFile {
    public static void main(String[] args){

        File write_file = new File("files", "names_of_week.txt");

        try (BufferedWriter bw = new BufferedWriter(new FileWriter((write_file)))){
            bw.write("Monday\n");
            bw.write("Tuesday\n");
            bw.write("Wednesday\n");
            bw.write("Thursday\n");
            bw.write("Friday\n");
            bw.write("Saturday\n");
            bw.write("Sunday\n");
        } catch (IOException e){
            System.out.println("Exception: " + e.getMessage());
        }


    }
}
