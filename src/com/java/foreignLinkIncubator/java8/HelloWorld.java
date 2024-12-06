package com.java.foreignLinkIncubator.java8;

import jdk.incubator.foreign.*;

public class HelloWorld {
    public static void main(String[] args) {
        // Load the native library
        var linker = Linker.nativeLinker();
        var function = linker.load("helloWorld");

        // Call the native function
        function.invoke();
    }
}

