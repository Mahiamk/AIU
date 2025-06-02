import java.util.Scanner;

public class per {
  public static void main(String[] args) {
   
    Scanner scanner = new Scanner(System.in);
      for (int i=1;i<=4;i++){
        String Name = scanner.next();
        System.out.println("Enter Name"+i+": ");
        System.out.println("Enter Age"+i+": ");
        int age = scanner.nextInt();
        System.out.println("Enter Salary"+i+": ");
        Double Salary = scanner.nextDouble();
        System.out.println("Name: "+Name+" Age: "+age+"Salary: "+ Salary);
      }
      
      scanner.close();

  }
}
