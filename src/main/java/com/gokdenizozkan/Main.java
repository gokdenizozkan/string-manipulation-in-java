package com.gokdenizozkan;

public class Main {
    public static void main(String[] args) {
        StringFundamentals fundamentals = new StringFundamentals();
        Utils.decorate("IMMUTABLE", fundamentals::immutable);
        Utils.decorate("POOL", fundamentals::pool);
        Utils.decorate("NEW STRING", fundamentals::newString);
        Utils.decorate("CONCAT", fundamentals::concat);
        Utils.decorate("STRING BUILDER", fundamentals::stringBuilder);
        Utils.decorate("STRING BUFFER", fundamentals::stringBuffer);
        Utils.decorate("STRING BUILDER - DELETE & INSERT", fundamentals::stringBuilderInsert);
        Utils.decorate("EXAMPLE: Join Strings From Array", fundamentals::joinStringsFromArray);
        Utils.decorate("EQUALS() vs. ==", fundamentals::equalsVsEqualOperator);

        StringMethods methods = new StringMethods();
        Utils.decorate("TRIM VS STRIP", methods::trimVsStrip);
        Utils.decorate("INDEX OF", methods::indexOf);
        Utils.decorate("SPLIT", methods::split);
        Utils.decorate("SPLIT", methods::reverse);

        Questions questions = new Questions();
        Utils.decorate("REVERSE", questions::reverse);

    }
}