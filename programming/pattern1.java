public class pattern1{
    static void pattern(int n){
         for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                if(j%4==1 || j%4==2)
                    System.out.print("*");
                else 
                    System.out.print(" ");
            }
            for(int j=i;j>=1;j--){
                if(j%4==1 || j%4==2)
                    System.out.print("*");
                else 
                    System.out.print(" ");
            }
            
            System.out.println();
        }


        for(int i=n;i>=1;i--){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                if(j%4==1 || j%4==2)
                    System.out.print("*");
                else 
                    System.out.print(" ");
            }
            for(int j=i;j>=1;j--){
                if(j%4==1 || j%4==2)
                    System.out.print("*");
                else 
                    System.out.print(" ");
            }
            
            System.out.println();
        }
    }
public static void main(String []args){
pattern(7);
}
}