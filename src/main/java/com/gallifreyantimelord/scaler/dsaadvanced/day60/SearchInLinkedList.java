package com.gallifreyantimelord.scaler.dsaadvanced.day60;

import java.util.Random;

public class SearchInLinkedList {
    public static void main(String[] args) {

        Node head = LinkedListOperations.insertInLinkedList();
        Node tmp = head;

        while(tmp.next != null){
            System.out.print(tmp.data+" ");
            tmp = tmp.next;
        }

        System.out.println();
        // Search in Linkedlist
        boolean tf = findInLinkedList(head, 11);
        System.out.println("Number 11 search status: "+tf);

        tf = findInLinkedList(head, 22);
        System.out.println("Number 20 search status: "+tf);
    }

    public static boolean findInLinkedList(Node head, int x){
        Node tmp = head;
        while(tmp.next != null){
            if(tmp.data == x)
                return true;
            tmp = tmp.next;
        }
        return false;
    }
}
