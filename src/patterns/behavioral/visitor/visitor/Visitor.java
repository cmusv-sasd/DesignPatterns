package patterns.behavioral.visitor.visitor;

import patterns.behavioral.visitor.shapes.Circle;
import patterns.behavioral.visitor.shapes.CompoundShape;
import patterns.behavioral.visitor.shapes.Dot;
import patterns.behavioral.visitor.shapes.Rectangle;

public interface Visitor {
    String visitDot(Dot dot);

    String visitCircle(Circle circle);

    String visitRectangle(Rectangle rectangle);

    String visitCompoundGraphic(CompoundShape cg);
}
