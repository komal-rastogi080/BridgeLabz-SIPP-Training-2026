package Algorithms.Stacks;
import java.util.*;

class BalancedBrackets {
    public boolean isValidConfig(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        Map<Character, Character> matchFor = Map.of(
                ')', '(',
                ']', '[',
                '}', '{');

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else {
                if (stack.isEmpty() || stack.pop() != matchFor.get(c))
                    return false;
            }
        }
        return stack.isEmpty();
    }
}
