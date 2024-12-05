package com.java.jfr.java17;

public class JFRDemo {
    public static void main(String[] args) {
        System.out.println("JFR Demo");
        for(int i=0; i<10; i++) {
            System.out.println("Value of i: " + i);
        }
    }
}

// javac com/java/nondone/jfr/java17/JFRDemo.java  
// java -XX:StartFlightRecording=filename=recording.jfr,dumponexit=true -cp . com.java.nondone.jfr.java17.JFRDemo


// jfr file can be opened using JDK Mission Control (JMC). JMC provides a graphical interface to analyze the recorded data, allowing you to:

// Identify Performance Bottlenecks: See which methods or threads are consuming the most CPU time.
// Analyze Memory Usage: Understand memory allocation patterns and identify potential memory leaks.
// Monitor Thread Activity: Investigate thread states and synchronization issues.
// Inspect I/O Operations: Analyze file and network I/O to identify slow operations