package class1;

//Classe utilizada para representar a Pessoa.

public class Pessoa {
    
	private String nome;
    private int matricula;
    private int idade;
    private int cpf;
    private int rg;
    private int cep;
    
    /** Construtor que recebe o nome da pessoa.
     * @param nome */

    public Pessoa(String nome, int matricula, int idade, int cpf, int rg, int cep) {
		super();
		this.nome = nome;
		this.matricula = matricula;
		this.idade = idade;
		this.cpf = cpf;
		this.rg = rg;
		this.cep = cep;
	}
    
    public int getMatricula() { return matricula; }
	public void setMatricula(int matricula) { this.matricula = matricula; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    
	public int getIdade() {return idade;}
	public void setIdade(int idade) {this.idade = idade;}
	
	public int getCpf() {return cpf;}
	public void setCpf(int cpf) {this.cpf = cpf;}
	
	public int getRg() {return rg;}
	public void setRg(int rg) {this.rg = rg;}
	
	public int getCep() {return cep;}
	public void setCep(int cep) {this.cep = cep;}
	
}
