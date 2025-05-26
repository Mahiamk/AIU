import java.util.Scanner;
public class eo {
  public static void main(String[] args){
    eo number = new eo();
    System.out.println("Enter your number: ");
    Scanner scanner = new Scanner(System.in);
    number.num(scanner);
  }
  public void num(Scanner scanner){
    int myNum;
    myNum = scanner.nextInt();
    if (myNum%2==0){
      System.out.println("Your Number is Even.");
    }else{
      System.out.println("your Number is Odd.");
    }
    scanner.close();
  }
}
