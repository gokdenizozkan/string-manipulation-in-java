package com.gokdenizozkan;

import java.util.Arrays;

public class StringMethods {
    // #1 Trim removes all whitespace and space characters (which has a unicode of 0020 or less),
    //    Strip has its own definition for whitespace and space characters (generally speaking, it encompasses a broader set of space characters).
    void trimVsStrip() {
        String __hello_ = "  hello ";
        String _world__ = "\u2001 world  \u2001";

        System.out.print("trim: $");
        System.out.print(__hello_.trim());
        System.out.print(_world__.trim());
        System.out.print("$\n");

        System.out.print("strip: $");
        System.out.print(__hello_.strip());
        System.out.print(_world__.strip());
        System.out.print("$\n");
    }

    // #2 Index of a character or string
    void indexOf() {
        String hello = "hello";
        char c = 'e';
        System.out.println(c + "\t\tis at\t" + hello.indexOf(c) + "\tin\t" + hello);

        // what if we provide more than one characters? One is found, the other is not?
        String llo = "llo";
        System.out.println(llo + "\t\tis at\t" + hello.indexOf(llo) + "\tin\t" + hello);

        String llos = "llos";
        System.out.println(llos + "\tis at\t" + hello.indexOf(llos) + "\tin\t" + hello);
    }

    // #3 Trim
    void split() {
        String greetingsText = "Hello world ! Hi universe !";
        System.out.println(greetingsText + "\n");

        String[] greetings = greetingsText.split("!");
        Arrays.stream(greetings)
                //.map(String::trim)
                .forEach(System.out::println);
    }

    void reverse() {
        String text = "Hello world!";
        String reversed = new StringBuilder(text).reverse().toString();
        System.out.println(text + "\n" + reversed);
    }
}
