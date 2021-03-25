package Dao;

import Models.Paciente;

public class PruebaDao {

	public static void main(String[] args) {

		PacienteDao pdao = new PacienteDaoImp();
		
		/*

		List<Paciente> lista = pdao.listar();

		if (lista != null) {
			for (Paciente p : lista) {
				System.out.println(p.getName());
			}

		} else {
			System.out.println("Error");

		}
		
		
		*/
		
		
		Paciente p = pdao.validar("test", "test");
		
		if (p != null) {
			System.out.println("Bienvenido "+p.getName());
		}else {
			System.out.println("Error");
		}
		
		

	}

}
