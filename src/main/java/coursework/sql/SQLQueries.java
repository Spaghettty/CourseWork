/**
 * 
 */
package coursework.sql;

import java.sql.SQLException;
import java.sql.Statement;

import org.apache.commons.text.WordUtils;

import java.sql.ResultSet;

/**
 * @author Padraig
 *
 */
public class SQLQueries {
	private SQLDatabase database;

	public SQLQueries() {
		init();
	}

	private void init() {
		database = new SQLDatabase();

	}

	public String lookup() {
		try {
			Statement statement = database.getConnection().createStatement();
			String SQL = "SELECT * FROM capitals";
			ResultSet rs = statement.executeQuery(SQL);
			while (rs.next()) {
				System.out.println("Country: " + WordUtils.capitalizeFully(rs.getString(1)) + ", City: "
						+ WordUtils.capitalizeFully(rs.getString(2)));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;
	}

}
