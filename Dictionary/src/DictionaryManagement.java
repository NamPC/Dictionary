import java.util.*;
import java.io.*;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DictionaryManagement  {

    /*protected void  insertFromCommandline() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of words: ");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i=0;i<n;i++) {
            System.out.println("Enter the word number " + (i+1) +" :");
            String word = sc.nextLine();
            //sc.nextLine();
            System.out.println("Enter the meaning for above word " + (i+1) +" :");
            String meaning = sc.nextLine();
            //sc.nextLine();
            Word newWord = new Word(word, meaning);
            _dictionary.add(newWord);
        }
    }*/
    //Tạm thời cắt kết nối Dictionary và DictionaryCommandLine để test
    protected void insertFromFile() {
        Word w1 = new Word("Hello", "Xin chao");
        try {
            //Tạo 1 file English.txt chứa Hello và Xin chao
            FileOutputStream fos = new FileOutputStream("C:\\Users\\ADMIN\\Documents\\GitHub\\Dictionary\\data\\English.txt");
            ObjectOutputStream ous = new ObjectOutputStream(fos);
            ous.writeObject(w1);

            ous.close();

            //Truyền 2 dữ liệu trong English.txt vào _word
            FileInputStream fis = new FileInputStream("C:\\Users\\ADMIN\\Documents\\GitHub\\Dictionary\\data\\English.txt");
            BufferedInputStream bis = new BufferedInputStream(fis);
            ObjectInputStream ois = new ObjectInputStream(bis);
            Word _word = (Word) ois.readObject();
            System.out.println(_word.get_word_explain());

            fis.close();
            ois.close();

        }catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
