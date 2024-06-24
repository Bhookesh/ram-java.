import java.util.Scanner;

public class Float {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("we are doing float multiplication\n");
    System.out.print("please enter first decimal number: ");
    double first = input.nextDouble();
    System.out.print("Now please enter second number: ");
    double second = input.nextDouble();

    System.out.println("\n Result is: " + (first * second));

  }

}
