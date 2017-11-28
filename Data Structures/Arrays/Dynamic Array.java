import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int Q = in.nextInt();
        int lastAnswer = 0;
        
        ArrayList<ArrayList<Integer>> lists = new ArrayList<>();
        for (int i=0; i<N; i++) {
            lists.add(new ArrayList<Integer>());
        }
        
        for (int i=0; i<Q; i++) {
            int q = in.nextInt();
            int x = in.nextInt();
            int y = in.nextInt();
            ArrayList<Integer> seq = lists.get((x^lastAnswer) % N);
            if (q == 1) {
                seq.add(y);
            } else if (q == 2) {
                lastAnswer = seq.get(y % seq.size());
                System.out.println(lastAnswer);
            }
        }
        
        in.close();
    }
}
