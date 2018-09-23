public class Word {
    private String _word_target; //new word
    private String _word_explain; //definition

    //Constructor
    Word(String word_target, String word_explain) {
        this._word_target = word_target;
        this._word_explain = word_explain;
    }

    //Setter
    public void setWord_target(String word_target) {
        this._word_target = word_target;
    }
    public void setWord_explain(String word_explain) {
        this._word_explain = word_explain;
    }

    //Getter
    public String get_word_target() {
        return this._word_target;
    }
    public String get_word_explain() {
        return this._word_explain;
    }
}
