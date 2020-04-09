package testfileio;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class TestFileScanner {
    public static void main(String[] args) throws IOException {
        int ni;
        int sum = 0;

        File number_file = new File("files", "number_file.txt");

        try (Scanner in = new Scanner(number_file)){
            while (in.hasNextInt()){
                ni = in.nextInt();
                sum = sum + ni;
            }
        }

        System.out.println(sum);
    }
}
