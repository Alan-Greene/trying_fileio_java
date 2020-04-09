package testfileio;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.File;

public class TestFileIO {

    public static void main(String[] args) throws IOException {
	    String s;

	    // File my_dir = new File("files");
	    File my_file = new File("files", "test_file.txt");

	    try (BufferedReader in = new BufferedReader(new FileReader(my_file))){
	        while ((s = in.readLine()) != null){
                System.out.println(s);
            }
        }

    }
}
