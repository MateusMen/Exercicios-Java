package Exercicio2;

public class Cachorro extends Animal{
	public Cachorro(String nome,String raca) {
	super (nome, raca);
	}
	public void late() {
		System.out.println("Estou latindo!");
	}
}