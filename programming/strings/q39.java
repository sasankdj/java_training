public class q39 {
    public static void main(String[] args) {
        
        String s="hi hi hi hello";
        String arr[]=s.split(" ");
        int max=0,maxc=0;
        String maxWord="";
        char maxchar=' ';
        

        for (int i = 0; i < s.length(); i++) {
            int fc=0;
            for (int j = 0; j <s.length(); j++) {
                if(s.charAt(i)==s.charAt(j)){
                    fc++;
                    if(fc>maxc){
                        maxc=fc;
                        maxchar=s.charAt(i);
                    }
                }
            }
        }
        for (int j=0;j<arr.length;j++) {
            int ir=0;
            
            for (int i = j; i < arr.length; i++) {
                if(arr[i].equals(arr[j]))
                    ir++;
                if(ir>max){
                    max=ir;
                    maxWord=arr[i];
                }

            }
        }
        System.out.println(maxWord+" "+max);
        System.out.println(maxchar+" "+maxc);

    }

}
