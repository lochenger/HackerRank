 /* Node is defined as :
 class Node 
    int data;
    Node left;
    Node right;
  */

    static Node lca(Node root,int v1,int v2) {
        Node n = root;
        while (n != null) {
            if (n.data > v1 && n.data > v2) {
                n = n.left;
            } else if (n.data < v1 && n.data < v2) {
                n = n.right;
            } else {
                break;
            }
        }
        return n;
    }




