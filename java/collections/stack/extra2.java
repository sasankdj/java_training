import java.util.Stack;

public class extra2 {
    public static void main(String[] args) {
        String arr[] = { "10", "20", "5", "+", "-", "8", "*", "15", "/" };
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            if (s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/")) {
                int b = st.pop();
                int a = st.pop();
                switch (s) {
                    case "+":
                        st.push(a + b);
                        break;
                    case "-":
                        st.push(a - b);
                        break;
                    case "*":
                        st.push(a * b);
                        break;
                    case "/":
                        st.push(a / b);
                        break;

                }
            }
            else{
                st.push(Integer.parseInt(s));
            }

        }
       
        System.out.println(st.peek());
    }
}
