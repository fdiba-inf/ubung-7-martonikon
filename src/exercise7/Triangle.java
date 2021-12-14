package exercise7;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        for (int line = 1; line <= n*2; line++) {
          if(line > n) {
            printLine(1, n*2 - line);
          } else {
            printLine(1, line);
          }
        }

    }

    public static void printLine(int start, int end) {
      for(int i = 1; i <= end; i++) {
        if(i == end) {
          System.out.print(i);
        } else {
          System.out.print(i + " ");
        }
      }
      System.out.println();
    }
}