package exercicio1;

public class Assistente extends Funcionario{
	public int Matricula;
	public Assistente(String Name, int Matricula) {
		super(Name);
		this.Matricula = Matricula;
	}
	public String GetName() {
		return Name;
	}
	public int GetMatricula() {
		return Matricula;
	}
	public void exibeDados(){
	}
}