public class Swap {
  public static void main(String[] args) {
    scanner input = new scanner(System.in);
    System.out.println("welcome to swapping station\n\n");
    System.out.print("Enter value of A: ");
    int a = input.nextInt();
    System.out.print("Enter value of B: ");
    int b = input.nextInt();

    int c = a;
    a = b;
    b = c;

    System.out.println("swapping done...");
    System.out.println("value of A is:" + a);
    System.out.println("value of B is:" + b);
  }
}
