import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Node {
    int data;
    int depth;
    Node left, right;
    Node(int data, int depth) {
        this.data = data;
        this.depth = depth;
    }
}

public class Solution {
    private static void swapNodes(Node root, int K) {
        if (root != null) {
            if (root.depth % K == 0) {
                Node temp = root.left;
                root.left = root.right;
                root.right = temp;
            }
            swapNodes(root.left, K);
            swapNodes(root.right, K);
        }
    }
    
    private static void inOrder(Node root) {
        if (root != null) {
            inOrder(root.left);
            System.out.print(root.data + " ");
            inOrder(root.right);
        }
    }
    
    private static void printNodes(Node root, int K) {
        swapNodes(root, K);
        inOrder(root);
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        
        Node root = new Node(1,1);
        Node curr = root;
        Queue<Node> nodes = new LinkedList<Node>();
        nodes.offer(curr);
        
        while (N-- > 0) {
            curr = nodes.poll();
            int left = in.nextInt();
            int right = in.nextInt();
            curr.left = (left == -1) ? null : new Node(left, curr.depth+1);
            curr.right = (right == -1) ? null : new Node(right, curr.depth+1);
            
            if (curr.left != null && curr.left.data != -1)
                nodes.offer(curr.left);
            if (curr.right != null && curr.right.data != -1)
                nodes.offer(curr.right);
        }
        
        int T = in.nextInt();
        while (T-- > 0) {
            int K = in.nextInt();
            printNodes(root, K);
        }
        
        in.close();
    }
}
