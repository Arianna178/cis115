import java.util.Scanner;

public class Main {

  public static void greetUser() {
    // ask for user name
    //say hi to them by mane
    System.out.println("TODO: greet the user");
    Scanner keyboard = new Scanner (System.in);

    System.out.println("What'syour name?");

    String name;
    name = keyboard.nextLine();
    System.out.println("Hello, " + name);

  }

  public static void doubleNumber() {
    // ask for number
    //double it
    // print that out
    System.out.println("TODO: double a number");
  }

  public static void takeTenPercent() {
    //ask for a number
    // find out 10% of that number
    //ptint that value out
    System.out.println("TODO: take ten percent");
  }

  public static void main(String[] args) {
    // this program is an ATM Simulator
    // you can add money, withdraw, and check your balance
    System.out.println("Welcome to the Menu");
    System.out.println("--------------------");
    System.out.println("1. Greetings");
    System.out.println("2. Double the number");
    System.out.println("3. Take 10%");
    System.out.println("4. Gross Pay");
    System.out.println("5.End Program");

    // ask user to input menuChoice
    Scanner keyboard = new Scanner(System.in);
    int menuChoice = keyboard.nextInt();

    if (menuChoice == 1) 
    {
      greetUser();
    }
    else if (menuChoice == 2)
    {
      doubleNumber();
    }
    else if (menuChoice == 3) 
    {
      takeTenPercent();
    }


    else if  (menuChoice == 4)
    {
      //grossPay();

    }
    else if (menuChoice == 5)
    {
      System.out.println("TODO: End Program");
    }
    
    

  }//Main

}//class

  
