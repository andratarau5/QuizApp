package sample;

import java.util.List;

public class Question {

    private int index;
    private String text;
    private List<Answers> answers;

    public Question(int index, String text, List<Answers> answers) {
        this.index = index;
        this.text = text;
        this.answers = answers;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public List<Answers> getAnswers() {
        return answers;
    }

    public void setAnswers(List<Answers> answers) {
        this.answers = answers;
    }
}
