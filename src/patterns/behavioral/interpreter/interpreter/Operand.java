package patterns.behavioral.interpreter.interpreter;

import java.util.Map;

/***
 * This is a refactoring that follows the intent of the Interpreter design
 * pattern. All classes in the Operand hierarchy: implement the
 * evaluate(context), digest some piece of the context argument, and return
 * their contribution to the recursive traversal. Applying the Interpreter
 * pattern in this domain is probably inappropriate.
 * 
 * The intent was to use stacks to convert normal "infix" syntax into "postfix"
 * notation with operator precedence already handled.
 * 
 * Code adapter from https://sourcemaking.com/design_patterns/interpreter/java/1
 * 
 * @author leonardo
 *
 */
public interface Operand {
	double evaluate(Map<String, Integer> context);

	void traverse(int level);
}
