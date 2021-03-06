   /* 
    
    class Node 
       int data;
       Node left;
       Node right;
   */
   void topView(Node root) {
      if (root != null) {
          printLeft(root.left);
          System.out.print(root.data + " ");
          printRight(root.right);
      }
   }

    void printLeft(Node n) {
        if (n != null) {
            printLeft(n.left);
            System.out.print(n.data + " ");
        }
    }

    void printRight(Node n) {
        if (n != null) {
            System.out.print(n.data + " ");
            printRight(n.right);
        }
    }
