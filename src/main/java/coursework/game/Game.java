package coursework.game;

import coursework.lib.Question;
import coursework.lib.QuestionLib;

import java.util.Scanner;

public class Game {
    private QuestionLib questionLib;

    public Game() {
        questionLib = new QuestionLib();
    }

    public void run() {
        for (int questionNumber = 0; questionNumber < questionLib.getMaxQuestions(); questionNumber++) {
            System.out.println((questionNumber + 1) + ": " + questionLib.questionPrint(questionNumber));
            System.out.println(questionLib.answersPrint(questionNumber));
            //break
            answerQuestion(questionNumber);
        }
        System.out.println("You got " + questionLib.getScore() + " out of " + questionLib.getMaxQuestions());
    }

    public Question getQuestion(int num){
        return questionLib.getQuestion(num);
    }

    public QuestionLib getQuestionLib(){
        return questionLib;
    }

    private void answerQuestion(int questionNumber) {
        Scanner answer = new Scanner(System.in);
        int answerNum = answer.nextInt();
        boolean userAnswer = (questionLib.getQuestion(questionNumber).answer(answerNum));
        if (userAnswer) {
            System.out.println("Correct!");
        } else {
            System.out.println("Sorry the correct answer is: " +
                    questionLib.getQuestion(questionNumber).getCorrectCity());
        }
        questionLib.getQuestion(questionNumber).setCorrect(userAnswer);
    }
}
