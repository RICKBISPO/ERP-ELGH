package br.edu.ifsp.arq.arqinoo.model.departamento;

import java.util.ArrayList;
import java.util.List;

import br.edu.ifsp.arq.arqinoo.model.projeto.Projeto;
import br.edu.ifsp.arq.arqinoo.model.usuario.Usuario;

public class DepartamentoProjetos extends Departamento{

	private List<Projeto> projetosConcluidos;
	private Projeto projetoAtual;

	public DepartamentoProjetos(TipoDepartamento tipo, Usuario supervisor) {
		super(tipo, supervisor);
		this.projetosConcluidos = new ArrayList<Projeto>();
	}

	
	public void criarProjeto() {
		// TODO: Implementar método de criar projeto
	}
	
	public void terminarProjeto() {
		// TODO: Implementar método de terminar projeto
	}

	@Override
	public void relatorioDepartamento() {
		// TODO Auto-generated method stub
		
	}

	public List<Projeto> getProjetosConcluidos() {
		return projetosConcluidos;
	}

	public void setProjetosConcluidos(List<Projeto> projetosConcluidos) {
		this.projetosConcluidos = projetosConcluidos;
	}

	public Projeto getProjetoAtual() {
		return projetoAtual;
	}

	public void setProjetoAtual(Projeto projetoAtual) {
		this.projetoAtual = projetoAtual;
	}
	
	
	
}
