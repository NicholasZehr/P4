//********************************************************************************
// CLASS: NegOperator
//
// DESCRIPTION
// The NegOperator class for Project 4.
//
// COURSE AND PROJECT INFORMATION
// CSE205 Object Oriented Programming and Data Structures, A-2022
// Project Number: P4
//
//  * AUTHOR: Zehr, Nicholas
// Asuriteid:1219718305
// Email: nicholas.zehr@icloud.com
//********************************************************************************

/**
 * Represents the negation operator which is a specific type of unary operator.
 */
public class NegOperator extends UnaryOperator{

    public NegOperator() {

    }
    
    @Override
    public Operand evaluate(Operand pOperand) {
        return new Operand(-pOperand.getValue());
    }
    /**
     * Returns the normal precedence level of this operator.
     */
    @Override
    public int precedence() {
        return 4;
    }

    /**
     * Returns the precedence level of this operator when on it is on the operator stack.
     */
    @Override
    public int stackPrecedence() {
        return 4;
    }
    
}