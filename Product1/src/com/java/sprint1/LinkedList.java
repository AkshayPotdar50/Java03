package com.java.sprint1;

class ListNode{
    int val;
    ListNode next;

    public ListNode(int val) {
        this.val = val;

    }


}

public class LinkedList {
    ListNode head;

    public void deleteNode(int k){
        if(head ==null || k<=0){
            return;
        }
        if(k==1){
            head=head.next;
            return;
        }

        ListNode prev =null;
        ListNode curr=head;
        int count=1;

        while(curr != null && count <k){
            prev =curr;
            curr=curr.next;
            count++;
        }

        if(curr !=null){
            prev.next=curr.next;

        }
    }

    public void printList(){
        ListNode current =head;
        while(current != null){
            System.out.print(current.val +" ");
            current=current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.head = new ListNode(1);
        list.head.next= new ListNode(2);
        list.head.next.next= new ListNode(3);
        list.head.next.next.next= new ListNode(4);
        list.head.next.next.next.next=new ListNode(5);
        System.out.println("original list:");
        list.printList();

        int k=3;
        list.deleteNode(k);
        System.out.println("list after");
        list.printList();

    }




}
