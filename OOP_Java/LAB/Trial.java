import java.util.Scanner;
public class Trial {
  public static void main(String[] args){
    Trial my = new Trial();
    my.evenOdd(8);
    my.add();
    double a,b,c,d;
    a=10.2;
    b=6.4;
    c=3.4;
    d=a+b+c;
    System.out.println("The summation of " + a + " + " + b + " + " + c + " = " + d);
    my.Name();
  }
  public void Name(){
    String a,b,c;
    a="Anwar";
    b="Mohammed";
    c="Koji";
    System.out.println("My name is: "+a+" " + b +" "+ c);
  }
  public void evenOdd(int num){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter your number: ");
    num = scanner.nextInt();
    if (num%2==0){
      System.out.println(num + " is Even number.");
    }else{
      System.out.println(num + " is Odd number. ");
    }
    scanner.close();
  }
  public void add(){
    double a,b,c;
    a=10.2;
    b=6.4;
    c=3.4;
    String d = String.valueOf(a + b + c);
    System.out.println(d);
  }
}
