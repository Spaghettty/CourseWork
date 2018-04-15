package coursework;

import coursework.sql.SQLQueries;

import java.util.HashMap;

public class App {
	public static void main(String[] args) {
		System.out.println("Ayyyy");
		SQLQueries sqlQueries = new SQLQueries();
		HashMap<String, String> questions = sqlQueries.getQuestion();
		for (String key : questions.keySet()){
			System.out.println("Country: " + key + ", City: "
					+ questions.get(key));
		}

	}

}
