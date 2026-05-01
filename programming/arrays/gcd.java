public class gcd{
    static int lowest(int arr[]){
        int h=Integer.MAX_VALUE;
        for(int a:arr){
            if(a<h)
                h=a;
        }
        return h;
    }
    public static void main(String[] args) {
        int[] arr ={10,20,5,30};
        int h=lowest(arr);
        for(int i=h;;i--){
            int c=0;
            for(int j=0;j<arr.length;j++){
                if(arr[j]%i==0){
                    c++;
                }
            }
            if(c==arr.length){
                System.out.println(i);
                return;
            }
        }

    }
}