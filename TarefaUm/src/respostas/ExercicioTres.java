package respostas;
import java.util.LinkedList;
import java.util.Scanner;

public class ExercicioTres {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		
		Scanner leitura = new Scanner(System.in);
		
		System.out.print("Digite a matricula: ");
		String matricula = leitura.next();
		leitura.close();
		
		int tam = matricula.length();
		
		char x = matricula.charAt(tam-1);
		char y = matricula.charAt(tam-2);
		char z = matricula.charAt(tam-3);
				
		LinkedList ordem = new LinkedList<> ();
		ordem.add(x);
		ordem.add(y);
		ordem.add(z);
		
		System.out.println("Os tres ultimos digitos em ordem crescente: " +ordem);
		
		
		
		
	}
}
