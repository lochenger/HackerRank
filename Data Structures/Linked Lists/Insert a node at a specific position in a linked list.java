/*
  Insert Node at a given position in a linked list 
  head can be NULL 
  First element in the linked list is at position 0
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/

Node InsertNth(Node head, int data, int position) {
    Node n = new Node();
    n.data = data;
    
    if (position == 0) {
        n.next = head;
        return n;
    } else {
        Node curr = head;
        for (int i=0; i < position-1; i++) {
            curr = curr.next;
        }
        
        n.next = curr.next;
        curr.next = n;
        
        return head;
    }
}
