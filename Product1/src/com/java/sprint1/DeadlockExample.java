package com.java.sprint1;

public class DeadlockExample {
    private static final Object lock1 = new Object();
    private static final Object lock2 = new Object();

    private static final Object lock3= new Object();

    private static final Object lock4=new Object();

    private static final Object lock5= new Object();

    private static final Object lock6= new Object();


    private static int sharedResource = 0;

    private static int sharedResources1=0;

    public DeadlockExample() {
    }

    public static void main(String[] args) {

        Thread thread3= new Thread(()->{
            synchronized (lock3){
                System.out.println("thread3:holding lock3");
                try {
                    Thread.sleep(100L);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
                System.out.println("Thread 3 waiting for lock4***");
                synchronized (lock4){
                    sharedResource++;
                    System.out.println("Thread3:holding lock4***, shared resource value"+sharedResource);

                }
            }
        });

        Thread thread4= new Thread(()->{
            synchronized (lock4){
                System.out.println("thread4 holding lock4...");
                try {
                    Thread.sleep(100L);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
                System.out.println("thread4 waiting for lock3");
                synchronized (lock3){
                    sharedResource++;
                    System.out.println("holding lock 3, shared resource value"+sharedResource);
                }
            }
        });
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


        Thread thread5= new Thread(()->{
            synchronized (lock5){
                System.out.println("thread 5 holding lock 5");
                try{
                    Thread.sleep(100L);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
            System.out.println("theread5 waiting for lock 6");
            synchronized (lock6){
                sharedResources1++;
                System.out.println("thread5 acquired lock 6");

            }
        });

        Thread thread6 = new Thread(()->{
            synchronized (lock6){
                System.out.println("thread6 acquired lock6");
                try{
                    Thread.sleep(100L);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
            System.out.println("thread 6 waiting for lock5");
            synchronized (lock5){
                sharedResources1--;
                System.out.println("thread6 acquired lock 6");
            }
        });
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
        thread6.start();
        try{
            thread5.join();
            thread6.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}

