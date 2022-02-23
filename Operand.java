//********************************************************************************
// CLASS: Operand
//
// DESCRIPTION
// The Operand class for Project 4.
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
 * An operand is a numeric value represented as a Double.
 */
public class Operand extends Token {
    private Double mValue;

    public Operand(Double pValue) {
        setValue(pValue);
    }

    public Double getValue() {
        return mValue;
    }

    public void setValue(Double pValue) {
        mValue = pValue;
    }
}
