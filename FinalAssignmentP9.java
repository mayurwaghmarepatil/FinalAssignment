package ineuron;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class FinalAssignmentP9 {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        int capacity = 5;
        int totalNumbers = 10; // Total numbers to be produced

        Thread producerThread = new Thread(new Producer(queue, capacity, totalNumbers));
        Thread consumerThread = new Thread(new Consumer(queue));

        producerThread.start();
        consumerThread.start();
    }
}

class Producer implements Runnable {
    private Queue<Integer> queue;
    private int capacity;
    private int totalNumbers;
    private int currentNumber;

    public Producer(Queue<Integer> queue, int capacity, int totalNumbers) {
        this.queue = queue;
        this.capacity = capacity;
        this.totalNumbers = totalNumbers;
        this.currentNumber = 1;
    }

    @Override
    public void run() {
        Random random = new Random();

        while (currentNumber <= totalNumbers) {
            synchronized (queue) {
                while (queue.size() == capacity) {
                    try {
                        queue.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                int number = random.nextInt(100);
                queue.add(number);
                System.out.println("Produced: " + number);

                currentNumber++;

                if (currentNumber > totalNumbers) {
                    break;
                }

                queue.notifyAll();
            }
        }
    }
}

class Consumer implements Runnable {
    private Queue<Integer> queue;

    public Consumer(Queue<Integer> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (queue) {
                while (queue.isEmpty()) {
                    try {
                        queue.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                int sum = 0;
                while (!queue.isEmpty()) {
                    int number = queue.poll();
                    sum += number;
                    System.out.println("Consumed: " + number);
                }

                System.out.println("Sum: " + sum);

                queue.notifyAll();

                if (sum == 0) {
                    break;
                }
            }
        }
    }
}

