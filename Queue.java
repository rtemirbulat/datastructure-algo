package com.company;

public class Queue {
    int queue[] = new int[5];
    int size;
    int front;
    int rear;
    public void enQueue(int data){
        queue[rear] = data;
        rear = (rear + 1)%5;
        size += 1;

    }

    public int deQueue(){
        int data =  queue[front];
        front  = (front + 1)%5;
        size = size - 1;

        return data;

    }

    public void show(){
        System.out.println("Elements: ");
        for (int i = 0; i < size ; i++) {
            System.out.print(queue[(front + i)%5]+" ");
        }
        for (int n: queue) {
            System.out.print(n + " ");
        }
    }

}
