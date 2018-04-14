package coursework;

import coursework.sql.SQLDatabase;
import coursework.sql.SQLQueries;

public class App {

	public static void main(String[] args) {
		System.out.println("Ayyyy");
		SQLQueries sqlQueries = new SQLQueries();
		sqlQueries.lookup();
	}

}
