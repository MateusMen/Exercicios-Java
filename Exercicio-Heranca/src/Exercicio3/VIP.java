package Exercicio3;

public class VIP extends Ingresso{
	public float ValorVIP;

	public VIP(float Valor) {
		super(Valor);
		this.ValorVIP = Valor + 500;
	}
	public void PrintVIPvalue() {
		System.out.println("Ingresso VIP, Camarote Inferior, O valor desse ingresso e "+ValorVIP);
	}
}