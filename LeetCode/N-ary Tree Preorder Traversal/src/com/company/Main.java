package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void getVal(Node node, List<Integer> results){

        if(node == null)
            return;

        results.add(node.val);

        if(node.children == null)
            return;

        for(Node child : node.children){
            getVal(child, results);
        }
    }

    public static List<Integer> preorder(Node root){
        List<Integer> results = new ArrayList<>();

        if(root == null)
            return results;
        getVal(root, results);

        return results;
    }

    public static void main(String[] args) {

        Node empty = new Node();

        Node root1 = new Node(1);
        Node leaf1 = new Node(5);
        Node leaf2 = new Node(6);
        Node leaf3 = new Node(2);
        Node leaf4 = new Node(4);

        List<Node> nodeChildren = new ArrayList<>();
        nodeChildren.add(leaf1);
        nodeChildren.add(leaf2);

        Node node1 = new Node(3, nodeChildren);


        List<Node> childrenNodes = new ArrayList<>();

        childrenNodes.add(node1);
        childrenNodes.add(leaf3);
        childrenNodes.add(leaf4);

        Node root2 = new Node(1, childrenNodes);

        List<Integer> printTree = preorder(root2);

        System.out.println(printTree);

    }
}
