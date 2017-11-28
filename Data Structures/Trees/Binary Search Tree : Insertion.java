 /* Node is defined as :
 class Node 
    int data;
    Node left;
    Node right;
  */

    static Node Insert(Node root,int value) {
        Node n = new Node();
        n.data = value;
        
        if (root == null) {
            return n;
        }
        
        if (root.data > value) {
            root.left = Insert(root.left, value);
        } else {
            root.right = Insert(root.right, value);
        }
        
        return root;
    }


