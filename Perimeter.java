package challenge;

import java.util.Scanner;
import java.util.jar.Manifest;

public class Perimeter {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("welcome to perimeter Calculator");
    System.out.print("plese enter all 4 side in cms: ");
    double a = input.nextDouble();
    double b = input.nextDouble();
    double c = input.nextDouble();
    double d = input.nextDouble();

    double perimeter = a + b + c + d;
    System.out.println("Perimeter of your rectangle is: " + perimeter);

  }

}
