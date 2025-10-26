//Problem Statement:
// Write a Java program using the Queue interface and LinkedList to simulate a ticket counter where people arrive
// and are served in the order they arrive (FIFO). Your program should support the following actions:
// Add a person's name to the queue when they arrive.
// Serve the person at the front of the queue and remove them.
// Show the next person to be served (peek).
// Display the number of people currently waiting in the queue.

import java.util.*;
import java.util.Queue;

public class learnQueue {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            Queue<String> names = new LinkedList<>();
            System.out.println("Enter names to be added in the queue(type \"exit\" to stop)");
            while (true) {
                String name = sc.nextLine();
                if (name.equalsIgnoreCase("exit")) {
                    break;
                }
                names.offer(name);
            }
            System.out.println("Served: " + names.poll());
            System.out.println("Names in the queue are: " + names);
            System.out.println("Next in queue: " + names.peek());
            System.out.println("Number waiting: " + names.size());
        }
    }
}
