package com.simba.dsa;

import java.util.Objects;

/**
 * @author Simba, 2023
 *
 * */
public class SinglyLinkedList {
    public Node head;
    public Node tail;

    public SinglyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }

        @Override
        public String toString() {
            return "Node [" +
                    "data = " + data +
                    ", next = " + next +
                    ']';
        }
    }

    public void addNode(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            tail = newNode;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void display() {
        Node current = head;

        if (Objects.isNull(head)) {
            System.out.println("List is empty.");
        }

        while (!Objects.isNull(current)) {
            System.out.println(current.next + " ");
            current = current.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        SinglyLinkedList linkedList = new SinglyLinkedList();

        linkedList.addNode(3);
        linkedList.addNode(4);
        linkedList.addNode(10);

        linkedList.display();
    }
}
