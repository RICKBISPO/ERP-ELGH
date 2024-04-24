package br.edu.ifsp.arq.arqinoo.model.material;

public class Material {
	
	private String nome;
	private String tipo;
	private StatusMaterial status;
	
	public Material(String nome, String tipo) {
		super();
		this.nome = nome;
		this.tipo = tipo;
		this.status = StatusMaterial.DISPONIVEL;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public StatusMaterial getStatus() {
		return status;
	}

	public void setStatus(StatusMaterial status) {
		this.status = status;
	}
	
}
