package Exercicio3;

public class Morador {
	private String nome; 
	private String cpf;
	private String celular;
	private String dataDeNascimento;
	private String sexo;
	private String bloco;
	private int apartamento;
	private int codigoDeAcesso;
	private static int codigoSequencial;   

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
		
		codigoSequencial++;
	}
	
	public Morador() {
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getDataDeNascimento() {
		return dataDeNascimento;
	}

	public void setDataDeNascimento(String dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getBloco() {
		return bloco;
	}

	public void setBloco(String bloco) {
		this.bloco = bloco;
	}

	public int getApartamento() {
		return apartamento;
	}

	public void setApartamento(int apartamento) {
		this.apartamento = apartamento;
	}

	public int getCodigoDeAcesso() {
		return codigoDeAcesso;
	}

	public static int getCodigoSequencial() {
		return codigoSequencial;
	}
	
}
