package challenge;

import java.util.Scanner;

public class OddEven {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("welcome to odd even calcuator\n");
    System.out.print("please enter your number: ");
    int num = input.nextInt();

    if (num % 2 == 0) {
      System.out.println("your number is an even number");

    } else {
      System.out.println("your number is a odd number.");
    }
  }
}
