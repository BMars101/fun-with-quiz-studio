package quizproject;

public class QuizRunner {
    public static void main(String[] args) {
    Quiz myQuiz = new Quiz();

    MultipleChoice question = new MultipleChoice("In what season do you typically see snow? Enter the letter corresponding with the correct answer \nA: Summer \nB: Fall \nC: Winter \nD: Spring", "C");

    Checkbox cbQuestion = new Checkbox("What are the components of a healthy lifestyle? \nA: Diet \nB: binge drinking \nC: Exercise \nD: none of the above", "A C");

    TrueFalse tfQuestion = new TrueFalse("Sleep is a necessary part of life.", "True");

    myQuiz.addQuestion(question);
    myQuiz.addQuestion(cbQuestion);
    myQuiz.addQuestion(tfQuestion);

    myQuiz.runQuiz();


    }
}
