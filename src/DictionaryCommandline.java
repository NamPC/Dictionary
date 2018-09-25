public class DictionaryCommandline  {

    private void showAllWords() {
        for (int i = 0; i < Dictionary._dictionary.size(); i++) {
            System.out.printf("No: %d    English:     %s    Vietnamese:     %s%n", i, Dictionary._dictionary.get(i).get_word_target(), Dictionary._dictionary.get(i).get_word_explain());
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
        dictionaryManagement.dictionaryModify();
        dictionaryManagement.dictionaryDelete();
        dictionaryCommandline.showAllWords();
    }
}