package quizproject;

public class TrueFalse extends Questions {

    private boolean isTrue;

    public TrueFalse(String question, String answer){
        super(question, answer);
    }

    @Override
    public boolean checkAnswer(String anAnswer) {

        if(anAnswer.toUpperCase().equals(this.getAnswer().toUpperCase())){
            return true;
        }else{
            return false;
        }
    }
}
