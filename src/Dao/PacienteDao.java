package Dao;

import java.util.List;

import Models.Paciente;

public interface PacienteDao {

	
	public List<Paciente> listar();
	
	public Paciente validar(String usu, String pas);
	
}
