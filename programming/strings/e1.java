public class e1 {
    public static void main(String[] args) {
        String s="apple";
        String t="app";
        int c=0;
        while (true) {
            String temp=s;
            boolean flag=true;
            for (int i = 0; i < t.length(); i++) {
                char ch=s.charAt(i);
                int index=t.indexOf(ch);
                if(index==-1){
                    flag=false;
                    break;
                }
                temp=temp.substring(0,index)+temp.substring(index+1);
            }
                if(!flag){
                    break;
                }
                c++;
                s=temp;
        }
        System.out.println(c);
    }
}
