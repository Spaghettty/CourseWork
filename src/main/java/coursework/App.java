package coursework;

import coursework.lib.QuestionLib;
import java.util.Scanner;

public class App {
	public QuestionLib questionLib;

	public static void main(String[] args) {
		App app = new App();
		for (int questionNumber = 0; questionNumber < app.questionLib.getMaxQuestions(); questionNumber++){
			System.out.println((questionNumber + 1) + ": " + app.questionLib.questionPrint(questionNumber));
			System.out.println(app.questionLib.answersPrint(questionNumber));
			//break
			app.answerQuestion(questionNumber);
		}
		System.out.println("You got " + app.questionLib.getScore() + " out of " + app.questionLib.getMaxQuestions());
		// Can you go to one monitor I can't see shite
		// can you see now?
		// try that..., I've just remembered I have to remove all of these comments
		// works like a fucking charm
		// yep... now you just have to a make a GUI...
		// that's the fun part
	}

	public App(){
		questionLib = new QuestionLib();
	}

	public void answerQuestion(int questionNumber){

		Scanner answer = new Scanner(System.in);
		int answernum;
		answernum = answer.nextInt();
		System.out.println(answernum);
		// This will tell you if the answer is correct
		// it's working
		boolean userAnswer = (questionLib.getQuestion(questionNumber).answer(answernum));
		if(userAnswer) {
			System.out.println("yay");
		} else {
			// You can make this say like sorry the correct answer is...
			// but it is working
			// now what to do?
			// You'll want to set the questions answer as true...
			System.out.println("boo");
		}
		// Now the questionLib will log the answers your user give :D
		// You could make a method to loop though the Questions in the Lib to give the score when they;re done...
		// is there a lazier way of doing that like having the variable being inside of this if userAnswer is true part of the code?
		// dangerous, you'd need to make sure thay was clear each time, much better to have the Lib check when needed
		// how would you go around the Lib doing the check then? lol...
		questionLib.getQuestion(questionNumber).setCorrect(userAnswer);
	}

}
