package Exercicio2;

public class Morador {
	String nome; 
	String cpf;
	String celular;
	String dataDeNascimento;
	String sexo;
	String bloco;
	int apartamento;
	int codigoDeAcesso;
	 
	public Morador(String nome, String cpf, String sexo, String dataDeNascimento, String celular, String bloco,
					int apartamento, int codigoDeAcesso) {
		this.nome = nome;
		this.cpf = cpf;
		this.celular = celular;
		this.dataDeNascimento = dataDeNascimento;
		this.sexo = sexo;
		this.bloco = bloco;
		this.apartamento = apartamento;
		this.codigoDeAcesso = codigoDeAcesso;
	}

}
