package Setting;

import java.sql.Connection;

public class PruebaConexion {

	public static void main(String[] args) {
		
		DBUtil con = new DBUtil();
		Connection cn = con.getConectar();

		if (cn != null) {
			System.out.println("Hay Conexi?n");
		}else
		{System.out.println("No hay Conexi?n");}
		
	}

}
