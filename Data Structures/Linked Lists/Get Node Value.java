/*
  Get Nth element from the end in a linked list of integers
  Number of elements in the list will always be greater than N.
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
    
int GetNode(Node head,int n) {
    Node tail = head;
    
    while (tail.next != null) {
        if (n>0) {
            tail = tail.next;
            n--;
        }
        if (tail.next == null) return head.data;
        tail = tail.next;
        head = head.next;
    }
    
    return head.data;
}
