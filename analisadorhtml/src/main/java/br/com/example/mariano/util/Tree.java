package br.com.example.mariano.util;

public class Tree {
   public Node root;

    public Tree(String rootValue) {
        root = new Node(rootValue);
    }

    public Tree() {
    }

    public void addRoot(String rootValue) {
       root = new Node(rootValue);
    }

    public Node getDeepestNode() {
        return getDeepestNode(root).node;
    }

    private Result getDeepestNode(Node node) {
        if (node.children.isEmpty()) {
            return new Result(node, 1);
        }
        Result deepest = new Result(node, 0);
        for (Node child : node.children) {
            Result childResult = getDeepestNode(child);
            if (childResult.depth > deepest.depth) {
                deepest = childResult;
            }
        }
        return new Result(deepest.node, deepest.depth + 1);
    }

    private static class Result {
        Node node;
        int depth;

        Result(Node node, int depth) {
            this.node = node;
            this.depth = depth;
        }
    }
}
