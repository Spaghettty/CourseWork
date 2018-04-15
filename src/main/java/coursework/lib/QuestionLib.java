package coursework.lib;

import coursework.sql.SQLQueries;

import java.util.ArrayList;

/**
 * The QuestionLib has library methods for questionAnswer
 */
public class QuestionLib {
	// Build a list of maps of questions to answers
	ArrayList<Question> questions = new ArrayList<>();
	SQLQueries sqlQueries;


	/**
	 * Constructor for the class
	 */
	public QuestionLib(){
		init();
	}

	// Initialise the class
	private void init(){
		sqlQueries = new SQLQueries();
		buildQuestions(10);
	}

	// Make questions and add them to the map in memory
	private void buildQuestions(int limit){
		int i = 0;
		while (i < limit){
			// Add a Question to the array
			questions.add(new Question(sqlQueries.getQuestion()));
			i=i++;
		}
	}

	public Question getQeuestion(int i){
		return questions.get(i);
	}



}
