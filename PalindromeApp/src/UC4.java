public class UC4{
    static void main() {
        String s = "level";
        String re = "";
        for(int i = s.length()-1;i>=0;i--){
            re+=s.charAt(i);
        }
        if(s.equals(re)) System.out.println(s + " is a palindrome");
        else System.out.println(s + " is not a palindrome");
    }
}
