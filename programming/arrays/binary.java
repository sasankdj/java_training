import java.util.Arrays;

public class binary{
    public static void main(String[] args) {
        int arr[]={5,4,8,0};
        Arrays.sort(arr);
        int key=0;
        int l=0,r=arr.length-1;
        while (l<=r) {
            int mid=(l+r)/2;
            if(arr[mid]==key){
                System.out.println(arr[mid]);
                return;
            }
            else if(key<arr[mid])
                r=mid-1;
            else 
                l=mid+1;
        }
        System.out.println("not found");
    }
}