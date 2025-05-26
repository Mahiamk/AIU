import java.util.Scanner;

public class Trial1 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Trial1 obj = new Trial1();

    obj.factorial(scanner);
    obj.swap(6, 7);
    obj.revnum(scanner);
    obj.trian();

    scanner.close();
  }

  public void factorial(Scanner scanner) {
    System.out.print("Enter your number for factorial: ");
    int num = scanner.nextInt();
    int fact = 1;
    for (int i = 1; i <= num; i++) {
      fact *= i;
    }
    System.out.println("Factorial is: " + fact);
  }

  public void swap(int num1, int num2) {
    int num3 = num1;
    num1 = num2;
    num2 = num3;
    System.out.println("Num1 is: " + num1);
    System.out.println("Num2 is: " + num2);
  }

  public void revnum(Scanner scanner) {
    System.out.print("Enter your number to reverse: ");
    int num = scanner.nextInt();
    int revnum = 0;
    do {
      revnum = num % 10;
      System.out.print(revnum);
      num = num / 10;
    } while (num != 0);
    System.out.println();
  }
  public void trian(){
    int num=5;
    for (int i=0; i<num; i++){
      for(int j=0; j<num-i-1; j++){
        System.out.print(" ");
      }
      for(int k=0; k<2*i+1; k++){
          System.out.print("X");
        }
        System.out.println();
      }
  }
  
}
