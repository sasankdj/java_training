public class extra1 {
    public static void main(String[] args) {
        String s="appleappap ";
        String ta="app";
        int c=0;
        while(true) {
            String temp=s;
            boolean found=true;
            for (int j = 0; j < ta.length(); j++) {
                char ch=ta.charAt(j);
                int index=temp.indexOf(ch);
                if(index==-1){
                    found=false;
                    break;
                }
                temp = temp.substring(0, index) + temp.substring(index + 1);
            }
                if(!found){
                    break;

                }
                c++;
                s=temp;
            }
            System.out.println(c);
    }
}
