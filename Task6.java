package aspire.internship;

import java.util.ArrayDeque;
import java.util.Deque;

public class Task6 {
    public static void main(String[] args) {
        String expr1 = "))((", expr2 = "((((((", expr3 = ")()", expr4= "(())", expr5 = ")(()";

        System.out.println("isValid(expr5) = " + isValid(expr4));
    }
    public static boolean isValid(String expression) {
        Deque<Character> deque = new ArrayDeque<>();
        int count = 0;
        for (char c : expression.toCharArray()) {
            if (c == '(') {
                deque.push(c);
                count++;
            }else if (c == ')') {
                if (deque.isEmpty() || count<=0) {
                    return false;
                }
                count--;
                deque.poll();
            }
    }
        return count == 0 && deque.isEmpty();
    }
}