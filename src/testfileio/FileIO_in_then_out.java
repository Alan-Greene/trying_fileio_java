package testfileio;

import java.io.*;
import java.util.Scanner;

public class FileIO_in_then_out {

    public static void main(String[] args) {

        File in_file = new File("files", "infile_numbers.txt");
        File outfile = new File("files", "outfile_numbers_data.txt");

        int sum = 0, count = 0, max = 0, min = 1000, num;

        try (Scanner in = new Scanner(in_file);
             PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(outfile)))) {

            while (in.hasNextInt()) {
                num = in.nextInt();
                sum = sum + num;
                count++;

                if (num > max){
                    max = num;
                }

                if (num < min){
                    min = num;
                }
            }

            int average = sum / count;

            pw.println(count);
            pw.println(sum);
            pw.println(min);
            pw.println(max);
            pw.println(average);

        } catch (FileNotFoundException fnf) {
            System.out.println("File not found: " + fnf.getMessage());

        } catch (IOException ioe) {
            System.out.println("IO exception: " + ioe.getMessage());

        }

    }
}
