/*
  Merge two linked lists 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/

Node mergeLists(Node headA, Node headB) {
    if (headA == null) return headB;
    if (headB == null) return headA;
    
    if (headA.data <= headB.data) {
        headA.next = mergeLists(headA.next, headB);
        return headA;
    } else {
        headB.next = mergeLists(headA, headB.next);
        return headB;
    }
}
