package trabalho.fixacao2;

import java.util.Calendar;

public class AlunoDeGraduacao {
	
	public static final byte ARQUITETURA = 1,CIENCIADACOMPUTACAO = 2,ENGENHARIA = 3,BIOMEDICINA = 4;
	protected int InformacaoMatricula;
	protected String nome;
	protected Calendar dataNascimento;
	protected byte codCurso;
	protected double percentualCobranca;
	
	public AlunoDeGraduacao(int InformacaoMatricula,String nome,
			Calendar dataNascimento,byte codCurso,double percentualCobranca) {
		this.InformacaoMatricula = InformacaoMatricula;
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.codCurso = codCurso;
		this.percentualCobranca = percentualCobranca;
	}
	
	public void printValor() {
		switch(codCurso) {
		case 1:
			System.out.println("Esse curso vale 450,00 de mensalidade");
			break;
		case 2:
			System.out.println("Esse curso vale 650,00 de mensalidade");
			break;
		case 3:
			System.out.println("Esse curso vale 850,00 de mensalidade");
			break;
		case 4:
			System.out.println("Esse curso vale 750,00 de mensalidade");
			break;
		default: 
			System.out.println("Erro, curso não suportado");
			break;
		}
	}
}
