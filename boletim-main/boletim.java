package media;
///GuilhermeMaximianoAlves352
public class boletim {
	
	public static void main(String[] args) {
		
		aluno aluno1 = new aluno();
	    aluno1.n1=7.0f;
	    aluno1.n2=8.0f;
	    aluno1.n3=6.5f;
	    aluno1.n4=9.5f;
	    aluno1.media = ((aluno1.n1 + aluno1.n2 + aluno1.n3 + aluno1.n4)/4);
	    
	    professor professor1 = new professor();
	    professor1.disciplina="Matematica";
	    
	    System.out.print("Sua media em " +professor1.disciplina + " " + "foi  "+ aluno1.media +".");
	}
}