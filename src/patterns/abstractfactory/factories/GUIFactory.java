package patterns.abstractfactory.factories;

import patterns.abstractfactory.buttons.Button;
import patterns.abstractfactory.checkboxes.Checkbox;

/**
 * Abstract factory knows about all (abstract) product types.
 */
public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}
