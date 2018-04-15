package coursework;

import coursework.lib.QuestionLib;

public class App {
	public static void main(String[] args) {
		QuestionLib questionLib = new QuestionLib();
		for (int i = 0; i < questionLib.getMaxQuestions(); i++){
			System.out.println((i + 1) + ": " + questionLib.questionPrint(i));
			System.out.println(questionLib.answersPrint(i));
		}


	}

}
