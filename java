import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    


    // example 1
    // double the number

    // variable to store number
  Scanner keyboard = new Scanner(System.in);
    // variable to store number
    int number;
    //ask the user for the number
    System.out.println("Please enter the number");
    number = keyboard.nextInt();

    // do the math
    number = number * 2;

    // print the output
    System.out.println("The answer is:");
    System.out.println(number);
    

    //example 2
    //take 10 percent
    double num; 
    // double tenpercent = 10.0 / 100.0;
    double tenPercent= 0.10; // 10%

    System.out.println("Enter a number to take 10% of");
    num = keyboard.nextInt();
    num = num * tenPercent;
    System.out.println("10% is: " + num);

    //greet by name
    String name;
    System.out.println("Hi, I'm a Java program");
    System.out.println("What's your name?");
    name = keyboard.next();
    System.out.println("Nice to meet you, " + name);

  Scanner keyboard = new Scanner(System.in);

    // gross pay
    // get the hours worked
    double hoursWorked = 0;
    // get the hourly salary 
    double salaryPerHour = 0;
    // multiply them together to get gross pay

    double grossPay = hoursWorked * salaryPerHour;
    System.out.println("your gross pay this week is: ");
    System.out.println(grossPay); 

  }
}
