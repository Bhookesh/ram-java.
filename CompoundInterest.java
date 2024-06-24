package challenge;

import java.util.Scanner;

public class CompoundInterest {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("welcome to Compound interest calculator\n");
    System.out.print("Plese enter your principle amount Rs");
    int principle = input.nextInt();
    System.out.print("Now, tall me your rete of interest: ");
    float rete = input.nextFloat();
    System.out.print("Now, tell me for how many years are you borrowing this years: ");
    float years = input.nextFloat();

    double compInt = principle * Math.pow((1 + rete / 100), years);
    System.out.println("Your compound interest is Rs:" + compInt);

  }

}
