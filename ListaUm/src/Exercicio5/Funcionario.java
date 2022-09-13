package Exercicio5;

public class Funcionario extends Pessoa {
	
	protected int matricula;
	protected double salario;
	
	public void aumentoSalario(double porcentual) {
		this.salario += (porcentual/100) * this.salario; 
	}
	
	public double totalSalarioAnual() {
		return this.salario * 12;
	}
	
	@Override
	public String toString() {
		return super.toString() + " - Matricula: " + matricula + " - Salario: " + salario;
	}

	public Funcionario(String nome, String telefone, int matricula, double salario) {
		super(nome, telefone);
		this.matricula = matricula;
		this.salario = salario;
	}
	
	
	public Funcionario(String nome, int matricula) {
		super(nome);
		this.matricula = matricula;
	}

	public Funcionario(){
		
	}
	
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	

}
