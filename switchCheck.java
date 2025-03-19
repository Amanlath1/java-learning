import java.util.Scanner;

public class switchCheck {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);

    int num = keyboard.nextInt();

    switch(num){
      case 1:{
        System.out.println("The value is 1.");
      }
      break;
      case 2:{
        System.out.println("The value is 2.");
      }
      break;
      case 3:{
        System.out.println("The value is 3.");
      }
      break;
      default:{
        System.out.println("The value is more then 3.");
      }
    }
  }
}
