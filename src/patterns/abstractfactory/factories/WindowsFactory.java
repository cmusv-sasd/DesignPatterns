package patterns.abstractfactory.factories;

import patterns.abstractfactory.buttons.Button;
import patterns.abstractfactory.buttons.WindowsButton;
import patterns.abstractfactory.checkboxes.Checkbox;
import patterns.abstractfactory.checkboxes.WindowsCheckbox;

/**
 * Each concrete factory extends basic factory and responsible for creating
 * products of a single variety.
 */
public class WindowsFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
