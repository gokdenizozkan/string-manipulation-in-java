package com.gokdenizozkan;

public class Questions {
    void reverse() {
        System.out.println(reverse("Hello world!"));
    }

    String reverse(String text) {
        int len = text.length();
        char[] reversed = new char[len];
        for (int i = 0; i < len; i++) {
            reversed[i] = text.charAt(len - 1 - i);
        }
        return String.valueOf(reversed);
    }
}
