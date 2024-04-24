package br.edu.ifsp.arq.arqinoo.model.projeto;

import java.util.ArrayList;
import java.util.List;

import br.edu.ifsp.arq.arqinoo.model.material.Material;

public class Projeto {

	private String nome;
	private List<Material> materiais;
	
	public Projeto(String nome) {
		this.nome = nome;
		
		this.materiais = new ArrayList<>();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Material> getMateriais() {
		return materiais;
	}

	public void setMateriais(List<Material> materiais) {
		this.materiais = materiais;
	}
}
