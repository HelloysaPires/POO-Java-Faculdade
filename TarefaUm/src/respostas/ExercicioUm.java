package respostas;
import java.util.Scanner;

public class ExercicioUm {
	
	public static void main(String[] args) {
		double numerosInteirosEntre=0;
		double numerosParesEntre=0;

		Scanner leitura = new Scanner(System.in);
		
		System.out.print("Informe o primeiro numero: ");
		double a = leitura.nextDouble();
		System.out.print("Informe o segundo numero: ");
		double b = leitura.nextDouble();
		leitura.close();
		
		if(a>b) {
			double aux = a;
			a = b;
			b = aux;
		}
		
		System.out.printf("\nA soma entre %.2f e %.2f eh: %.2f\n", a, b, a+b);
		System.out.printf("A media entre %.2f e %.2f eh: %.2f\n", a, b, (a+b)/2);
		

		for(double i = a + 1; i<b; i++) {
			if(i%2 == 0)  numerosParesEntre++;
			if(i>0) numerosInteirosEntre++;
		}

		System.out.printf("Ha %.2f numeros pares entre %.2f e %.2f\n", numerosParesEntre, a, b );
		System.out.printf("Ha %.2f numeros inteiros entre %.2f e %.2f\n", numerosInteirosEntre, a, b);
		
	}

}
