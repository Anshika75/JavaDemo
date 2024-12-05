package com.java.conccurentThreadStack.java17;

import java.util.ArrayList;
import java.util.Random;

public class GarbageCollectionDemo {
    private static final int MAX_MEMORY_HOG_SIZE = 500; // Limit to 500 MB
    private static final int ALLOCATION_DELAY_MS = 50; // Delay in milliseconds
    private static final int MEMORY_USAGE_THRESHOLD_MB = 450; // Threshold to stop allocation

    public static void main(String[] args) {
        ArrayList<byte[]> memoryHog = new ArrayList<>();
        Random random = new Random();

        System.out.println("Simulating heavy memory usage...");
        while (true) {
            // Check memory usage
            long usedMemoryMB = (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()) / (1024 * 1024);
            if (usedMemoryMB >= MEMORY_USAGE_THRESHOLD_MB) {
                System.out.println("Memory usage threshold reached. Stopping allocation.");
                break;
            }

            // Allocate memory in chunks of 1 MB
            if (memoryHog.size() < MAX_MEMORY_HOG_SIZE) {
                memoryHog.add(new byte[1_000_000]);
            }

            // Occasionally remove some elements to simulate GC
            if (random.nextInt(5) == 0 && !memoryHog.isEmpty()) {
                memoryHog.remove(random.nextInt(memoryHog.size()));
            }

            // Add a delay to slow down the allocation rate
            try {
                Thread.sleep(ALLOCATION_DELAY_MS);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                break;
            }

            // Additional memory check after delay
            usedMemoryMB = (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()) / (1024 * 1024);
            if (usedMemoryMB >= MEMORY_USAGE_THRESHOLD_MB) {
                System.out.println("Memory usage threshold reached after delay. Stopping allocation.");
                break;
            }
        }
    }
}


// javac -d . com\java\nondone\conccurentThreadStack\java17\GarbageCollectionDemo.java
// java -XX:+UseZGC -Xms5G -Xmx5G -Xlog:gc com.java.nondone.conccurentThreadStack.java17.GarbageCollectionDemo