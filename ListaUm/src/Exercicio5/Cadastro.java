package Exercicio5;

public class Cadastro {

	public static void main(String[] args) {

		Caixa c1 = new Caixa("Julia", "62965457898", 12345, 2400, "08:00-18:00");
		c1.aumentoSalario(10);
		System.out.println(c1.toString() + " - Salario anual: " + c1.totalSalarioAnual());	
		
		
		Gerente g1 = new Gerente ("Carla", "6258584747", 78961, 4000, 1000 , "PF");  
		g1.aumentoSalario(20);
		System.out.println(g1.toString() + " - Salario anual: " + g1.totalSalarioAnual());
		
		
		Cliente cliente1 = new Cliente("Luiz", "62351457898", 20, "0000000000001", "A");
		Cliente cliente2 = new Cliente("Bianca", "3258142369", 37, "0000000000002", "A");
		Cliente cliente3 = new Cliente("Luana", "6285741452", 22, "0000000000003", "A");
		
		cliente3.desativarCliente();
		
		System.out.println(cliente1.toString()); 
		System.out.println(cliente2.toString());
		System.out.println(cliente3.toString());  

	}

}
