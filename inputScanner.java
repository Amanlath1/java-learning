import java.util.Scanner;

public class inputScanner {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);

    int age = keyboard.nextInt();

    System.out.println("Your age is: " + age);
  }
}
