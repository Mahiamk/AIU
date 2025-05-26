import java.util.Scanner;
public class square{
  public static void main(String[] args){
    square Square = new square();
    System.out.println("Enter your number: ");
    Scanner scanner = new Scanner(System.in);
    Square.num(scanner);

  }
  public void num(Scanner scanner){
    int myNum;
    myNum = scanner.nextInt();
    int squarenum = myNum * myNum;
    System.out.println(squarenum);
    scanner.close();
  }
}
