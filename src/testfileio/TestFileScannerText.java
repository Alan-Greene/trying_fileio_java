package testfileio;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class TestFileScannerText {
    public static void main(String[] args) throws IOException {
        String line;
        int count = 1;

        File word_file = new File("files", "word_file.txt");

        try (Scanner in = new Scanner(word_file)) {
            while (in.hasNextLine()){
                line = in.nextLine();
                System.out.printf("Line number %d: %s%n", count, line);
                count++;
            }
        }

        System.out.println("end");

    }

}
