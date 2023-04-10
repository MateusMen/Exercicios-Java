package trabalho.fixacao2;

import java.util.Calendar ;

public class Principal {
public static void main(String[] args){
		
		AlunoDeGraduacao Aluno1;
		AlunoPosGraduacao Aluno2;
		
		Calendar cal1 = Calendar.getInstance();
		cal1.set(1995, 5, 25, 04, 15, 20);
		
		Aluno1 = new AlunoDeGraduacao(324534,"Caio",cal1, (byte)2, (double)500);
		Aluno1.printValor();
		
		Calendar cal2 = Calendar.getInstance();
		cal2.set(1999, 7, 17, 03, 50, 12);
		
		Aluno2 = new AlunoPosGraduacao(235874,"Bruno",cal2,(byte)3,
				(double)600,(byte)1,"Marco",(double)480);
		Aluno2.PrintValor();
	}
}
