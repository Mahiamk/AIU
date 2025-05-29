import java.util.Scanner;
public class Array {
  public static void main(String[] args){
    Array obj = new Array();
    int[] num = {2,4,6,8,9,10};
    int n=num.length;
    int sum=0;
    int product=1;
    for (int i=0; i<n;i++){
      sum+=num[i];
      product*=num[i];
    }
    System.out.println("The sum of the array is:"+sum);
    System.out.println("The product of the array is"+product);
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please enter your number to get the factorial:");
    obj.factorial(scanner);
  }
  public void factorial(Scanner scanner){
    int num = scanner.nextInt();
    int fact = 1;
    for (int i=1; i<=num; i++){
      fact *= i;
    }
    System.out.println(fact);
    scanner.close();
  }
}
