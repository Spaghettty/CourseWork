package coursework.lib;

import coursework.sql.SQLQueries;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * The QuestionLib has library methods for questionAnswer
 */
public class QuestionLib {
	// Build a list of maps of questions to answers
	ArrayList<HashMap<Question, Boolean>> questionAnswer = new ArrayList<>();
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
			// Add a map of the Question object with the answer false to the array
			// (this will turn true if they get the answer correct)
			HashMap<Question, Boolean> questionBooleanHashMap = new HashMap<>();
			questionBooleanHashMap.put(new Question(sqlQueries.getQuestion()), false);
			questionAnswer.add(i, questionBooleanHashMap);
			i=i++;
		}
	}



}
