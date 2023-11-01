package com.gallifreyantimelord.scaler.dsaadvanced.day60;

public class InsertInterimElementInLinkedList {
    public static void main(String[] args) {
        Node head = LinkedListOperations.insertInLinkedList();
        Node temp;

        temp = insertInterimElement(head, 55, 1);
        while(temp.next != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }

        System.out.println();

        temp = insertInterimElement(head, 62, 3);
        while(temp.next != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }

        System.out.println();

        temp = insertInterimElement(head, 62, 12);
        while(temp.next != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }

    public static Node insertInterimElement(Node head, int x, int pos){

        Node tmp = head;
        Node nn = new Node(x);
        int cnt = 1;

        if(pos == 1){
            nn.next = tmp;
            head = nn;
            return head;
        }else{
            while(tmp.next != null){
                cnt+=1;
                tmp = tmp.next;
                if(cnt == pos-1){
                    nn.next = tmp.next;
                    tmp.next = nn;
                }
            }
        }

        return head;
    }
}
