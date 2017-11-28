import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        
        HashMap<String,Integer> counts = new HashMap<String,Integer>();
        for (int i=0; i<n; i++) {
            String word = in.nextLine();
            if (counts.containsKey(word)) {
                counts.put(word,counts.get(word)+1);
            } else {
                counts.put(word,1);
            }
        }
        
        int q = in.nextInt();
        in.nextLine();
        for (int i = 0; i < q; i++) {
            String query = in.nextLine();
            int count = 0;
            if (counts.containsKey(query)) {
                count = counts.get(query);
            }
            System.out.println(count);
        }
        
        System.out.println("");

        in.close();
    }
}
