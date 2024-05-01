package com.java.sprint1;

public class DeadlockExample {
    private static final Object lock1 = new Object();
    private static final Object lock2 = new Object();

    private static int sharedResource = 0;

    public DeadlockExample() {
    }

    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            synchronized(lock1) {
                System.out.println("Thread1: holding lock1....");

                try {
                    Thread.sleep(100L);
                } catch (InterruptedException var5) {
                }

                System.out.println("Thread1: waiting for lock2");
                synchronized(lock2) {
                    sharedResource++;
                    System.out.println("Thread1: Acquired lock2, Shared Resource Value: " + sharedResource);
                }

            }
        });
        Thread thread2 = new Thread(() -> {
            synchronized(lock1) {
                System.out.println("Thread 2: Holding lock1...");

                try {
                    Thread.sleep(100L);
                } catch (InterruptedException var5) {
                }

                System.out.println("Thread 2: Waiting for lock2...");
                synchronized(lock2) {
                    sharedResource--;
                    System.out.println("Thread 2: Acquired lock2, Shared Resource Value: " + sharedResource);
                }

            }
        });
        thread1.start();
        thread2.start();
    }
}

