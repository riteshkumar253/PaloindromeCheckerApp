import java.util.ArrayList;
import java.util.Scanner;

public class printpalidromeresult {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a word");
        String s = sc.nextLine();
        ArrayList<Character> list = new ArrayList<>();
        for(int i = 0; i<s.length();i++){
            list.add(s.charAt(i));
        }
        int start = 0;
        int end = s.length()-1;
        boolean ispalidrome = true;
        while(start<end){
            if(list.get(start)!=list.get(end)){
                ispalidrome = false;
                break;

            }
            start++;
            end--;
        }
        if(ispalidrome){
            System.out.println(s + " is a palindrome");
        }
        else System.out.println(s + "is not palindrome");
    }



}
