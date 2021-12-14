package exercise7;

import java.util.Scanner;

public class RecursivePrimePrinter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = input.nextInt();

        printPrimes(n);
    }

    public static void printPrimes(int n) {
        for(int i = n; i > 0; i--) {
          if(isPrime(i)) {
            System.out.println(i);
          }
        }
    }

    public static boolean isPrime(int n) {
      if(n == 1) return true;
      int br = 0;
      for(int i = 1; i <= n; i++) {
        if(n%i==0) {
          br++;
        } 
      }
      return br==2;
    }
}