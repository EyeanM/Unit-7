package src;

import java.io.FileNotFoundException;
import java.util.*;
import java.io.File;
import java.util.Scanner;

public class Challenge3 {
    public static void main (String[]args) throws FileNotFoundException {
        Scanner input = new Scanner(new File("words2"));

        ArrayList<String> allWords = new ArrayList<String>();

        while (input.hasNext()) {
            String word = input.next();
            allWords.add(word);
        }
        System.out.println(allWords);

        // Words beginning with T
        ArrayList<String> tWords = new ArrayList<String>();
        for (String i: allWords) {
            if (i.startsWith("t")) {
                tWords.add(i);
            }
        }
        System.out.println("Words beginning with \"t\": " + tWords);

        // Words beginning with S
        ArrayList<String> sWords = new ArrayList<String>();
        for (String i: allWords) {
            if (i.endsWith("s")) {
                sWords.add(i);
            }
        }
        System.out.println("Words beginning with \"s\": " + sWords);

        // allWords reversed
        for (int i = allWords.size(); i > 0; i--) {

        }
    }
}
