package Exercicio5;

public class Pessoa {
	
	protected String nome;
	protected String telefone;
	
	@Override
	public String toString() {
		return nome + " - Telefone: " + telefone; 
	}

	public Pessoa(String nome, String telefone) {
		this.nome = nome;
		this.telefone = telefone;
	}
	
	public Pessoa(String nome) {
		this.nome = nome;
	}
	
	public Pessoa() {
		
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	

}
