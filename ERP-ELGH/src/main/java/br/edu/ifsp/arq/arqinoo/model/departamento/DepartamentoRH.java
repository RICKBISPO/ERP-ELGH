package br.edu.ifsp.arq.arqinoo.model.departamento;

import br.edu.ifsp.arq.arqinoo.model.usuario.Usuario;

public class DepartamentoRH extends Departamento{

	public DepartamentoRH(TipoDepartamento tipo, Usuario supervisor) {
		super(tipo, supervisor);
	}

	public boolean contratar() {
		
		// TODO: Implementar o método de contratar funcionario
		return false;
	}
	
	public boolean demitir() {
		
		// TODO: Implementar o método de demitir funcionario
		return false;
	}

	@Override
	public void relatorioDepartamento() {
		// TODO Auto-generated method stub
		
	}
		
}
