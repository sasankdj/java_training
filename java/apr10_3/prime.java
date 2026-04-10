package numbers.primary;

public class prime {
    boolean isPrime(int n){
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if(n%i==0){
                return false;
            }
        }
        return n>1;
    } 
    public String prime(int n){
        if(isPrime(n)){
            return "prime";
        }
        else
            return "not prime";
    }
}
