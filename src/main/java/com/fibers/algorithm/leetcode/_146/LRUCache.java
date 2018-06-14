package com.fibers.algorithm.leetcode._146;

import java.util.HashMap;
import java.util.Map;

class Node {
    Node pre;
    Node next;
    int key;
    int val;

    public Node(int key, int val) {
        this.key = key;
        this.val = val;
    }
}

public class LRUCache {
    Node head;
    Node tail;
    int capacity;
    int size;
    Map<Integer, Node> map = new HashMap<>();

    public LRUCache(int capacity) {
        this.capacity = capacity;
        head = new Node(0, 0);
        tail = new Node(0, 0);
        head.next = tail;
        tail.pre = head;
    }

    public int get(int key) {
        if (!map.containsKey(key)) {
            return -1;
        }

        Node n = map.get(key);
        n.pre.next = n.next;
        n.next.pre = n.pre;

        tail.pre.next = n;
        n.pre = tail.pre;
        n.next = tail;
        tail.pre = n;

        return n.val;
    }

    public void put(int key, int value) {
        if (this.get(key) != -1) {
            Node n = map.get(key);
            n.val = value;
            return;
        }

        Node node = new Node(key, value);
        size++;
        map.put(key, node);
        tail.pre.next = node;
        node.pre = tail.pre;
        node.next = tail;
        tail.pre = node;

        if (size > capacity) {
            map.remove(head.next.key);
            head.next = head.next.next;
            head.next.pre = head;
            size--;
        }
    }
}
