public class UC2 {
    static void main() {
        String s = "madam";
        String rev = "";
        for(int i = s.length()-1; i>=0 ; i-- ){
            rev += s.charAt(i);
        }
        if(s.equals(rev)) System.out.println(s + " is a palindrome");
        else System.out.println(s + " is a palindrome");
    }
}
