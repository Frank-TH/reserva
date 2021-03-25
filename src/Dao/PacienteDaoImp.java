package Dao;

import java.util.ArrayList;
import java.util.List;

import Models.Paciente;

public class PacienteDaoImp implements PacienteDao {

	@Override
	public List<Paciente> listar() {
		List<Paciente> lis = new ArrayList<>();
		String sql = "SELECT * FROM paciente";

		List<Object> lista = Operacion.listar(sql);
		if (lista != null) {
			for (int i = 1; i < lista.size(); i++) {
				Object[] fil = (Object[]) lista.get(i);
				Paciente p = new Paciente();
				p.setId(fil[0].toString());
				p.setName(fil[1].toString());
				p.setUsu(fil[2].toString());
				p.setPas(fil[3].toString());
				lis.add(p);
			}
			return lis;
		}

		return null;
	}

	@Override
	public Paciente validar(String usu, String pas) {
		String sql = "SELECT * FROM paciente WHERE usu LIKE '" + usu + "' AND pas LIKE '" + pas + "'";
		Object[] fila = Operacion.buscar(sql);
		if (fila != null) {
			Paciente p = new Paciente();
			p.setId(fila[0].toString());
			p.setName(fila[1].toString());
			p.setUsu(fila[2].toString());
			p.setPas(fila[3].toString());
			return p;
		}
		return null;
	}

}
