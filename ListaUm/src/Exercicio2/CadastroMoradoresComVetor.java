package Exercicio2;
import java.util.Scanner;

public class CadastroMoradoresComVetor { 
	
	public static void main(String[] args) {
		
		String nome; 
		String cpf;
		String celular;
		String dataDeNascimento;
		String sexo;
		String bloco;
		int apartamento;
		int codigoDeAcesso; 
		
		int i = 0;
		int flag = 1;
		Morador[] moradores = new Morador[1000];	
		Scanner ler = new Scanner(System.in);
		
while(flag !=2 ) {
			
			System.out.println("\n-------------MENU--------------");
			System.out.println("CADASTRAR UM MORADOR: 01");
			System.out.println("SAIR                : 02");
			System.out.print  ("Digite sua opcao    : ");
			flag = ler.nextInt();
			
			if(flag == 1) {
				
				System.out.println("\nInsira os dados para cadastro: ");
				System.out.print("Nome: ");
				ler.nextLine();
				nome = ler.nextLine(); 
				System.out.print("CPF: ");
				cpf = ler.next();
				System.out.print("Telefone: ");
				celular = ler.next();
				System.out.print("Nascimento (formato dd/mm/aaaa): ");
				dataDeNascimento =  ler.next();
				System.out.print("Sexo: ");
				sexo = ler.next();
				System.out.print("Bloco: ");
				bloco = ler.next();
				System.out.print("Apartamento: ");
				apartamento = ler.nextInt();
				System.out.print("Codigo de acesso: ");
				codigoDeAcesso = ler.nextInt();
				
				moradores[i] = new Morador(nome, cpf, sexo, dataDeNascimento, celular, bloco, apartamento, codigoDeAcesso);
				i++;
				System.out.println("\nMorador cadastrado com sucesso!");
			}
	   }
		
				ler.close();
	   
	    System.out.println("\nMoradores cadastrados: ");
	    for(int j = 0; j<i ; j++) {
	    System.out.printf("\n(%d)\n", j+1);
		System.out.printf("Nome: %s\nCPF: %s\nTelefone: %s\nData de nascimento: %s\nSexo: %s\nBloco: %s"
				          + "\nApartamento: %d\nCodigo de acesso: %d\n", moradores[j].nome.toUpperCase(),  moradores[j].cpf, 
				          moradores[j].celular, moradores[j].dataDeNascimento,  moradores[j].sexo.toUpperCase(), 
				          moradores[j].bloco.toUpperCase(),  moradores[j].apartamento,  moradores[j].codigoDeAcesso);
	   }
	}

}
