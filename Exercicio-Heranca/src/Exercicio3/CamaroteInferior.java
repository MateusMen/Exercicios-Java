package Exercicio3;

public class CamaroteInferior extends VIP{
	public int localizacao;
	public CamaroteInferior(float Valor,int localização) {
		super(Valor);
		this.localizacao = localização;
	}
	public void PrintLocation() {
		System.out.println("A localização e"+localizacao);
	}
}