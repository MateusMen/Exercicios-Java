package trabalho.fixacao1;

public class Automovel {
	
	protected static final byte GASOLINA = 1, ALCOOL = 2, DIESEL = 3, GAS = 4;
	protected String placa, modelo, cor;
	protected byte combustivel;
	protected short ano;
	
	public Automovel(String placa,String modelo,String cor, byte combustivel, short ano) {
		this.placa = placa;
		this.modelo = modelo;
		this.cor = cor;
		this.combustivel = combustivel;
		this.ano = ano;
	}
	
	public void printValor(){
		switch(combustivel) {
		case 1:
			System.out.println("Esse automovol vale 12.000,00");
			break;
		case 2:
			System.out.println("Esse automovel vale 10.500,00");
			break;
		case 3:
			System.out.println("Esse automovel vale 11.000,00");
			break;
		case 4:
			System.out.println("Esse automovel vale 13.000,00");
			break;
		default: 
			System.out.println("Erro, combustivel não suportado");
			break;
				
		}
	}
	
}