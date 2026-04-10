package numbers.secondary;

public class palindrome {
    // int count(int n){
    //     int c=0;
    //     while(n>=0){

    //         n/=10;
    //         c++;
    //     }
    //     return c;
    // }
    public String ispalindrome(int n){
        int rev=0,temp=n;
        while (n>0) {
            rev=rev*10+n%10;
            n/=10;

        }
        if(temp==rev){
            return "palindrome";
        }
        else
            return "not palindrome"; 
    }
}
