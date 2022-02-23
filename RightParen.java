//********************************************************************************
// CLASS: RightParen
//
// DESCRIPTION
// The RightParen class for Project 4.
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
 * Represents a right parenthesis in the expression.
 */
public class RightParen extends Parenthesis {

    public RightParen() {
    }

    /**
     * Right parentheses really don't have precedence since they are not pushed on the operator stack, but we
     * have to override precedence() so we assign the lowest precedence level to RightParen.
     */
    @Override
    public int precedence() {
        return 1;
    }

    /**
     * See comments in precedence().
     */
    @Override
    public int stackPrecedence() {
        return 1;
    }

}