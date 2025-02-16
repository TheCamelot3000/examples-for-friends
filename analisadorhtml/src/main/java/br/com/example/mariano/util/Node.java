package br.com.example.mariano.util;

import java.util.LinkedList;

public class Node {
    String value;
    LinkedList<Node> children;

    public Node(String value) {
        this.value = value;
        this.children = new LinkedList<>();
    }

    public void addChild(Node child) {
        children.add(child);
    }
}
