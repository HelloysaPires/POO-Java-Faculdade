package Exercicio3;

public class Robo {
	
	private int num;
	private String status;
	private int posicaoX;
	private int posicaoY;
	private int quantidadePo;
	private int limitePo;

	 
	public Robo(int num, int limitePo){
		status = "desligado";
		posicaoX = 0;
		posicaoY = 0;
		quantidadePo = 0;
		this.limitePo =  limitePo;
		this.num = num;
	}
	
	public Robo(int limitePo){
		this(0, limitePo);
	}
	
	public void ligar() {
		status = "ligado";
	}
	
	public void desligar() {
		status = "desligado";
	}
	
	public boolean andar(int x, int y) {
		if (!"desligado".equals(status)) {
			status = "andando";
			this.posicaoX += x;
			this.posicaoY += y;
			
			return true;
		}
		
		return false;
	}
	
	public boolean parar() {
		if (!"desligado".equals(status)) {
			status = "parado";
			
			return true;
		}
		return false;
	}
	
	public boolean aspirar(int quantidadePo) {
		if (!"desligado".equals(status) && this.quantidadePo + quantidadePo <= this.limitePo) {
			status = "aspirando";
			this.quantidadePo += quantidadePo;
			
			return true;
		}
		
		if ( (this.quantidadePo + quantidadePo) > this.limitePo ) {
		status = "desligado";
		this.quantidadePo = limitePo;
		System.out.println("Limite de po atingido! Aspirador Desligado.\n");
		}
		
		return false;
	}
	
	
	@Override
	public String toString() {
		return "Robo: "+ num + "\nStatus: " + status + "\nPosicao X: " + posicaoX + "\nPosicao Y: " + posicaoY
				+ "\nQuantidade de Po: " + quantidadePo + "\nLimite de Po: " + limitePo + "\n\n";
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	
	


}
