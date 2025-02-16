package br.com.example.mariano.util;

import java.util.*;

public class HTMLParser {
    public static Map<String, String> coletarConteudo(String html) {
        Map<String, String> conteudo = new LinkedHashMap<>();
        String[] linhas = html.split("\n");

        Deque<Node> stack = new ArrayDeque<>();
        Tree tree = null;

        for (String linha : linhas) {
            linha = linha.trim();

            if (linha.isEmpty()) {
                continue;
            }

            if (linha.startsWith("<") && !linha.startsWith("</")) { // Tag de abertura
                String tag = linha.replace("<", "").replace(">", "");

                Node newNode = new Node(tag);

                if (tree == null) {
                    tree = new Tree(tag);
                    stack.push(tree.root);
                } else {
                    assert stack.peek() != null;
                    stack.peek().addChild(newNode);
                    stack.push(newNode);
                }
            } else if (linha.startsWith("</")) {
                stack.pop();
            } else {
                if (!stack.isEmpty()) {
                    stack.peek().addChild(new Node(linha));
                }
            }
        }

        if (tree != null) {
            Node deepest = tree.getDeepestNode();
            conteudo.put("Conteúdo mais profundo", deepest.value);
        }

        return conteudo;
    }
}

