package patterns.factorymethod.factory;

import patterns.factorymethod.buttons.Button;
import patterns.factorymethod.buttons.HtmlButton;

/**
 * HTML Dialog will produce HTML buttons.
 */
public class HtmlDialog extends Dialog {

    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
