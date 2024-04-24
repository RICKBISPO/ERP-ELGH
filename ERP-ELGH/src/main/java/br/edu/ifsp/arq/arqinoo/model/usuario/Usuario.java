package br.edu.ifsp.arq.arqinoo.model.usuario;

public class Usuario {

	private String nome;
	private String sobrenome;
	private String email;
	private boolean ativo;
	StatusCargo cargo;
	
	public Usuario(String nome, String sobrenome, String email, boolean ativo) {
		super();
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.email = email;
		this.ativo = ativo;
		this.cargo = StatusCargo.AGUARDANDO; 
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public boolean isAtivo() {
		return ativo;
	}
	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}
	public StatusCargo getCargo() {
		return cargo;
	}
	public void setCargo(StatusCargo cargo) {
		this.cargo = cargo;
	}
}
