package patterns.behavioral.mediator;

import javax.swing.DefaultListModel;

import patterns.behavioral.mediator.components.AddButton;
import patterns.behavioral.mediator.components.DeleteButton;
import patterns.behavioral.mediator.components.Filter;
import patterns.behavioral.mediator.components.List;
import patterns.behavioral.mediator.components.SaveButton;
import patterns.behavioral.mediator.components.TextBox;
import patterns.behavioral.mediator.components.Title;
import patterns.behavioral.mediator.mediator.Editor;
import patterns.behavioral.mediator.mediator.Mediator;

/**
 * Demo class. Everything comes together here.
 */
public class Demo {
    public static void main(String[] args) {
        Mediator mediator = new Editor();

        mediator.registerComponent(new Title());
        mediator.registerComponent(new TextBox());
        mediator.registerComponent(new AddButton());
        mediator.registerComponent(new DeleteButton());
        mediator.registerComponent(new SaveButton());
        mediator.registerComponent(new List(new DefaultListModel()));
        mediator.registerComponent(new Filter());

        mediator.createGUI();
    }
}
