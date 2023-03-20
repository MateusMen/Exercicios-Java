package Exercicio2;

public class Rica extends Pessoa{
	public double dinheiro;
	public Rica(String Name, int Idade, double dinheiro) {
		super(Name, Idade);
		this.dinheiro = dinheiro;
	}
	public void fazCompras() {
		System.out.println("Estou fazendo Compras");
	}
}
