import java.util.Scanner;
public class employe {
  public static void main(String[] args){
    System.out.println("Enter your name: ");
    Scanner scanner = new Scanner(System.in);
    String Name = scanner.nextLine();
    System.out.println("Enter your Salary: ");
    Double Salary = scanner.nextDouble();
    Double allowance=Salary*0.1;
    Double newSalary=Salary+allowance;
    Double tax=newSalary*0.05;
    Double netPay=Salary+allowance - tax;
    System.out.println("The Net pay for "+ Name +" is equal= "+ netPay);
    scanner.close();
  }
}
