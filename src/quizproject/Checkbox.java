package quizproject;

public class Checkbox extends Questions{
    //Class variables

    public Checkbox(String question, String answer) {
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



}
