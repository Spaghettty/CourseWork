package coursework;

import coursework.lib.QuestionLib;

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


	}

	public App(){
		questionLib = new QuestionLib();
	}

	public void answerQuestion(int questionNumber){
		questionLib.getQuestion(questionNumber).answer(11);
	}

}
