package class1;

// Classe utilizada para representar um Coordenador que é uma Pessoa.

public class Professor extends Pessoa {
    private String disciplinaLecionada;

    public Professor(String nome, int matricula, int idade, int cpf, int rg, int cep, String disciplinaLecionada) {
        super(nome, matricula, idade, cpf, rg, cep);
        this.disciplinaLecionada = disciplinaLecionada;
    }

    public String getDisciplinaLecionada() { return disciplinaLecionada; }
    public void setDisciplinaLecionada(String disciplinaLecionada) {
        this.disciplinaLecionada = disciplinaLecionada;
    }

    public void Dados(){
    System.out.println(getNome());
    System.out.println(getMatricula());
    System.out.println(getDisciplinaLecionada());
    }

}