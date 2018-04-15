/**
 * 
 */
package coursework.sql;

import java.sql.SQLException;
import java.sql.Statement;

import org.apache.commons.text.WordUtils;

import java.sql.ResultSet;
import java.util.HashMap;

/**
 * @author Padraig
 *
 */
public class SQLQueries {
	private SQLDatabase database;

	/**
	 * Constructor for the class
	 */
	public SQLQueries() {
		init();
	}

	private void init() {
		database = new SQLDatabase();

	}

	/**
	 * Gets three random countries and cities
	 * @return {@link HashMap} - Of country->city
	 */
	public HashMap<String, String> getQuestion() {
		HashMap<String, String> question = new HashMap<String, String>();
		try {
			Statement statement = database.getConnection().createStatement();
			String sql = "SELECT * FROM capitals ORDER BY RAND() LIMIT 3";
			ResultSet rs = statement.executeQuery(sql);
			while (rs.next()) {
				question.put(WordUtils.capitalizeFully(rs.getString(1)),
						WordUtils.capitalizeFully(rs.getString(2)));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return question;
	}

}
