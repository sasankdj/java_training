import java.util.Stack;
public class validparenthesis {
    static boolean valid(String s){
         Stack<Character> st  = new Stack<>();
            boolean flag= false;
            for (int i = 0; i < s.length(); i++) {
                char ch= s.charAt(i);
    
                if(ch=='{' || ch=='(' || ch=='['){
                    st.push(ch);
                }
                else{
                    if(st.isEmpty())
                        return false;
                        char top = st.pop();
                        if((ch=='(' && top!=')' )||(ch=='[' && top!=']') || (ch=='{' && top!='}') ){
                            return false;
                        }
                }
            }
            return st.isEmpty();
    }
    public static void main(String[] args) {
        // String s="(([])){}";
        String s=")(";
      System.out.println(valid(s));
       
           
    }
}
