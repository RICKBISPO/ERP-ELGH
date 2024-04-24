package br.edu.ifsp.arq.arqinoo.model.departamento;

import java.util.ArrayList;
import java.util.List;

import br.edu.ifsp.arq.arqinoo.model.material.Material;
import br.edu.ifsp.arq.arqinoo.model.usuario.Usuario;

public class DepartamentoEstoque extends Departamento{

	private List<Material> estoque;

	public DepartamentoEstoque(TipoDepartamento tipo, Usuario supervisor) {
		super(tipo, supervisor);
		this.estoque = new ArrayList<>();
	}

	void verificarEstoque() {
		// TODO: Implementar metodo de verificar estoque
	}
	
	boolean addItem() {
		// TODO: Implementar metodo de adicionar no estoque
		return false;
	}
	
	boolean removeItem() {
		// TODO: Implementar metodo de remover do estoque
		return false;
	}
	
	@Override
	public void relatorioDepartamento() {
		// TODO Auto-generated method stub
	}

	public List<Material> getEstoque() {
		return estoque;
	}

	public void setEstoque(List<Material> estoque) {
		this.estoque = estoque;
	}
	
}
