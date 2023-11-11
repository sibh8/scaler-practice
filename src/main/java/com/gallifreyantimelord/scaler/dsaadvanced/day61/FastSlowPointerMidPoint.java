package com.gallifreyantimelord.scaler.dsaadvanced.day61;

public class FastSlowPointerMidPoint {

    public static void main(String[] args) {
        Node head = LinkedListOperations.insertEvenInLinkedList();
        System.out.println("Output from Even Linked List");
        analyseMidElement(head);

        System.out.println();
        System.out.println("Output from Odd Linked List");
        head = LinkedListOperations.insertOddInLinkedList();
        analyseMidElement(head);
    }

    private static void analyseMidElement(Node head) {
        Node s = head;
        Node f = head;
        int cnt = 1;

        while(f != null && f.next != null){
            cnt+=1;
            s = s.next;
            f = f.next.next;
        }

        System.out.println("Node Number: "+cnt);
        System.out.println("Node data: "+s.data);
    }
}
