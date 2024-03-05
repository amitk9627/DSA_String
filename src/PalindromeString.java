import java.util.*;
public class PalindromeString {
    public static void main (String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
      Solution res =new Solution();
     System.out.print(res.isPalindrome(str));
    }

}
class Solution{
    boolean isPalindrome(String str) {
        int s=0,e=str.length()-1;
        while(s<=e){
            if(str.charAt(s)!=str.charAt(e)){
                return false;
            }
            s++;e--;
        }

        return true;
    }

}