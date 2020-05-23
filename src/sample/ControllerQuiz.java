package sample;

import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.layout.VBox;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ControllerQuiz {


    public Tab tabQ1;
    public Tab tabQ2;
    public Tab tabQ3;
    public Tab tabQ4;
    public Tab tabQ5;
    public Tab tabQ6;
    public Tab tabQ8;
    public Tab tabQ9;
    public Tab tabQ10;
    public TabPane tabPane;


    public void initialize() throws IOException {
        // add all the questions
        // how to populate the tabs

        File file = new File("C:\\Users\\Andra\\Desktop\\Fic\\documents\\Software Academy\\Programs\\QuizApp\\src\\sample\\Questions&Answers");
        BufferedReader br = new BufferedReader(new FileReader(file));
        br.readLine();



        //Question[] questions = new Question[0];

        List<Question> questions = new LinkedList<>();
        for (Question quest:questions) {
            Tab tab = new Tab("Q" + quest.getIndex());
            VBox vbox = new VBox();
            Label label = new Label(quest.getText());

            vbox.getChildren().add(label);
            //List<CheckBox> checkBoxes = new ArrayList<>();

            for (Answers answ:quest.getAnswers()) {
                CheckBox checkBox = new CheckBox(answ.getText());
                vbox.getChildren().add(checkBox);
            }
            tab.setContent(vbox);
            tabPane.getTabs().add(tab);
        }

    }

}
