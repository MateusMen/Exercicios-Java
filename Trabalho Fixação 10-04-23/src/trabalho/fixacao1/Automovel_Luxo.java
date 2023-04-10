package trabalho.fixacao1;

public class Automovel_Luxo extends Automovel{
	
	public boolean Tem_Ar_Condicionado,Tem_Direcao_Hidraulica,Tem_Vidro_Eletrico;
	private int valor = 0;
	
	public Automovel_Luxo(String placa,String modelo,String cor, byte combustivel,
			short ano,boolean Tem_Ar_Condicionado,boolean Tem_Direcao_Hidraulica,
			boolean Tem_Vidro_Eletrico) {
		super(placa,modelo,cor,combustivel,ano);
		this.Tem_Ar_Condicionado = Tem_Ar_Condicionado;
		this.Tem_Direcao_Hidraulica = Tem_Direcao_Hidraulica;
		this.Tem_Vidro_Eletrico = Tem_Vidro_Eletrico;
	}
	
	public void PrintValor() {
		if(Tem_Ar_Condicionado = true) {
			valor = valor + 2000;
		}
		if(Tem_Direcao_Hidraulica = true) {
			valor = valor + 1500;
		}
		if(Tem_Vidro_Eletrico = true) {
			valor = valor + 800;
		}
		switch(combustivel) {
		case 1:
			valor = valor + 12000;
			System.out.println("Esse automovel vale " + valor);
			break;
		case 2:
			valor = valor + 10500;
			System.out.println("Esse automovel vale " + valor);
			break;
		case 3:
			valor = valor + 11000;
			System.out.println("Esse automovel vale " + valor);
			break;
		case 4:
			valor = valor + 13000;
			System.out.println("Esse automovel vale " + valor);
			break;
		default:
			System.out.println("Erro, Combustivel não suportado");
			break;
		}
	}
}
