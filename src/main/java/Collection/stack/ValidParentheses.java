package Collection.stack;

import java.util.*;

public class ValidParentheses {
    public static void main(String[] args) {
//        System.out.println(isValid("()[]{}")); //  true
//        System.out.println(isValid("{[([)]}")); // false
//        System.out.println(isValid("{[]}")); // // true
//        System.out.println(isValid("([)]")); // // false

        System.out.println(isValid2("()[]{}")); //  true
        System.out.println(isValid2("{[([)]}")); // false
        System.out.println(isValid2("{[]}")); // // true
        System.out.println(isValid2("([)]")); // // false
    }

    public static boolean isValid(String s) {
        List<Integer> booked = new ArrayList<>();
        Map<Character, Character> valid = new HashMap<>();
        valid.put('(', ')');
        valid.put('{', '}');
        valid.put('[', ']');
        Map<Character, Character> noValid = new HashMap<>();
        noValid.put(')', '!');
        noValid.put('}', '!');
        noValid.put(']', '!');
        char[] aarryaCh = s.toCharArray();
        if (aarryaCh.length < 2 && valid.containsKey(aarryaCh[0])) return false;

        for (int i = 0; i < aarryaCh.length; i++) {
            if (booked.contains(i)) break;
            if (noValid.containsKey(aarryaCh[i])) return false;
            if (valid.containsKey(aarryaCh[i])) {
                for (int j = i + 1; j < aarryaCh.length; j++) { // если вижу открытие
                    if (valid.get(aarryaCh[i]) == aarryaCh[j]){
                        booked.add(j);
                        break;
                    }
                    if (j == aarryaCh.length-1 && j != valid.get(aarryaCh[i])) return false; // -> если так и не нашел
                }
            }
        }
        return true;
    }

    public static boolean isValid2(String s) {
        Stack<Character> stack = new Stack<Character>(); // create an empty stack
        for (char c : s.toCharArray()) { // loop through each character in the string
            if (c == '(') // if the character is an opening parenthesis
                stack.push(')'); // push the corresponding closing parenthesis onto the stack
            else if (c == '{') // if the character is an opening brace
                stack.push('}'); // push the corresponding closing brace onto the stack
            else if (c == '[') // if the character is an opening bracket
                stack.push(']'); // push the corresponding closing bracket onto the stack
            else if (stack.isEmpty() || stack.pop() != c) // if the character is a closing bracket
                // if the stack is empty (i.e., there is no matching opening bracket) or the top of the stack
                // does not match the closing bracket, the string is not valid, so return false
                return false;
        }
        // if the stack is empty, all opening brackets have been matched with their corresponding closing brackets,
        // so the string is valid, otherwise, there are unmatched opening brackets, so return false
        return stack.isEmpty();
    }
}
