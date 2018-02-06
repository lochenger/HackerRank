import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        PriorityQueue heap = new PriorityQueue();
        
        int queries = in.nextInt();
        while (queries != 0) {
            int a = in.nextInt();
            
            if (a==1) {
                heap.add(in.nextInt());
            } else if (a==2) {
                heap.remove(in.nextInt());
            } else {
                System.out.println(heap.peek());
            }
            
            queries--;
        }
    }
}
