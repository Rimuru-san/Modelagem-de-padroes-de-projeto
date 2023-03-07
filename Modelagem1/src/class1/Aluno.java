package class1;

public class Aluno extends Pessoa {
    private String curso;
    private int nota;

    public Aluno(String nome, int matricula, int idade, int cpf, int rg, int cep, String curso, int nota) {
        super(nome, matricula, idade, cpf, rg, cep);
        this.curso = curso;
        this.nota = nota;
    }

    public String getCurso() {return curso;}
    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    public int getNota() {return nota;}
    public void setNota(int nota) {
        this.nota = nota;
    }

    public void Dados(){
    System.out.println(getNome());
    System.out.println(getMatricula());
    System.out.println(getCurso());
    System.out.println(getNota());
    }

}