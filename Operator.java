//********************************************************************************
// CLASS: Operator
//
// DESCRIPTION
// The Operator class for Project 4.
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
 * Operator is the superclass of all binary and unary operators.
 */
public abstract class Operator extends Token {
    public Operator() {

    }

    public abstract boolean isBinaryOperator();

    public abstract int precedence();
    
    public abstract int stackPrecedence();
}
