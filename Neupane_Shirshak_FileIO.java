import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/*
 * @author: Shirshak Neupane
 * Assignment: Programming Assignment
 * Course: CSCI 4011
 * Date: 02/15/2026
 * File Name: Neupane_Shirshak_FileIO
 * 
 * 
 * Description:
 * This program opens an input file named "in.txt" and creates an output file called "out.txt"
 * It read the data of the input file line by line and writes each line into the output file. 
 * After that both files are closed.
 * 
 */
public class Neupane_Shirshak_FileIO {
    public static void main(String[] args) {

        try {

            // creating a file object for file
            File infile = new File("in.txt");

            // creating a scanner object to read input file
            Scanner input = new Scanner(infile);

            try {

                // creating a file object for output file
                File outfile = new File("out.txt");

                // creating a PrintWriter object to write into output file
                PrintWriter out = new PrintWriter(outfile);

                // reading the input file line by line
                while (input.hasNextLine()) {

                    String line = input.nextLine();

                    // writing each line into the output file
                    out.println(line);

                }

                // closing the input file
                input.close();

                // closing the output file
                out.close();

            }
            // handeling exception for output file
            catch (FileNotFoundException e) {
                System.out.println("Error: Output file can't be opened.");
                input.close();

            }
        }

        // handeling exception input file
        catch (FileNotFoundException e) {
            System.out.println("Error: File not found.");
        }
    }

}
