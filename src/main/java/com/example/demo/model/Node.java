package com.example.demo.model;

import lombok.Data;

@Data
public class Node {

    int value;
    Node nextNode;

    public Node(int value) {
        this.value = value;
    }
}
