/* Hidden stub code will pass a root argument to the function below. Complete the function to solve the challenge. Hint: you may want to write one or more helper functions.  

The Node class is defined as follows:
    class Node {
        int data;
        Node left;
        Node right;
     }
*/
    boolean checkBST(Node root) {
        return checkBST(root, 0, 10000);
    }

    boolean checkBST(Node n, int min, int max) {
        if (n == null) {
            return true;
        } else if (n.data < min || n.data > max) {
            return false;
        } else {
            return checkBST(n.left, min, n.data - 1) && checkBST(n.right, n.data + 1, max);
        }
    }
