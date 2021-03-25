package Service;

import javax.swing.JOptionPane;

import Models.Paciente;

public class PruebaService {

	public static void main(String[] args) {

		PacienteService pser = new PacienteServiceImp();

		Paciente p = pser.validar("test", "test");

		if (p != null) {

			JOptionPane.showMessageDialog(null, "Bienvenido " + p.getName());

		} else {
			JOptionPane.showMessageDialog(null, "Error");
		}

	}

}
