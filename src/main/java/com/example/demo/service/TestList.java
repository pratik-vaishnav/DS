package com.example.demo.service;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestList {

    @Autowired LinkedList linkedList;

    @PostConstruct
    public void test() {
        linkedList.addToFront(1);
        linkedList.addToFront(2);
        linkedList.addToEnd(3);
        linkedList.insertAfterKthNode(4, 2);

        System.out.println(linkedList.toString());
    }
}
