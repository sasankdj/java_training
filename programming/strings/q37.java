public class q37 {
    public static void main(String[] args) {
        
        String s="hi hi hi hello";
        String arr[]=s.split(" ");

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
            if(fc==ir)
            System.out.println(arr[j]+"  "+ir);
        }
    }

}
