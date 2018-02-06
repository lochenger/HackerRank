import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int K = in.nextInt();
        
        PriorityQueue<Integer> cookies = new PriorityQueue<Integer>();
        while (N>0) {
            cookies.add(in.nextInt());
            N--;
        }
        
        int ops = 0;
        while (cookies.peek() < K && cookies.size() > 1) {
            int cookie = cookies.poll();
            cookie = cookie + 2*cookies.poll();
            ops++;
            cookies.add(cookie);
        }
        
        if (cookies.peek() < K) System.out.println(-1);
        else System.out.println(ops);
        //System.out.println(Arrays.toString(cookies.toArray()));
    }
}
