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
            System.out.println("Enter the meaning: ");
            String meaning = sc.nextLine();
            Word newWord = new Word(word, meaning);
            Dictionary._dictionary.add(newWord);
        }
    }

    protected void insertFromFile() {
        Scanner scanner = null;
        String filename_path = "src\\library.txt";
        try{
            scanner = new Scanner(new File(filename_path));

        }catch (FileNotFoundException e) {
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

    //Thêm hàm này nữa
    protected void dictionaryExportToFile(){
        String path = "src\\library.txt";
        for (int i=0;i<Dictionary._dictionary.size();i++) {
            try (FileWriter fw = new FileWriter(path, true);
                 BufferedWriter bf = new BufferedWriter(fw);
                    PrintWriter pw = new PrintWriter(bf)) {
                pw.println(Dictionary._dictionary.get(i).get_word_target() + " " + Dictionary._dictionary.get(i).get_word_explain());
            } catch (Exception e) {

            }
        }
    }

    /////////////////////////////////////////////Features///////////////////////////////////////////////////

    //////////////////////////////////Search for words //////////////////////////////////////////////////////
    protected void dictionarySearcher(){
        boolean notFound = true;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word you want to find: ");
        String input = sc.nextLine();
        String find = input.toLowerCase();

        for (int i = 0; i < Dictionary._dictionary.size(); i++) {
            String word = Dictionary._dictionary.get(i).get_word_target().toLowerCase();
            if (word.contains(find)) {
                System.out.print("Found this word: " + Dictionary._dictionary.get(i).get_word_target() + " ");
                System.out.println("Meaning: " + Dictionary._dictionary.get(i).get_word_explain());
                notFound = false;
            }
        }
        if (notFound)
            System.out.println("Not Found");
    }

    //////////////////////////////////Search for words for modifying and deleting (return the index)/////////
    private int findWord(){
        boolean notFound = true;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word you want to find: ");
        String input = sc.nextLine();
        String find = input.toLowerCase();

        for (int i = 0; i < Dictionary._dictionary.size(); i++) {
            String word = Dictionary._dictionary.get(i).get_word_target().toLowerCase();
            if (word.contains(find)) {
                notFound = false;
                return i;
            }
        }
        if (notFound)
            System.out.println("Not Found");
        return -1;
    }

    ////////////////////////Modify word/////////////////////////////////////////////////////////////////////
    protected void dictionaryModify() {
        DictionaryManagement dictionaryManagement = new DictionaryManagement();
        int index = dictionaryManagement.findWord();

        if (index != -1) {
            System.out.println("Choose your option: ");
            System.out.printf("1) Modify the word \n2) Modify the meaning \n3) Modify both its word and meaning \n");
            Scanner sc = new Scanner(System.in);
            int choose = sc.nextInt();
            sc.nextLine();

            if (choose == 1) { //Sua tu
                System.out.println("Type in your word modification: ");
                String wordModify = sc.nextLine();
                Dictionary._dictionary.get(index).setWord_target(wordModify);
            }
            else if (choose == 2) { //Sua nghia
                System.out.println("Type in your meaning modification: ");
                String meaningModify = sc.nextLine();
                Dictionary._dictionary.get(index).setWord_explain(meaningModify);
            }
            else { //Sua ca 2
                System.out.println("Type in your word modification: ");
                String wordModify = sc.nextLine();
                System.out.println("Type in your meaning modification: ");
                String meaningModify = sc.nextLine();
                Dictionary._dictionary.get(index).setWord_target(wordModify);
                Dictionary._dictionary.get(index).setWord_explain(meaningModify);
            }
            System.out.println("Done!");
        }
    }

    //////////////////////Delete word//////////////////////////////////////////
    protected void dictionaryDelete() {
        DictionaryManagement dictionaryManagement = new DictionaryManagement();
        int index = dictionaryManagement.findWord();
        if (index != -1) {
            Dictionary._dictionary.remove(index);
            System.out.println("Gone!");
        }
    }

}
