package com.company.Challenge;

public class Main {
    public static void main(String[] args) {
        SearchTree tree = new SearchTree(null);
        tree.traverse(tree.getRoot());

//        String stringData  = "Darwin brisbane perth melbourne Canberra Adelaide Sydney Cenberra";

        String stringData = " 5 7 9 3 0 5 ";
        String[] data = stringData.split(" ");
        for (String s : data){
            tree.addItem(new Node(s));
        }

        tree.traverse(tree.getRoot());
    }
}
