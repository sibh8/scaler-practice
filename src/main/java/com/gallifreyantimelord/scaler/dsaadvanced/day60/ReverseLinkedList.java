package com.gallifreyantimelord.scaler.dsaadvanced.day60;

public class ReverseLinkedList {
    public static void main(String[] args) {
        Node head = LinkedListOperations.insertInLinkedList();

        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }

        System.out.println();

        temp = reverseLinedList(head);
        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }

    private static Node reverseLinedList(Node head){
        Node prev = null;
        Node curr = head;

        while(curr != null){
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        head = prev;
        return head;
    }
}
