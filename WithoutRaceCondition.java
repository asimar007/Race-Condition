public class WithoutRaceCondition {
    // Shared counter variable
    private static int counter = 0;

    // Synchronized method to increment counter
    public synchronized static void incrementCounter() {
        for (int i = 0; i < 100000; i++) {
            counter++; // Protected by synchronized
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(WithoutRaceCondition::incrementCounter);
        Thread thread2 = new Thread(WithoutRaceCondition::incrementCounter);

        // Start the threads
        thread1.start();
        thread2.start();

        // Wait for both threads to finish
        thread1.join();
        thread2.join();

        // Print final counter value
        System.out.println("Final counter value with synchronization: " + counter);
    }
}
