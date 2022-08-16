package entities;

public class Aluno {

	public String name;
	public double grade1;
	public double grade2;
	public double grade3;

	public double notaFinal() {
		return grade1 + grade2 + grade3;

	}

	public double pontosFaltantes() {
		if (notaFinal() < 60.0) {
			return 60.0 - notaFinal();
		} else {
			return 0.0;
		}
	}
	
	public Aluno() {
	}

	public Aluno(String name, double grade1, double grade2, double grade3) {
		super();
		this.name = name;
		this.grade1 = grade1;
		this.grade2 = grade2;
		this.grade3 = grade3;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getGrade1() {
		return grade1;
	}

	public void setGrade1(double grade1) {
		this.grade1 = grade1;
	}

	public double getGrade2() {
		return grade2;
	}

	public void setGrade2(double grade2) {
		this.grade2 = grade2;
	}

	public double getGrade3() {
		return grade3;
	}

	public void setGrade3(double grade3) {
		this.grade3 = grade3;
	}

	@Override
	public String toString() {
		return "Aluno [name=" + name + ", grade1=" + grade1 + ", grade2=" + grade2 + ", grade3=" + grade3 + "]";
	}

}
