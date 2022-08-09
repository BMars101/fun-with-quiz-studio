package quizproject;

import java.lang.reflect.Array;
import java.util.ArrayList;

public abstract class Questions {

    private String question;
    private String answer;


    public Questions(String question, String answer){
        this.question = question;
        this.answer = answer;
    }

    public String getQuestion() {
        return question;
    }
    public String getAnswer(){
        return answer;
    }

    public abstract boolean checkAnswer(String anAnswer);


}
