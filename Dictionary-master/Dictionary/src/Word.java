import java.io.Serializable;

public class Word implements Serializable{
    private static final long serialVersionUID = 1L;
    private String _word_target; //new word
    private String _word_explain; //definition

    //Constructor
    Word() {
        this._word_target = "default";
        this._word_explain = "default";
    }

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
    public String get_word_target() { return this._word_target; }
    public String get_word_explain() {
        return this._word_explain;
    }
}
