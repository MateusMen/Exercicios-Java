package Exercicio4;

public class Velho extends Imovel{
	public float PrecoVelho;
	public Velho (String endereco, float preco) {
		super(endereco,preco);
		PrecoVelho = preco - 200;
	}
	public void PrintPrecoVelho() {
		System.out.println("O valor desse imovel e "+PrecoVelho);
	}
}
