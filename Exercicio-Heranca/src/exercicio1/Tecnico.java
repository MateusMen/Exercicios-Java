package exercicio1;

public class Tecnico extends Assistente{
	public int bonus;
	public Tecnico(String Name, int Matricula) {
		super(Name, Matricula);
	}
	public void SetBonus(int bonus) {
		this.bonus = bonus;
	}

}