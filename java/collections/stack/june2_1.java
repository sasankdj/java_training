import java.util.Stack;

public class june2_1 {
    public static void main(String[] args) {
        Stack<Integer> st= new Stack<>();
        for (int i = 0; i <10; i++) {
            st.push(i);
        }
        // for (Integer integer : st) {
        //     System.out.println(integer);
        // }
        // for (int i = 0; i <st.size(); i++) {
        //     System.out.print(st.peek()+" ");
        // }
        // while (!st.empty()) {
        //     System.out.print(st.pop()+" ");
        // }
        System.out.println(st.search(9));
        
    }
    
}