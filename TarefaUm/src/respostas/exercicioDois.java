package respostas;
import java.util.Scanner;

public class exercicioDois {

	public static void main(String[] args) {
		
		int quantidade;
		int matricula;
		String nome;
		String saida = "Lista de alunos: \n";
		
		Scanner leitura = new Scanner(System.in);
		
		System.out.print("Escreva a quantidade de alunos: ");
		quantidade = leitura.nextInt();
		
		for(int i = 0; i<quantidade; i++) {
			
			System.out.print("Escreva a matricula: ");
			matricula = leitura.nextInt();
			leitura.nextLine();
			
			System.out.print("Escreva o nome: ");
			nome = leitura.nextLine();
		
			saida = saida + matricula + " - " + nome + "\n";
			
		}
		    leitura.close();

		    System.out.print(saida);
	}

}
