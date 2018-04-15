package coursework.lib;

import coursework.sql.SQLQueries;

import java.util.ArrayList;

/**
 * The QuestionLib has library methods for questionAnswer
 */
public class QuestionLib {
	// Build a list of maps of questions to answers
	private ArrayList<Question> questions = new ArrayList<>();
	private SQLQueries sqlQueries;
	private int currentQuestion = 0;
	private int maxQuestions = 10;


	/**
	 * Constructor for the class
	 */
	public QuestionLib(){
		init();
	}

	// Initialise the class
	private void init(){
		sqlQueries = new SQLQueries();
		buildQuestions();
	}

	// Make questions and add them to the map in memory
	private void buildQuestions(){
		for (int i = 0; i < maxQuestions; i++) {
			// Add a Question to the array
			questions.add(new Question(sqlQueries.getQuestion()));
			i = i++;
		}
	}

	public Question getQuestion(int i){
		return questions.get(i);
	}

	public int getCurrentQuestion(){
		return currentQuestion;
	}

	private void incrementCurrentQuestion(){
		currentQuestion = currentQuestion++;
	}

	/**
	 * Return the printed question
	 * @param i - The {@link int} question value
	 * @return {@link String} - The printed answers
	 */
	public String questionPrint(int i){
		return "What is the capital of " + questions.get(i).getCorrectCountry() + "?";
	}

	/**
	 * Return the questions as a printable String
	 * @param i - The {@link int} question value
	 * @return {@link String} - The printed answers
	 */
	public String answersPrint(int i){
		StringBuilder sb = new StringBuilder();
		int j = 1;
		for (String city : questions.get(i).getCities()) {
			sb.append(j + ". " + city + "\n");
			j = j+1;
		}
		return sb.toString();
	}

	public int getMaxQuestions(){
		return maxQuestions;
	}

	/**
	 * Get the score for the questions
	 * @return {@link int} - The score
	 */
	public int getScore() {
		int score = 0;
		for (Question question : questions){
			if (question.getCorrect()) score = score + 1;
		}
		return score;
	}

}
