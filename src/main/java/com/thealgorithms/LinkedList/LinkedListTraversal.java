package com.thealgorithms.LinkedList;

public class LinkedListTraversal {

    public static class Node{
        public int data;
        public Node next;

        public Node(int data){
            this.data = data;
        }

        public Node(){
        }
    }

    public Node head;

    public Node addElement(int val,Node node){

        Node newNode = new Node(val);

        if (node == null){
            node = newNode;
            head = node;
            return head;
        }

        Node temp = node;
        while(temp.next != null){
            temp = temp.next;
        }

        temp.next = new Node(val);
        return node;
    }

    public void traverse(Node node){
        while (node != null){
            System.out.print(node.data+"->");
            node = node.next;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,7,3,4};
        LinkedListTraversal linkedList = new LinkedListTraversal();
        Node node = new Node();
        for (int i = 0; i < arr.length; i++) {
            node = linkedList.addElement(arr[i],node);
        }

        linkedList.traverse(node.next);
    }
}
