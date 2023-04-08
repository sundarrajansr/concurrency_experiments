package org.concurrency.experiments.executor;

public class Consumer implements Runnable {
    Message message;

    public Consumer(Message message) {
        this.message = message;
    }

    @Override
    public void run() {
        System.out.println("Started Consumer");
        while (true) {
            try {
                Thread.sleep(1000); // Slow consumer.
                System.out.println("\t\t" + System.currentTimeMillis() +" Consumed ==>\t" + this.message.getMessage());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
