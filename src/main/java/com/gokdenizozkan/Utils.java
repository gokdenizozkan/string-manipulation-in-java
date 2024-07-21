package com.gokdenizozkan;

import org.openjdk.jol.vm.VM;
import org.openjdk.jol.vm.VirtualMachine;

public class Utils {
    static VirtualMachine vm = VM.current();

    static long address(Object o) {
        return vm.addressOf(o);
    }

    static void printAddress(Object o) {
        System.out.println(address(o));
    }

    static void printAddress(Object o, String variableName) {
        System.out.println(variableName + "\tis at\t" + address(o));
    }

    static void printWithPrefix(String prefix, Object o) {
        System.out.println(prefix + " -> " + o);
    }

    static void printWithPrefix(String prefix, Object o, boolean newLine) {
        if (newLine) {
            printWithPrefix(prefix, o);
        }
        else {
            System.out.print(prefix + " -> " + o);
        }
    }

    static void decorate(String title, Runnable r) {
        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-\tSTART " + title + "\t-*-*-*-*-*-*-*-*-*-*-*-*");
        r.run();
        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-\tEND " + title + "\t-*-*-*-*-*-*-*-*-*-*-*-*\n\n");


    }
}
