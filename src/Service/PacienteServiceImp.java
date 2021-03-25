package Service;

import Dao.PacienteDao;
import Dao.PacienteDaoImp;
import Models.Paciente;

public class PacienteServiceImp implements PacienteService {

	private PacienteDao pdao = new PacienteDaoImp();

	@Override
	public Paciente validar(String usu, String pas) {

		return pdao.validar(usu, pas);

	}

}
