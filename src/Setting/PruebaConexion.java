package Setting;

import java.sql.Connection;

public class PruebaConexion {

	public static void main(String[] args) {
		
		DBUtil con = new DBUtil();
		Connection cn = con.getConectar();

		if (cn != null) {
			System.out.println("Hay Conexión");
		}else
		{System.out.println("No hay Conexión");}
		
	}

}
