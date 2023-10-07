package com.simba.leetcode;

import java.util.Objects;

// https://leetcode.com/problems/merge-two-sorted-lists/description/

public class MergeTwoLinkedLists {
    static class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    public Node mergeTwoLists(Node nodeOne, Node nodeTwo) {
        if (!Objects.isNull(nodeOne) && !Objects.isNull(nodeTwo)) {
            if (nodeOne.value < nodeTwo.value) {
                nodeOne.next = mergeTwoLists(nodeOne.next, nodeTwo);
                return nodeOne;
            } else {
                nodeTwo.next = mergeTwoLists(nodeOne, nodeTwo.next);
                return nodeTwo;
            }
        }
        if (Objects.isNull(nodeOne)) {
            return nodeTwo;
        }
        return nodeOne;
    }

    public static void main(String[] args) {

    }
}
