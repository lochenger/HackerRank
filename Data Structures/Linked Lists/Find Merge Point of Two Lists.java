/*
  Find merge point of two linked lists
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
int FindMergeNode(Node headA, Node headB) {
    while (headA != null) {
        Node temp = headA;
        headA = headA.next;
        temp.next = null;
    }
    
    while (headB.next != null) {
        headB = headB.next;
    }
    
    return headB.data;
}
