import java.util.Scanner;

public class next_prime {
    static boolean isPrime(int n) {
        int fc = 0;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                fc++;
            }
        }
        if (fc == 0 && n > 1) {
            return true;
        } else
            return false;
    }

    static int nextPrime(int n) {
        // if(n<0){
        //     return -1;
        // }
        for (int i = n + 1;; i++) {
            if (isPrime(i)) {
                return i;

            }
        }
    }

    static int previousPrime(int n) {
        if (n == 0 || n == 1 || n == 2) {
            return -1;
        }
        for (int i = n - 1;; i--) {
            if (isPrime(i))
                return i;
        }
    }

    static int nearestPrime(int n) {
        if(n<=1){
            return 2;
        }
        if (n - previousPrime(n) < nextPrime(n) - n) {

            return previousPrime(n);
        } else if (n - previousPrime(n) > nextPrime(n) - n) {
            return nextPrime(n);
        } else{

            System.out.println(nextPrime(n));
            return previousPrime(n);
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // System.out.println(nextPrime(23));
        int n=sc.nextInt();
        if (previousPrime(n) == -1) {
            System.out.print("Invalid Input");
        }
        else{
            System.out.println(previousPrime(n));
        }

        System.out.println(nearestPrime(n));

    }
}
