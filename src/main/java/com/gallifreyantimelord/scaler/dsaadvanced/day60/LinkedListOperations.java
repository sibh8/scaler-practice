package com.gallifreyantimelord.scaler.dsaadvanced.day60;

public class LinkedListOperations {
    public static Node insertInLinkedList(){
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
        Node nn6 = new Node(7);
        nn5.next = nn6;
        Node nn7 = new Node(2);
        nn6.next = nn7;
        Node nn8 = new Node(20);
        nn7.next = nn8;
        Node nn9 = new Node(3);
        nn8.next = nn9;
        Node nn10 = new Node(16);
        nn9.next = nn10;


        return head;
    }

    public static Node insertPalindromeInLinkedList(){
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
        Node nn6 = new Node(11);
        nn5.next = nn6;
        Node nn7 = new Node(6);
        nn6.next = nn7;
        Node nn8 = new Node(9);
        nn7.next = nn8;
        Node nn9 = new Node(5);
        nn8.next = nn9;
        Node nn10 = new Node(1);
        nn9.next = nn10;


        return head;
    }
}
