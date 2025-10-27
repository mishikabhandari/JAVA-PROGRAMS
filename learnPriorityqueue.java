// Problem Statement:
// A hospital emergency room wants to serve patients according to the severity of their condition:
// Create a Java program using PriorityQueue where each patient is represented by a Patient object containing a name and
//  an integer severity (higher value = higher severity).
// The queue should always serve patients with the highest severity first 
// (if two patients have the same severity, serve the one who arrived earlier).
// Implement the following:
// Add a new patient with a given name and severity.
// Serve (remove and print) the patient who should be attended next.
// Show the current patient at the front of the queue (peek).
// Display all patients currently waiting in order of their serving priority.

import java.util.*;

class Patient {
    String name;
    int severity;
    public Patient(String name, int severity) {
        this.name = name;
        this.severity = severity;
    }
    @Override
    public String toString() {
        return name + " (" + severity + ")";
    }
}

public class learnPriorityqueue {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            PriorityQueue<Patient> patients = new PriorityQueue<>(
                (a,b) -> b.severity - a.severity
            );
            System.out.println("Enter number of patients to add with name severity- (type 'exit' to stop): ");
            while (true) {
                String patient = sc.nextLine();
                if (patient.equalsIgnoreCase("exit")) {
                    break;
                }
                String[] parts = patient.split(" ");
                String name = parts[0];
                int severity = Integer.parseInt(parts[1]);
                patients.offer(new Patient(name, severity));
            }
            System.out.println("Patients in order of priority: " + patients);
            System.out.println("Serving next patient: " + patients.poll());
            System.out.println("Current patient at front of the queue: " + patients.peek());
            System.out.println("Remaining patients in order of priority: " + patients);
        }
    }
}
