package Exercicio4;

public class Novo extends Imovel{
	public float PrecoNovo;
	public Novo(String endereco, float preco) {
		super(endereco,preco);
		PrecoNovo = preco + 400;
	}
	public void PrintPrecoNovo() {
		System.out.println("O valor desse imovel e "+PrecoNovo);
	}
}