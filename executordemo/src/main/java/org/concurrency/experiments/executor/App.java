package org.concurrency.experiments.executor;

// import java.util.Scanner;

public final class App {
    private App() {
    }

    public static void main(String[] args) {
        Message message = new Message();
        Consumer consumer = new Consumer(message);
        Producer producer = new Producer(message);
        // Scanner scanner = new Scanner(System.in);

        // //Wait for user input
        // System.out.println("Shall we continue starting consumer and producer ? ");
        // String line = scanner.nextLine();
        // if (!line.equalsIgnoreCase("yes")) {
        //     scanner.close();
        //     return;
        // }
        // scanner.close();
        
        new Thread(consumer).start();
        new Thread(producer).start();

    }
}
