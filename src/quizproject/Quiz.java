package quizproject;

import java.util.ArrayList;
import java.util.Scanner;

//Add questions to the quiz
//Run the quiz
//Grade the quiz
public class Quiz {
    //Class variables
    private ArrayList<Questions> questions = new ArrayList<Questions>();
    private int numberOfCorrectAnswers = 0;
    private Scanner input = new Scanner(System.in);

    //Constructor
    public Quiz(){

    }

    //Methods
    public void addQuestion(Questions question){
        this.questions.add(question);
    }

    public void runQuiz(){
        //Loop through each question
        for(Questions question : questions){
            System.out.println(question.getQuestion());
            String userAnswer = this.getUserAnswer();
            boolean userAnswerCorrect = question.checkAnswer(userAnswer);
            if(userAnswerCorrect){
                numberOfCorrectAnswers++;
            }
        }
        double percentCorrect = ((double)numberOfCorrectAnswers/(double)questions.size())*100;
        System.out.println("Quiz score: " + percentCorrect + "%");
    }
    public String getUserAnswer(){
        String userAnswer = input.nextLine();
        return userAnswer;
    }



}
