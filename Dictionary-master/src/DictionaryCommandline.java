import java.util.*;
public class DictionaryCommandline  {
    public boolean closeApp = false;


    private void showAllWords() {
        for (int i = 0; i < Dictionary._dictionary.size(); i++) {
            System.out.printf("No: %d    |English: %s     |Vietnamese: %s%n", i, Dictionary._dictionary.get(i).get_word_target(), Dictionary._dictionary.get(i).get_word_explain());
        }
    }

    public void dictionaryBasic() {
        DictionaryManagement dictionaryManagement = new DictionaryManagement();
        dictionaryManagement.insertFromCommandline();
        DictionaryCommandline dictionaryCommandline = new DictionaryCommandline();
        dictionaryCommandline.showAllWords();
    }

    public void dictionaryAdvanced() {
        DictionaryManagement dictionaryManagement = new DictionaryManagement();
        DictionaryCommandline dictionaryCommandline = new DictionaryCommandline();
        dictionaryManagement.insertFromFile();
        dictionaryCommandline.showAllWords();

        ///////////////Features//////////////////////
        while(!closeApp) {
            System.out.println("|-----------------------------------------------------------------------------------------|");
            System.out.print("|OPTIONS:\n|1) Lookup some words\n|2) Modify some words\n|3) Delete some words\n|0) Close App\n");
            System.out.println("|Choose your option: ");
            System.out.println("|-----------------------------------------------------------------------------------------|");
            Scanner sc = new Scanner(System.in);
            String user_input = sc.nextLine();
            if(user_input.equals("0")){
                System.out.println("App closed!");
                closeApp = true;
            }
            else if(user_input.equals("1")){
                dictionaryManagement.dictionarySearcher();
            }
            else if(user_input.equals("2")) {
                dictionaryManagement.dictionaryModify();
                dictionaryCommandline.showAllWords();
            }
            else if(user_input.equals("3")){
                dictionaryManagement.dictionaryDelete();
                dictionaryCommandline.showAllWords();
            }

        }
    }
}