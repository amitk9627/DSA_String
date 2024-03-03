import java.util.*;
public class ReverseString {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
       String str = sc.nextLine();
//             String res="";
//       O(n)
//        for(int i=0;i<str.length();i++){
//            res=str.charAt(i)+res;
//        }
//        System.out.print(res);
//        O(n/2)
//        char [] strArray= str.toCharArray();
//        int s=0,e=str.length()-1;
//        while(s<=e){
//            char ch= strArray[s];
//            strArray[s]=strArray[e];
//            strArray[e]=ch;
//            s++;
//            e--;
//        }
//        String newStr = new String(strArray);
//        System.out.print(newStr);
        Stack <Character> st=new Stack<Character>();
        for (char c : str.toCharArray()) {
            st.push(c);
        }
        String res="";
        while(!st.isEmpty()){
            res+=st.pop();
        }
        System.out.print(res);
        sc.close();
    }
}