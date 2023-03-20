package Exercicio3;

public class CamaroteSuperior extends VIP{
	public float ValorSuperior;
	public CamaroteSuperior(float Valor,float ValorVIP) {
		super(Valor);
		this.ValorSuperior = ValorVIP + 1000;
	}
	public void PrintValue() {
		System.out.println("Ingresso VIP, Camarote Superior, o valor e "+ValorSuperior);
	}
}