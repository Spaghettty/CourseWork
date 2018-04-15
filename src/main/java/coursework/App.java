package coursework;

import coursework.lib.QuestionLib;

public class App {


	public static void main(String[] args) {
		App app = new App();
		QuestionLib questionLib = new QuestionLib();
		for (int questionNumber = 0; questionNumber < questionLib.getMaxQuestions(); questionNumber++){
			System.out.println((questionNumber + 1) + ": " + questionLib.questionPrint(questionNumber));
			System.out.println(questionLib.answersPrint(questionNumber));
			//break
			app.answerQuestion(questionNumber);
		}


	}

	public App(){

	}

	public void answerQuestion(int questionNumber){

	}

}
