*import java.util.*;

public class DictionaryCommandline  {

    private void showAllWords() {
        for (int i=0;i<Dictionary._dictionary.size();i++) {
            System.out.printf("No: %d    English:     %s    Vietnamese:     %s%n", i, Dictionary._dictionary.get(i).get_word_target(), Dictionary._dictionary.get(i).get_word_explain());
        }
    }

    public void dictionaryBasic() {
        DictionaryManagement dictionaryManagement = new DictionaryManagement();
        dictionaryManagement.insertFromCommandline();
        showAllWords();
    }