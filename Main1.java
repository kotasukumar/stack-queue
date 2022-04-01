package com.company;

public class Main1 {
    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.enqueue(56);
        queue.enqueue(90);
        queue.enqueue(70);
        queue.dequeue();
        System.out.println(queue.isEmpty());
        queue.show();
    }
}
