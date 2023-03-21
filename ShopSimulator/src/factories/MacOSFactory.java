package factories;

// Importação das interfaces Button e Checkbox e as classes MacOSButton e MacOSCheckbox
import button.Button;
import button.MacOSButton;
import checkbox.Checkbox;
import checkbox.MacOSCheckbox;

// Declaração da classe MacOSFactory que implementa a interface GUIFactory.
public class MacOSFactory implements GUIFactory {
	
	// IMPLEMENTANDO O MÉTODO createButton() FAZENDO ELE RETORNAR UMA NOVA INSTÂNCIA DA CLASSE MacOSButton.
	public Button createButton() {
		return new MacOSButton();
	}
	
	// IMPLEMENTANDO O MÉTODO createButton() FAZENDO ELE RETORNAR UMA NOVA INSTÂNCIA DA CLASSE MacOSCheckbox.
	public Checkbox createCheckbox() {
		return new MacOSCheckbox();
	}
}