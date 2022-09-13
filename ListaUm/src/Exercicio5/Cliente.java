package Exercicio5;

public class Cliente extends Pessoa {
	
	protected int idade;
	protected String cpf;
	protected String status;
	
	public void desativarCliente() {
		if("A".equals(status)) status = "I"; 
	}
	

	@Override
	public String toString() {
		return super.toString() + " -  Idade: " + this.idade +
			  " anos - Cpf: " + this.cpf + " - " + this.status;
	}
	
	public Cliente(String nome, String telefone, int idade, String cpf, String status) {
		super(nome, telefone);
		this.idade = idade;
		this.cpf = cpf;
		this.status = status;
	}
	
	public Cliente() {
		
	}
	
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	

}
