package test;

import java.util.Scanner;

import numbers.primary.*;
// import numbers.secondary.palindrome;
import numbers.secondary.*;
public class test {
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a number");
        int n= sc.nextInt();
        prime obj = new prime();
        palindrome obj2 = new palindrome();
        System.out.println(obj.prime(n));
        System.out.println(obj2.ispalindrome(n));

    }
    
}
