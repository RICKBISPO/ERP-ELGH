package br.edu.ifsp.arq.arqinoo.model.departamento;

import java.util.ArrayList;
import java.util.List;

import br.edu.ifsp.arq.arqinoo.model.usuario.Usuario;

public abstract class Departamento {

	TipoDepartamento tipo;
	Usuario Supervisor;
	List<Usuario> funcionarios;
	
	public Departamento(TipoDepartamento tipo, Usuario supervisor) {
		super();
		this.tipo = tipo;
		Supervisor = supervisor;
		this.funcionarios = new ArrayList<>();
	}

	public abstract void relatorioDepartamento();
	
	public TipoDepartamento getTipo() {
		return tipo;
	}

	public void setTipo(TipoDepartamento tipo) {
		this.tipo = tipo;
	}

	public Usuario getSupervisor() {
		return Supervisor;
	}

	public void setSupervisor(Usuario supervisor) {
		Supervisor = supervisor;
	}

	public List<Usuario> getFuncionarios() {
		return funcionarios;
	}

	public void setFuncionarios(List<Usuario> funcionarios) {
		this.funcionarios = funcionarios;
	}
}
