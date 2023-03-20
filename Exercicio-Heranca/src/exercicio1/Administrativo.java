package exercicio1;

public class Administrativo extends Assistente{
	public String turno;
	public Administrativo(String Name, int Matricula) {
		super(Name, Matricula);
	}
	public void SetTurno(String turno) {
		this.turno = turno;
	}
}
