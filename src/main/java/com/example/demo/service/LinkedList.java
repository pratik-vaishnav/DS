package com.example.demo.service;

import com.example.demo.model.Node;
import lombok.ToString;
import org.springframework.stereotype.Service;

@ToString
@Service
public class LinkedList {

    Node head;
    Node tail;

    public void addToFront(int value) {
        Node newNode = new Node(value);
        newNode.setNextNode(head);
        head = newNode;
        tail = head;
    }

    public void addToEnd(int value) {
        Node node = new Node(value);
        if (head == null) { this.head = node; this.tail = node; } else {
            Node current = head;
            while (current.getNextNode() != null) {
                current = current.getNextNode();
            }
            current.setNextNode(node);
            tail = node;
        }
    }

    public void insertAfterKthNode(int value, int kth) {
        Node node = new Node(value);
        Node current = head;
        if (head == null) {
            head = node;
            tail = node;
        } else {
            for (int i = 1; i < kth; i++) {
                current = current.getNextNode();
            }
            node.setNextNode(current.getNextNode());
            current.setNextNode(node);
        }
    }

    public int getHeadValue() {
        if (head == null) {
            return -1;
        } else {
            return head.getValue();
        }
    }

    public void insertAtLast(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.setNextNode(newNode);
            tail = newNode;
        }
    }
}
