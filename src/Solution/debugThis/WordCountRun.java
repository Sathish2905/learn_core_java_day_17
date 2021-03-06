/*
 * DEBUG THIS! Exercise - Word Cound of an input file
 * 
 * Learning to read & debug existing code is an important skill.
 * Fix the errors in this program. 
 * Try not to re-write the program, just correct what's wrong.  
 * 
 * This program simply counts the words in the data.txt input file. 
 * 
 * SAMPLE OUTPUT: 
 * 
...
this
Constitution
for
the
United
States
of
America.
Word Count: 52
 */
package Solution.debugThis;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author Sathishkumar T
 */
public class WordCountRun {

    public static void main(String[] args) {
        String word;
        int wordCount = 0;
        try {
            File file = new File("data.txt");
            Scanner input = new Scanner(file);
            while (input.hasNext()) {
                word = input.next();
                System.out.println(word);
                wordCount++;
            }
            System.out.printf("Word Count: %d\n", wordCount);
        } catch (Exception e) {
            System.out.printf("ERROR: %s\n", e);
        }

    }
}
