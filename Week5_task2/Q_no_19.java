// Create a method that accepts a character and returns its ASCII value

import java.util.Scanner;

public class Q_no_19 {
      public static void printAsciiTable() {
        for (int i = 0; i < 128; i++) {
            System.out.println(i + " : " + (char) i);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);
        int asciiValue = (int) ch;
        System.out.println("ASCII value of " + ch + " is: " + asciiValue);
        sc.close();
    }
}
