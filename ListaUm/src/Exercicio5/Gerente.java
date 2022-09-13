package Exercicio5;

public class Gerente extends Funcionario  {
	protected double bonificacao;
	protected String tipo; 
	

	public Gerente(String nome, String telefone, int matricula, double salario, double bonificacao, String tipo) {
		super(nome, telefone, matricula, salario);
		this.bonificacao = bonificacao;
		this.tipo = tipo;
	}
	
	public double totalSalarioAnual() {
		return super.totalSalarioAnual() + (12 * this.bonificacao);
	}
	  
	@Override
	public String toString() {
		return super.toString() + " - Bonificacao: " + bonificacao + " - Tipo:" + tipo;
	}

	public Gerente() {
		
	}

	public double getBonificacao() {
		return bonificacao;
	}
	public void setBonificacao(double bocacao) {
		this.bonificacao = bocacao;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	

}
