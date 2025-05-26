import java.util.Scanner;
public class Name {
  public static void main(String[] args){
    Name date = new Name();
    Scanner scanner = new Scanner(System.in);
    date.days(scanner);
    scanner.close();
  }
  public int days(Scanner scanner){
    System.out.print("Enter a month number (1-4): ");
    int month = scanner.nextInt();
    switch (month) {
      case 1:
        System.out.println("January"); 
        break;
      case 2:
        System.out.println("February");
        break;
      case 3:
        System.out.println("March");
        break;
      case 4:
        System.out.println("April");
        break;
      default:
        System.out.println("May");
        break;
    }
    return month;
  }
}
