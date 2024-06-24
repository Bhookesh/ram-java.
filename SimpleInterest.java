package challenge;

import java.util.Scanner;

public class SimpleInterest {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("welcome to Simple Interest Calculator\n");
    System.out.print("Plese enter your principle amount Rs");
    int principle = input.nextInt();
    System.out.print("Now, tall me your rete of interest: ");
    float rete = input.nextFloat();
    System.out.print("Now, tell me for how many years are you borrowing this years: ");
    float years = input.nextFloat();

    float interest = (principle * rete * years) / 100;
    System.out.println("\n\n Your Simple interest is Rs:" + interest);
  }

}
