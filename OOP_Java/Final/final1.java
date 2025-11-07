import java.util.Scanner;

class final1 {
  public double getArea(double length, double breadth) {
    return length * breadth;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Length: ");
    double length = sc.nextDouble();
    System.out.print("Enter Breadth: ");
    double breadth = sc.nextDouble();
    sc.close();

    final1 areaObj = new final1();
    double area = areaObj.getArea(length, breadth);
    System.out.println("Area: " + area);
  }
}