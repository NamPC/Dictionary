import java.util.*;
import java.io.*;

public class DictionaryManagement extends Dictionary  {

    protected void  insertFromCommandline() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of words: ");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i=0;i<n;i++) {
            System.out.println("Enter the word: ");
            String word = sc.nextLine();
            //sc.nextLine();
            System.out.println("Enter the meaning: ");
            String meaning = sc.nextLine();
            //sc.nextLine();
            Word newWord = new Word(word, meaning);
            _dictionary.add(newWord);
        }
    }

//    protected void insertFromFile() {
//        //Viet vao day
//    }
}
