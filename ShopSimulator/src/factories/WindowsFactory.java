package factories;

//Importação das interfaces Button e Checkbox e as classes MacOSButton e MacOSCheckbox
import button.Button;
import button.WindowsButton;
import checkbox.Checkbox;
import checkbox.WindowsCheckbox;

//Declaração da classe WindowsFactory que implementa a interface GUIFactory.
public class WindowsFactory implements GUIFactory {
	
	// IMPLEMENTANDO O MÉTODO createButton() FAZENDO ELE RETORNAR UMA NOVA INSTÂNCIA DA CLASSE WindowsButton.
	public Button createButton() {
		return new WindowsButton();
	}
	
	// IMPLEMENTANDO O MÉTODO createButton() FAZENDO ELE RETORNAR UMA NOVA INSTÂNCIA DA CLASSE WindowsCheckbox.
	public Checkbox createCheckbox() {
		return new WindowsCheckbox();
	}
}