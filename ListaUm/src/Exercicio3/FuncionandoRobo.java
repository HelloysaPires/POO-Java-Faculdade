package Exercicio3;

public class FuncionandoRobo {

	public static void main(String[] args) {
		
		Robo r1 = new Robo(001, 50);
		Robo r2 = new Robo(002, 30);
		
		
		r1.ligar();
		System.out.println(r1.toString());	 
		
		r1.andar(4, 4);
		System.out.println(r1.toString());
		
		r1.parar();
		System.out.println(r1.toString());
		
		r1.aspirar(40);
		System.out.println(r1.toString());

		r1.desligar();
		System.out.println(r1.toString());

		r1.ligar();
		System.out.println(r1.toString());

		r1.aspirar(20);
		System.out.println(r1.toString());
		
		/***
		 * 
		 *
		 **/
		System.out.println("\n\n");
		
		r2.ligar();
		System.out.println(r2.toString());
		
		r2.aspirar(10);
		System.out.println(r2.toString());
		
		r2.parar();
		System.out.println(r2.toString());

		r2.andar(7, 5);
		System.out.println(r2.toString());

		r2.parar();
		System.out.println(r2.toString());

		r2.desligar();
		System.out.println(r2.toString());

		r2.aspirar(5);
		System.out.println(r2.toString());
		
	}

}
