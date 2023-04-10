package trabalho.fixacao1;

public class Principal {

	public static void main(String[] args){
		
		Automovel Carro1;
		Automovel_Luxo Carro2;
		
		Carro1 = new Automovel("abcde","Ford","Azul", (byte)2, (short)2004);
		Carro1.printValor();
		
		Carro2 = new Automovel_Luxo("dfghk","Ferrari","Vermelho", (byte)3,
				(short)2006,(boolean)false,(boolean)true,(boolean)true);
		Carro2.PrintValor();
	}
}