import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    static PriorityQueue<Integer> lower = new PriorityQueue<>(new Comparator<Integer>() {
        @Override
        public int compare(Integer o1, Integer o2) {
            return o2-o1;
        }
    });
    static PriorityQueue<Integer> upper = new PriorityQueue<>();
    
    public static void add(int i) {
        if (lower.peek() == null) {
            lower.add(i);
        } else if (upper.peek() == null) {
            if (i > lower.peek()) {
                upper.add(i);
            } else {
                upper.add(lower.poll());
                lower.add(i);
            }
        } else {
            if (i < lower.peek()) {
                lower.add(i);
            } else if (i > upper.peek()) {
                upper.add(i);
            } else {
                if (lower.size() > upper.size()) upper.add(i);
                else lower.add(i);
            }
            while (lower.size() > upper.size()) upper.add(lower.poll());
            while (lower.size() < upper.size()) lower.add(upper.poll());
        }
    }
    
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        
        for (int i=0; i<n; i++) {
            add(in.nextInt());
                
            if (lower.size() == upper.size()) {
                System.out.println((double)(lower.peek()+upper.peek())/2);
            } else if (lower.size() > upper.size()) {
                System.out.println((double)lower.peek());
            } else {
                System.out.println((double)upper.peek());
            }
        }
        
        in.close();
    }
}
