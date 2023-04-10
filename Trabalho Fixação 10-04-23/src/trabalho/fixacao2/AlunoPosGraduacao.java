package trabalho.fixacao2;

import java.util.Calendar;

public class AlunoPosGraduacao extends AlunoDeGraduacao{
	
	protected byte LinhaDePesquisa;
	protected String orientador;
	protected double bolsaDeEstudos;
	
	public AlunoPosGraduacao(int InformacaoMatricula,String nome,
			Calendar dataNascimento,byte codCurso,double percentualCobranca,
			byte LinhaDePesquisa,String Orientador,double bolsaDeEstudos) {
		super( InformacaoMatricula, nome,
			 dataNascimento, codCurso, percentualCobranca);
		this.LinhaDePesquisa = LinhaDePesquisa;
		this.orientador = Orientador;
		this.percentualCobranca = percentualCobranca;
	}
	
	private double valor = bolsaDeEstudos;
	public void PrintValor() {
		switch(LinhaDePesquisa) {
		case 1:
			valor = valor + 1200;
			System.out.println("A mensalidade desse aluno vale " + valor);
			break;
		case 2:
			valor = valor + 1600;
			System.out.println("A mensalidade desse aluno vale " + valor);
			break;
		case 3:
			valor = valor + 2000;
			System.out.println("A mensalidade desse aluno vale " + valor);
			break;
		case 4:
			valor = valor + 3400;
			System.out.println("A mensalidade desse aluno vale " + valor);
			break;
		default:
			System.out.println("Erro, Linha de pesquisa não suportada");
			break;
		}
	}
}