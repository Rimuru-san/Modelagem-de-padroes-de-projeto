package factories;

//Import das interfaces Button e Checkbox
import button.Button;
import checkbox.Checkbox;

//Declaração da interface GUIFactory
public interface GUIFactory {
	// Declaração do método createButton() vai retornar um objeto Button que será implementado;
	Button createButton();
	// Declaração do método createCheckbox() vai retornar um objeto Checkbox que será implementado;
	Checkbox createCheckbox();
}