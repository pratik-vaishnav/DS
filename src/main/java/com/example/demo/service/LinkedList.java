package com.example.demo.service;

import com.example.demo.model.Node;
import lombok.ToString;
import org.springframework.stereotype.Service;

@ToString
@Service
public class LinkedList {

    Node head;

    public void addToFront(int value) {
        Node newNode = new Node(value);
        newNode.setNextNode(head);
        head = newNode;
    }

    public int getHeadValue() {
        if (head == null) {
            return -1;
        } else {
            return head.getValue();
        }
    }
}
