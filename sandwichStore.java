import java.util.Scanner;

public class sandwichStore {

  static String[] ingredients;
  static boolean sandwichReady;
  
  public static void gatherIngrediants(){
    ingredients = new String[4];
    ingredients[0] = "Bread";
    ingredients[1] = "Chicken Slices";
    ingredients[2] = "Cheese Slices";
    ingredients[3] = "Lettuce";
    System.out.println("All ingredients are collected.");
  }

  public static void assembleSandwich(){
    if(ingredients.length == 4){
      if(ingredients[0].equals("Bread") && ingredients[1].equals("Chicken Slices") && ingredients[2].equals("Cheese Slices") && ingredients[3].equals("Lettuce")){
        System.out.println("Assembling the sandwich.....");
        sandwichReady = true;
      }
    }
    else{
      System.out.println("Oops! missing required ingredients.");
      sandwichReady = false;
    }
  }

  public static void serveSandwich(){
    if(sandwichReady == true){
      System.out.println("Serving the Sandwich.");
    }
    else{
      System.out.println("It's taking some time, please wait!");
    }
  }
  
  public static void main(String[] args) {

    System.out.println("Welcome to the store.");
    gatherIngrediants();
    assembleSandwich();
    serveSandwich();
  }
}
