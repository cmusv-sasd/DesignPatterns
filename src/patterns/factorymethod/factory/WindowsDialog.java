package patterns.factorymethod.factory;

import patterns.factorymethod.buttons.Button;
import patterns.factorymethod.buttons.WindowsButton;

/**
 * Windows Dialog will produce Windows/MAC/Linux buttons.
 */
public class WindowsDialog extends Dialog {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
