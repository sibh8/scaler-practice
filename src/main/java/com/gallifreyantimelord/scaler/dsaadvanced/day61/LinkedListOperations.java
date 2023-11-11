package com.gallifreyantimelord.scaler.dsaadvanced.day61;

import com.gallifreyantimelord.scaler.dsaadvanced.day61.Node;

public class LinkedListOperations {
    public static Node insertEvenInLinkedList(){
        Node head = new Node(1);
        Node nn1 = new Node(5);
        head.next = nn1;
        Node nn2 = new Node(9);
        nn1.next = nn2;
        Node nn3 = new Node(6);
        nn2.next = nn3;
        Node nn4 = new Node(11);
        nn3.next = nn4;
        Node nn5 = new Node(4);
        nn4.next = nn5;

        return head;
    }

    public static Node insertOddInLinkedList(){
        Node head = new Node(1);
        Node nn1 = new Node(5);
        head.next = nn1;
        Node nn2 = new Node(9);
        nn1.next = nn2;
        Node nn3 = new Node(6);
        nn2.next = nn3;
        Node nn4 = new Node(11);
        nn3.next = nn4;

        return head;
    }
}
