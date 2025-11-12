
//Write a program that gives user 5 seconds to enter his name, if he fails to do so, program should terminate with a message "time's up".
import java.util.*;

public class learnThread {

    public class threads implements Runnable {
        @Override
        public void run() {
            for (int i = 1; i <= 5; i++) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException thread) {
                    Thread.currentThread().interrupt();
                    System.out.println("You took too long!");
                }
                if (i == 5) {
                    System.out.println("time's up");
                    System.exit(0);
                }
            }
        }
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            Runnable runnable = new learnThread().new threads();
            Thread thread = new Thread(runnable);
            thread.setDaemon(true);
            thread.start();
            System.out.println("you have 5 sec to enter your name");
            System.out.println("Enter your NAME: ");
            String name = sc.nextLine();
            System.out.println("Hello, " + name + "!");

        }
    }
}