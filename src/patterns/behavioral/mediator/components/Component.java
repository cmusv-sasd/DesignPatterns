package patterns.behavioral.mediator.components;

import patterns.behavioral.mediator.mediator.Mediator;

/**
 * Common component interface.
 */
public interface Component {
    void setMediator(Mediator mediator);
    String getName();
}
