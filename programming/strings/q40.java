

public class q40 {
    public static void main(String[] args) {
        
        String s="hi hi hi hello";
        String arr[]=s.split(" ");
        String words[]=new String[arr.length];
        int count[]=new int[arr.length];


        for (int j=0;j<arr.length;j++) {
            int fc=0,ir=0;
            for (int i = 0; i < arr.length; i++) {
                if(arr[i].equals(arr[j]))
                    fc++;

            }
            for (int i = j; i < arr.length; i++) {
                if(arr[i].equals(arr[j]))
                    ir++;

            }
            if(fc==ir){
                words[j]=arr[j];
                count[j]=ir;
            }

            
        }
        for (int i = 0; i < count.length; i++) {
            for (int j = i+1; j < count.length; j++) {
                if(count[i]<count[j]){
                    int temp=count[j];
                    count[j]=count[i];
                    count[i]=temp;

                    String t=words[j];
                    words[j]=words[i];
                    words[i]=t;
                }
            }
        }

        for (int i=0;i<words.length;i++) {
            if(words[i]!=null){
                System.out.println(words[i]+"  "+count[i]);
            }
        }
    }

}
