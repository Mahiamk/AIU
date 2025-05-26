import java.util.Scanner;

public class LAB3{
  public static void main(String[] args){
    System.out.println(
      /** Also, include the same statement in three different comments in the program; 
        each comment should use one of the three different methods of including comments 
        in a Java program. */
    );
    additionNumbers();
    Concatination();
    oddEven();
    addInt();
  }
  public static void additionNumbers(){
     float a=5;
     float b=10;
     float c=a+b;
      System.out.println("The sum of " + a + " and " + b + " is: " + c);
  }
  public static void Concatination(){
    String firstName="Anwar";
    String middleName="Mohammed";
    String lastName="Koji";
    String fullName=firstName + " " + middleName + " " + lastName;
    System.out.println(fullName);
  }
  public static void oddEven(){
    Scanner sc = new Scanner(System.in);
    try {
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        if(num % 2 == 0){
          System.out.println(num + " is even");
        }
        else{
          System.out.println(num + " is odd");
        }
    } finally {
        sc.close();
    }
  }
  public static void addInt(){
    int a=7;
    int b=8;
    int c=a+b;
    String result = String.valueOf(c);
    System.out.println(result);
  }
}