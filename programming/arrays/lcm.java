public class lcm{
    static int highest(int arr[]){
        int h=Integer.MIN_VALUE;
        for(int a:arr){
            if(a>h)
                h=a;
        }
        return h;
    }
    public static void main(String[] args) {
        int[] arr ={10,20,5,30};
        int h=highest(arr);
        for(int i=h;;i+=h){
            int c=0;
            for(int j=0;j<arr.length;j++){
                if(i%arr[j]==0){
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