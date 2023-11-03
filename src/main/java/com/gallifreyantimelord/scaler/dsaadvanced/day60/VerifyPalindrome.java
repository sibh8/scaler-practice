package com.gallifreyantimelord.scaler.dsaadvanced.day60;

public class VerifyPalindrome {
    public static void main(String[] args) {
        Node head = LinkedListOperations.insertPalindromeInLinkedList();
        int len = getNodeCountInLinkedList(head);

        int m = len/2;

        Node h1 = head;
        Node h2 = null;
        Node tmp = head;

        for(int i=0; i<=m; i++){
            if(i == m) {
                h2 = tmp.next;
                tmp.next = null;
                break;
            }
            tmp=tmp.next;
        }

//        Node tmp1 = h1;
//        Node tmp2 = h2;

//        while(tmp1!=null){
//            System.out.print(tmp1.data+" ");
//            tmp1 = tmp1.next;
//        }
//
//        System.out.println();
//
//        while(tmp2!=null){
//            System.out.print(tmp2.data+" ");
//            tmp2 = tmp2.next;
//        }

//        System.out.println();

        h2 = reverseLinkedList(h2);

//        tmp1 = h2;
//
//        while(tmp1!=null){
//            System.out.print(tmp1.data+" ");
//            tmp1 = tmp1.next;
//        }

        System.out.println("Linked List Palindrome Status: "+isLinkedListSame(h1, h2));
    }

    private static int getNodeCountInLinkedList(Node head){
        int cnt = 0;
        Node tmp = head;

        while(tmp != null){
            cnt+=1;
            tmp = tmp.next;
        }

        return cnt;
    }

    private static Node reverseLinkedList(Node head){
        Node prev = null;
        Node curr = head;

        while(curr != null){
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }

    private static boolean isLinkedListSame(Node h1, Node h2){
        Node tmp = h1;
        Node tmp2 = h2;

        while(tmp != null && tmp2 != null){
            if(tmp.data !=  tmp2.data)
                return false;
            tmp = tmp.next;
            tmp2 = tmp2.next;
        }

        return true;
    }
}
