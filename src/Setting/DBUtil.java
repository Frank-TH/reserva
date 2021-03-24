package Setting;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBUtil implements Parametro {

	public Connection getConectar() {

		Connection con;

		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url.concat(BD), user, password);
		} catch (Exception e) {

			System.out.println(e.getMessage());
			con = null;
		}

		return con;
	}

}
