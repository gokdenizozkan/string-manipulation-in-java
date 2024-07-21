package com.gokdenizozkan;

public class StringFundamentals {
    // #1 Java Strings are immutable.
    void immutable() {
        String original;

        original = "Original!";
        Utils.printAddress(original, "original");

        original = "I think I just mutated it!"; // did I?
        Utils.printAddress(original, "original");

        original = "Dang it! I failed!";
        Utils.printAddress(original, "original");
    }

    // #2 Because Strings are immutable, we may store them in a pool of Strings and reuse them.
    void pool() {
        String hello;
        String hello2;

        hello = "Hello";
        Utils.printAddress(hello, "hello");

        hello2 = "Hello";
        Utils.printAddress(hello2, "hello2");
    }

    // #3 But we can force Java to create a new object in the memory for an object.
    void newString() {
        String world;
        String world2;

        world = "world";
        Utils.printAddress(world, "world");

        world2 = new String("world");
        Utils.printAddress(world2, "world2");
    }

    // #4 Thus, concatenating strings results in new String objects.
    void concat() {
        String hello = "Hello";
        String world = "world";
        String concat = hello + world;
        String concat2 = hello + world;
        Utils.printAddress(concat, "concat");
        Utils.printAddress(concat2, "concat2");
    }

    // #5 We can at least remove the burden of creating separate string variables by using StringBuilder.
    void stringBuilder() {
        StringBuilder builder = new StringBuilder();
        builder.append("Hello");
        builder.append("world");
        String built = builder.toString();
        System.out.println("Debugged");
    }

    // #6 StringBuffer is synchronized, thus, thread-safe version of StringBuilder. Will use more memory and perform less than its counterpart.
    void stringBuffer() {
        StringBuffer buffer = new StringBuffer();
        buffer.append("Hello");
        buffer.append("world");
        String built = buffer.toString();
        System.out.println("Debugged");
    }

    // #7 StringBuilder and StringBuffer can be used to insert and remove characters.
    void stringBuilderInsert() {
        StringBuilder builder = new StringBuilder();
        builder.append("Hello");
        builder.deleteCharAt(1);
        builder.insert(1, 2);
        String built = builder.toString();
        System.out.println(built);
    }

    // EXAMPLE #8 Join Strings from array
    void joinStringsFromArray() {
        String[] tokens = {"Hello", "world", "!", "Hi", "universe", "!"};

        // Method #1
        String concat = "";
        for (String token : tokens) {
            concat += token + " "; // 2 new string objects got created: 1. token + " " 2. concat + (1)
        }

        // Method #2
        StringBuilder sb = new StringBuilder();
        for (String token : tokens) {
            sb.append(token).append(" "); // Token and " " were added to the char[] array under the hood
        }
        String sbResult = sb.toString();

        System.out.println("Done on code");
    }

    // #9 .equals() vs ==
    // One is a method call, whatever is written in equals, it will return that. The other is a value comparison operator.
    //
    /*
     * Reflexivity: For any object x, x.equals(x) should always return true:
     *      x == x
     * Symmetry: If x.equals(y) returns true, then y.equals(x) must also return true:
     *      x == y -> true => y == x -> true
     * Transitivity: If x.equals(y) and y.equals(z) are both true, then x.equals(z) must also be true:
     *      x == y == z -> true => x == z -> true
     * Consistency: Multiple invocations of x.equals(y) should return the same result:
     *      x == y -> true => x == y -> true ... all the time
     * Non-nullity: The equals() method should never return true when compared to null:
     *      x == null -> !true
     */
    void equalsVsEqualOperator() {
        String hello = "Hello";
        String hello2 = "Hello";
        Utils.printWithPrefix("hello == hello2", hello == hello2);
        Utils.printWithPrefix("hello.equals(hello2)", hello.equals(hello2));

        System.out.println();

        String world = "world";
        String world2 = new String("world");
        Utils.printWithPrefix("world == world2", world == world2);
        Utils.printWithPrefix("world.equals(world2)", world.equals(world2));

        // See the equals method.
    }
}
