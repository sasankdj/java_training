
public class m1 {
     void dummy(){
            System.out.println("hi andi");
        }
    public static void main(String[] args) {
       m1 obj = null;
    //    Integer.parseInt(null)n
       try {
        obj.dummy();
        System.out.println(2/0);
        int arr[] = new int[2];
        System.out.println(arr[3]);
        Integer.parseInt("saasnk");
       } 
       catch (NullPointerException e) {
        System.out.println(e);
       }
       catch(NumberFormatException e){
        System.out.println(e);
       }
       catch(IndexOutOfBoundsException e){
        System.out.println(e);
       }
    }
}
