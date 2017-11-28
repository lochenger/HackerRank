import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long[] sums = new long[n];
        
        int m = in.nextInt();
        for(int a0 = 0; a0 < m; a0++){
            int a = in.nextInt();
            int b = in.nextInt();
            long k = in.nextInt();
            
            sums[a-1] += k;
            if (b<n) sums[b] -= k;
        }
        
        long maxSum = 0, temp = 0;
        for (long i : sums) { // 1<=a
            temp += i;
            maxSum = Math.max(temp,maxSum);
        }
        
        System.out.println(maxSum);
        in.close();
    }
}
