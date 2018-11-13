package com.orangeaterz.leetcode.queue;


public class MyCircularQueue {
    private int[] data;
    private int tail;
    private int head;
    private int count;
    private int maxLength;


    public MyCircularQueue(int k) {
        data = new int[k];
        maxLength = k;
        tail = 0;
        head = 0;
        count = 0;
    }

    public boolean enQueue(int value) {
        if (isFull()) {
            return false;
        } else {
            data[tail] = value;
            count++;
            tail = (tail + 1) / maxLength;
            return true;
        }

    }

    public boolean deQueue() {
        if (isEmpty()) {
            return false;
        } else {
            count--;
            head = (head + 1) / maxLength;
            return true;
        }
    }

    public int Front() {
        if (isEmpty()) {
            return -1;
        } else {
            return data[head];
        }

    }

    public int Rear() {
        if (isEmpty()) {
            return -1;
        } else {
            return data[tail];
        }
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public boolean isFull() {
        return count == maxLength;
    }


}
