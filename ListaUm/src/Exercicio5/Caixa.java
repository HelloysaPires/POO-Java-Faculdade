package Exercicio5;

public class Caixa extends Funcionario {
	
	protected String horario;

	
	@Override
	public String toString() {
		return super.toString() + " - Horario: " + horario; 
	}

	public Caixa(String nome, String telefone, int matricula, double salario, String horario) {
		super(nome, telefone, matricula, salario);
		this.horario = horario;
	}
	
	Caixa(){
		
	} 

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}
	
	

}
