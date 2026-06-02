// import java.util.Arrays;

// public class c2 {
//     public static void main(String[] args) {
//         int arr[]= {1,2,3};
//         // for (int j= 0; j< 1;j++) {
            
//             int e=arr[0];
//             for (int i =1;i<arr.length-1;i++) {
//                 arr[i]=arr[i+1];
//             }
//             arr[arr.length-1]=e;
//         // }
//       System.out.println(Arrays.toString(arr));  
//     }
// }

// public class c2 {

//     public static void main(String[] args) {
//         String s="sasank";
//         int c1=0;
//         for (int i = 0; i < s.length(); i++) {
//             char c = s.charAt(i);
//             if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){
//                 c1++;
//                 if(c1%2==1){

//                     System.out.println(s.charAt(i));
//                 }
//             }
//         }
//     }
// }

// import java.util.Arrays;

// public class c2 {

//     public static void main(String[] args) {
//         String s= "sri latha";
//         String arr[]= s.split("\\s");
//         // System.out.println(Arrays.toString(arr));
//         for (int i = 0; i < arr.length; i++) {
//             int fc=0;
//             for (int j = 0; j < arr.length; j++) {
//                 if(arr[i].equals(arr[j])){
//                     fc++;
//                 }
//             }
//         }
//     }
// }

import java.util.Arrays;

public class c2 {

    public static void main(String[] args) {
    //    String s="sasank";
    //    String s1="sas";
    //    s.contains(s1);
    //    for (int i = 0; i <s.length(); i++) {
    //     for (int j = i; j < s.length(); j++) {
    //         s.substring(i,j);
    //     }
    //    }
    // //    System.out.println(s.substring(0,4));

    String s="na peru sasank andi";
    s=s.replaceAll("\\s", "");
    // String arr[]=s.split(" ");
    char arr[]= s.toCharArray();
    // for (int i = 0; i < arr.length; i++) {
    //     for (int j = i+1; j < arr.length; j++) {
    //             if(arr[i].length()<arr[j].length()){
    //                 String temp=arr[i];
    //                 arr[i]=arr[j];
    //                 arr[j]=temp;
    //             }
    //     }
    // }
    Arrays.sort(arr);
    System.out.println(Arrays.toString(arr));
    }
}