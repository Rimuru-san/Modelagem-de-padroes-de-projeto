package class1;

//Classe utilizada para representar um Funcionario que é uma Pessoa.

public class Funcionario extends Pessoa {
	private String departamento;
    
	public Funcionario(String nome, int matricula, int idade, int cpf, int rg, int cep, String departamento) {
        super(nome, matricula, idade, cpf, rg, cep);
        this.departamento = departamento;
    }

    public String getDepartamento() { return departamento; }
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public void Dados(){
    System.out.println(getNome());
    System.out.println(getMatricula());
    System.out.println(getDepartamento());
    }
    
}