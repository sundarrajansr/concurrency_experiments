package org.concurrency.experiments.executor;

public class Producer implements Runnable {
    Message message;
    private final String[] listOfMessages = { "Test1", "hello java", "Test2", "Hello Producer and Consumer" };

    public Producer(Message message) {
        this.message = message;
    }

    @Override
    public void run() {
        System.out.println("Started Producer");
        for (String message : listOfMessages) {
            System.out.println(System.currentTimeMillis() +" Producing ==>\t" + message);
            try {
                this.message.setMessage(message);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
