package exemplo;


//criação da classe
public final class Janela {
	
	//atributos privados
	private static final Janela INSTANCE = new Janela();
	private static final String Teste = "Exemplo Singleton Privado";
	
	//atributos publicos
	public static final String Singleton = "Exemplo Singleton Público";
	
	//construtor privado
	private Janela() {
		
	}
	
	//Método público estático realizado o primeiro e único acesso necessário nesse tipo de aplicação.
	public static Janela getInstance() {
		
		return INSTANCE;
	
	}
	
	//Execução desse método de qualquer parte do projeto
	public static void Abrir() {
		System.out.println("Abrir Janela!");
	}
	
	//Execução desse método de qualquer parte do projeto
	public static void Fechar() {
		System.out.println("Fechar Janela!");
	}
	
}