package patterns.abstractfactory.factories;

import patterns.abstractfactory.buttons.Button;
import patterns.abstractfactory.buttons.MacOSButton;
import patterns.abstractfactory.checkboxes.Checkbox;
import patterns.abstractfactory.checkboxes.MacOSCheckbox;

/**
 * Each concrete factory extends basic factory and responsible for creating
 * products of a single variety.
 */
public class MacOSFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}
