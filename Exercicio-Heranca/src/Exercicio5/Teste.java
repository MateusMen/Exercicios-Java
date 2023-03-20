package Exercicio5;

import java.util.*;
import exercicio1.*;
import Exercicio2.*;
import Exercicio3.*;
import Exercicio4.*;

public class Teste {
	private static void ItemA() {
		Administrativo A1;
	    Tecnico T1;
		A1 = new Administrativo("Admin",23234);
	    T1 = new Tecnico("Tecnico",65465);
        System.out.println("O nome desse funcionario Administrativo e " + A1.GetName());
        System.out.println("O nome desse funcionario Tecnico e " + T1.GetName());
	}
	private static void ItemB() {
		Cachorro Dog1;
	    Gato Cat1;
	    Dog1 = new Cachorro("Lola","Galgo");
	    Cat1 = new Gato("Tina","Malhado");
	    Dog1.late();
	    Cat1.mia();
	    Dog1.Caminhar();
	    Cat1.Caminhar();
	}
	private static void ItemC() {
		Miseravel M1;
		Pobre P1;
		Rica R1;

		M1 = new Miseravel("Pablo",36);
		P1 = new Pobre("Maria", 27);
		R1 = new Rica("Carlos",25,500);
		R1.fazCompras();
		P1.Trabalha();
		M1.Mendiga();
	}
	private static void ItemD() {
		Normal Normal1;
		CamaroteInferior Inf1;
		CamaroteSuperior Sup1;
		System.out.println("Se deseja um Ingresso normal, digite 1, se deseja um ingresso VIP, digite 2 ");
	    Scanner sc = new Scanner(System.in);
			int selector = sc.nextInt();
			if (selector == 1) {
				Normal1 = new Normal(60);
				Normal1.PrintValue();
			}else {
				System.out.println("1 para Camarote Inferior, 2 para Camarote Superior");
				int selector2 = sc.nextInt();
				if (selector2 == 1) {
					Inf1 = new CamaroteInferior(60,12);
					Inf1.PrintVIPvalue();
					Inf1.PrintLocation();
				}else {
					Sup1 = new CamaroteSuperior(60,0);
					Sup1.PrintValue();
				}
			}
	}
	private static void ItemE() {
		Novo new1;
		Velho old1;
		System.out.println("Digite 1 para um imovel novo, 2 para um velho");
		Scanner in = new Scanner(System.in);
			int selector =in.nextInt();
			if (selector == 1) {
				new1 = new Novo("Rua A",400);
				new1.PrintPrecoNovo();
			}else {
				old1 = new Velho("Rua B",400);
				old1.PrintPrecoVelho();
			}
		in.close();
	}
	public static void main(String[] args) {
		
	    ItemA();
	    ItemB(); 
	    ItemC();
	    ItemD();
	    ItemE();
	}
}