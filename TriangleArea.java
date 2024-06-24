package challenge;

import java.util.Scanner;

public class TriangleArea {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("welcome to Area calculator\n");
    System.out.print("plese enter your base in cms: ");
    double base = input.nextDouble();
    System.out.print("now, enter your perpendicular height in cmd: ");
    double height = input.nextDouble();

    double area = (base * height) / 2;

    System.out.println("The area of your trianhle is : " + args + "cms2");
  }

}
