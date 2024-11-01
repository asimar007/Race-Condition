public class WithRaceCondition {
    // Shared counter variable
    private static int counter = 0;

    // Method to increment counter without synchronization
    public static void incrementCounter() {
        for (int i = 0; i < 100000; i++) {
            counter++; // Race condition here
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(WithRaceCondition::incrementCounter);
        Thread thread2 = new Thread(WithRaceCondition::incrementCounter);

        // Start the threads
        thread1.start();
        thread2.start();

        // Wait for both threads to finish
        thread1.join();
        thread2.join();

        // Print final counter value
        System.out.println("Final counter value without synchronization: " + counter);
    }
}
