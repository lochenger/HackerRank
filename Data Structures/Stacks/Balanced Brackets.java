import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static String isBalanced(String s) {
        Stack<Character> left = new Stack<>();
        for (Character c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                left.push(c);
            } else {
                switch (c) {
                    case ')':
                        if (left.size() == 0 || left.pop() != '(') {
                            return "NO";
                        }
                        break;
                    case '}':
                        if (left.size() == 0 || left.pop() != '{') {
                            return "NO";
                        }
                        break;
                    case ']':
                        if (left.size() == 0 || left.pop() != '[') {
                            return "NO";
                        }
                        break;
                    default:
                        return "NO";
                }
            }
        }
        if (left.size() != 0) {
            return "NO";
        } else {
            return "YES";
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            String s = in.next();
            String result = isBalanced(s);
            System.out.println(result);
        }
        in.close();
    }
}
