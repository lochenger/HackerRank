   /* 
    class Node 
       int data;
       Node left;
       Node right;
   */

   void levelOrder(Node root) {
       LinkedList<Node> deq = new LinkedList<Node>();
       if (root != null) {
           deq.add(root);
       }
       
       while (!deq.isEmpty()) {
           Node n = deq.remove();
           System.out.print(n.data + " ");
           if (n.left != null) {
               deq.add(n.left);
           }
           if (n.right != null) {
               deq.add(n.right);
           }
       }
    }
