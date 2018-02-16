import java.io.*;
import java.util.*;

public class Solution {

    public static class Node {
        int elem;
        int max;
        
        public Node(int elem, int max) {
            this.elem = elem;
            this.max = max;
        }
    }
    
    public static void main(String[] args) {
        Stack<Node> elems = new Stack<>();
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int max = Integer.MIN_VALUE;
        
        while (N-- > 0) {
            int q = in.nextInt();
            switch (q) {
                case 1:
                    int n = in.nextInt();
                    max = Math.max(max, n);
                    elems.push(new Node(n,max));
                    break;
                case 2:
                    Node curr = elems.pop();
                    if (elems.size() == 0) {
                        max = Integer.MIN_VALUE;
                    } else {
                        max = elems.peek().max;
                    }
                    break;
                case 3:
                    System.out.println(elems.peek().max);
                    break;
            }
        }
    }
}
