package challenge;

import java.util.Scanner;

public class FahrenheitToCelsius {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("welcome to Temperature converter");
    System.out.print("Enter your temp in F: ");
    float fah = input.nextFloat();
    float cel = (fah - 32) * 5 / 9;
    System.out.println("Your temperatue is: " + cel + "C");
  }

}
