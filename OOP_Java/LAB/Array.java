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
    obj.factorial(scanner);
    obj.list(scanner);
  }
  public void factorial(Scanner scanner){
    System.out.println("Please enter your number to get the factorial:");
    int num = scanner.nextInt();
    int fact = 1;
    for (int i=1; i<=num; i++){
      fact *= i;
    }
    System.out.println(fact);
  }
  public void sortArray(int[] arr) {
    for (int i = 0; i < arr.length - 1; i++) {
      for (int j = 0; j < arr.length - i - 1; j++) {
        if (arr[j] > arr[j + 1]) {
          int temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
        }
      }
    }
    System.out.print("Sorted array: ");
    for (int num : arr) {
      System.out.print(num + " ");
    }
    System.out.println();
  }
  public void list(Scanner scanner){
    int [] mylist = new int[10];
    System.out.println("Enter " + mylist.length + " Values: ");
    for (int i = 0; i < mylist.length; i++) {
      mylist[i] = scanner.nextInt();
    }
    System.out.print("You entered: ");
    for (int i = 0; i < mylist.length; i++) {
      System.out.print(mylist[i] + " ");
    }
    System.out.println();
  }
}
