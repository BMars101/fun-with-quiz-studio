package quizproject;

import java.util.ArrayList;

public class MultipleChoice extends Questions{

    ArrayList<String> options;

    public MultipleChoice(String question, String answer){
        super(question, answer);

    }

    @Override
    public boolean checkAnswer(String anAnswer) {
        String actualAnswer = this.getAnswer().toUpperCase();
        if(anAnswer.toUpperCase().equals(actualAnswer)){
            return true;
        }else{
            return false;
        }
    }

    public ArrayList<String> getOptions() {
        return options;
    }

    public void addOption(String option){
        options.add(option);
    }
}
