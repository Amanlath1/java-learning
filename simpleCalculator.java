import java.util.Scanner;

public class simpleCalculator {
  public static void main(String[] args) {

    System.out.println("Welcome to the calculator.");
    System.out.println("1. Addition");
    System.out.println("2. Substraction");
    System.out.println("3. Multiplication");
    System.out.println("4. Division");
    System.out.println("Enter the value in front of the operation that you want to perform: \n");
    Scanner keyboard = new Scanner(System.in);

    int choice = keyboard.nextInt();
    System.out.println("Enter the value of first number: ");
    double num1 = keyboard.nextDouble();
    System.out.println("Enter the value of second number: ");
    double num2 = keyboard.nextDouble();

    switch(choice){
      case 1:{
        System.out.println(num1 + num2);
      }
      break;
      case 2:{
        System.out.println(num1 - num2);
      }
      break;
      case 3:{
        System.out.println(num1 * num2);
      }
      case 4:{
        System.out.println(num1 / num2);
      }
      break;
      default:{
        System.out.println("Enter the value of valid operation(i.e. 1 for addition\n2 for substraction\n3 for multiplycation\n4 for division");
      }
    }
  }
}
