import java.util.*;
import java.io.*;

public class DictionaryManagement {

    protected void insertFromCommandline() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of words: ");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the word: ");
            String word = sc.nextLine();
            //sc.nextLine();
            System.out.println("Enter the meaning: ");
            String meaning = sc.nextLine();
            //sc.nextLine();
            Word newWord = new Word(word, meaning);
            Dictionary._dictionary.add(newWord);
        }
    }

    //    protected void dictionaryLookup() {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the word: ");
//        String find = sc.nextLine();
//
//    }
    protected void insertFromFile() {
        Scanner scanner = null;
        try {
            scanner = new Scanner(new File("D:\\Github\\Dictionary\\src\\library.txt")); // Sua lai duong link theo may m

        } catch (FileNotFoundException e) {

            scanner = new Scanner(System.in);
            System.out.println("File not found");
        }

        while (scanner.hasNext()) {
            String word_target = scanner.next();
            String word_meaning = scanner.nextLine();
            Word newWord = new Word(word_target,word_meaning);
            Dictionary._dictionary.add(newWord);
        }
    }
}
