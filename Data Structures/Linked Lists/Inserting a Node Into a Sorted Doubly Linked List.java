/*
  Insert Node at the end of a linked list 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
     Node prev;
  }
*/

Node SortedInsert(Node head,int data) {
    Node n = new Node();
    n.data = data;
    
    if (head == null) {
        return n;
    } else if (data < head.data) {
        n.next = head;
        head.prev = n;
        return n;
    } else {
        Node n1 = null;
        Node n2 = head;
        while (n2 != null && n2.data < data) {
            n1 = n2;
            n2 = n2.next;
        }
        
        if (n2 == null) {
            n1.next = n;
            n.prev = n1;
        } else {
            n1.next = n;
            n2.prev = n;
            n.prev = n1;
            n.next = n2;
        }
        return head;
    }
}
