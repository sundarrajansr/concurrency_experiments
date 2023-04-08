package org.concurrency.experiments.executor;

public class Message {
    String message;
    boolean available;

    public Message() {
        message = null;
        available = false;
    }

    public synchronized void setMessage(String message) throws InterruptedException {
        if (this.available) {
            wait();
        }
        this.message = message;
        this.available = true;
        // System.out.println("Message set as " + message);
        notify();
    }

    public synchronized String getMessage() throws InterruptedException {
        if (!this.available) {
            wait();
        }
        this.available = false;
        // System.out.println("Message returned as " + message);
        notify();
        return message;
    }
}
