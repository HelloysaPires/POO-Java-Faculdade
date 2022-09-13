package Exercicio3;
import java.util.ArrayList;

public class FazendoCadastro {  

	public static void main(String[] args) {
		
		ArrayList<Morador> moradores = new ArrayList<>();
		
		moradores.add(new Morador("Helloysa", "00000000001", "feminino", "07/01/2003", "6201010101", "A", 302, 1234));
		
		moradores.add(new Morador("Ana", "00000000002", "feminino", "05/02/1970", "6202020202", "D", 101, 10101));
		
		moradores.add(new Morador("Pedro", "00000000003", "masculino", "05/02/2010", "620303023", "A", 205, 545455));
		
		moradores.add(new Morador("Carlos", "00000000004", "masculino", "08/03/2000", "6204040404", "B", 403, 484848));
		
		moradores.add(new Morador("Julia", "00000000005", "feminino", "22/04/1995", "6205050505", "B", 301, 34455));
		
		moradores.add(new Morador("Guilherme", "00000000006", "masculino", "17/12/2001", "6206060606", "C", 102, 445445));
		
		System.out.println("Ha " + Morador.getCodigoSequencial() + " moradores cadastrados. Lista de moradores:\n");
		
		for(Morador aux: moradores){
			System.out.printf("\nNome: %s\nCPF: %s\nTelefone: %s\nData de nascimento: %s\nSexo: %s\nBloco: %s"
			          + "\nApartamento: %d\nCodigo de acesso: %d\n", aux.getNome().toUpperCase(), aux.getCpf(), aux.getCelular(),
			          aux.getDataDeNascimento(), aux.getSexo().toUpperCase(), aux.getBloco().toUpperCase(), aux.getApartamento(), 
			          aux.getCodigoDeAcesso());
			
		}
		
	}

}
