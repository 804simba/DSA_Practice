package com.simba.dsa;

import java.util.Objects;

public class DoublyLinkedList {
    public Node head;
    public Node tail;

    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    static class Node {
        int data;
        Node previous;
        Node next;

        public Node(int data) {
            this.data = data;
            this.previous = null;
            this.next = null;
        }
    }

    public void transverseForward() {
        Node current = head;
        while (!Objects.isNull(current)) {
            System.out.println(current.data + " ");
            current = current.next;
        }
    }

    public void transverseBackward() {
        Node current = tail;
        while (!Objects.isNull(current)) {
            System.out.println(current.previous + " ");
            current = current.previous;
        }
    }

    public void insertNodeAtTheStart(int data) {
        Node temp = new Node(data);
        if (Objects.isNull(head)) {
            head = temp;
            tail = temp;
        } else {
            temp.next = head;
            head.previous = temp;
            head = temp;
        }
    }

    public void insertNodeAtTheEnd(int data) {
        Node temp = new Node(data);
        if (Objects.isNull(tail)) {
            head = temp;
            tail = temp;
        } else {
            tail.next = temp;
            temp.previous = tail;
            tail = temp;
        }
    }

    public void insertAtAPosition(int data, int position) {
        Node temp = new Node(data);
        if (position == 1) {
            insertNodeAtTheStart(data);
        } else {
            Node current = head;
            int currentPosition = 1;
            while (!Objects.isNull(current) && currentPosition < position) {
                current = current.next;
                currentPosition++;
            }
            if (Objects.isNull(current)) {
                insertNodeAtTheEnd(data);
            } else {
                temp.next = current;
                temp.previous = current.previous;
                current.previous.next = temp;
                current.previous = temp;
            }
        }
    }

    public void deleteAtTheStart() {
        if (Objects.isNull(head)) {
            return;
        }

        if (head == tail) {
            head = null;
            tail = null;
            return;
        }

        Node temp = head;
        head = head.next;
        head.previous = null;
        temp.previous = null;
    }

    public void delete(int position) {
        if (Objects.isNull(head)) {
            return;
        }

        if (position == 1) {
            deleteAtTheStart();
            return;
        }

        Node current = head;
        int counter = 1;

        while (!Objects.isNull(current) && counter != position) {
            current = current.next;
            counter++;
        }

        if (Objects.isNull(current)) {
            System.out.println("Wrong position.");
            return;
        }

        if (current == tail) {
            deleteAtTheEnd();
            return;
        }

        current.previous.next = current.next;
        current.next.previous = current.previous;
        current.previous = null;
        current.next = null;
    }

    public void deleteAtTheEnd() {
        if (tail == null) {
            return;
        }

        if (head == tail) {
            head = null;
            tail = null;
            return;
        }

        Node temp = tail;
        tail = tail.previous;
        tail.next = null;
        temp.previous = null;
    }

    public void display() {
        Node temp = head;
        while (!Objects.isNull(temp)) {
            System.out.println(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        DoublyLinkedList linkedList = new DoublyLinkedList();


        linkedList.insertNodeAtTheEnd(1);
        linkedList.insertNodeAtTheEnd(2);
        linkedList.insertNodeAtTheEnd(3);
        linkedList.insertNodeAtTheEnd(4);
        linkedList.insertNodeAtTheEnd(5);

        System.out.print("After insertion at tail: ");
        linkedList.display();

        System.out.print("After insertion at head: ");
        linkedList.insertNodeAtTheStart(0);
        linkedList.display();

        linkedList.insertAtAPosition(6, 2);
        System.out.print(
                "After insertion at 2nd position: ");
        linkedList.display();

        linkedList.deleteAtTheStart();
        System.out.print(
                "After deletion at the beginning: ");
        linkedList.display();

        linkedList.deleteAtTheStart();
        System.out.print("After deletion at the end: ");
        linkedList.display();

        linkedList.delete(2);
        System.out.print(
                "After deletion at 2nd position: ");
        linkedList.display();
    }
}
