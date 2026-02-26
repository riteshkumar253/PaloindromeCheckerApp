
    import java.util.Stack;
    public class UC5 {
        public static boolean abc(String str) {

            Stack<Character> stack = new Stack<>();

            for (int i = 0; i < str.length(); i++) {
                stack.push(str.charAt(i));
            }

            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) != stack.pop()) {
                    return false;
                }
            }

            return true;
        }

        public static void main(String[] args) {

            String word = "level";

            if (abc(word)) {
                System.out.println(word + " is a Palindrome.");
            } else {
                System.out.println(word + " is NOT a Palindrome.");
            }
        }
    }

