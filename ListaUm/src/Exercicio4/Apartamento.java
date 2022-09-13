package Exercicio4;
import java.util.ArrayList;
import Exercicio3.Morador;

public class Apartamento {

	private int num;
	private int andar;
	private double metragem;
	private String situacao;
	private ArrayList<Morador> moradores = new ArrayList<> ();
	
	public void adicionarMorador(String nome, String cpf, String sexo, String dataDeNascimento, String celular, String bloco,
								int apartamento, int codigoDeAcesso) {
		
		moradores.add(new Morador(nome, cpf, sexo, dataDeNascimento, celular, bloco, apartamento, codigoDeAcesso));
	}
	
	
	public Apartamento(int num, int andar, double metragem, String situacao) {
		this.num = num;
		this.andar = andar;
		this.metragem = metragem;
		this.situacao = situacao;
	}
	
	public Apartamento() {
		
	}
	
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public int getAndar() {
		return andar;
	}
	public void setAndar(int andar) {
		this.andar = andar;
	}
	public double getMetragem() {
		return metragem;
	}
	public void setMetragem(double metragem) {
		this.metragem = metragem;
	}
	public String getSituacao() {
		return situacao;
	}
	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}
	
	
	
	
}
