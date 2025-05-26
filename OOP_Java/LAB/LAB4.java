public class LAB4 {
  public static void main(String[] args) {

    int num = 5;
    int fact = 1;
    for (int i = 1; i <= 5; i++) {
      fact *= i;
    }
    System.out.println("The value of" + num + " factorial is: " + fact);
    swapNumbers();
    largestNum();
    reverseNum();
    triangle();
  }

  public static void swapNumbers() {
    int x = 10;
    int y = 20;
    int temporary;
    temporary = x;
    x = y;
    y = temporary;
    System.out.println("The value of x is: " + x);
    System.out.println("The value of y is: " + y);
  }

  public static void largestNum() {
    int a = 8;
    int b = 20;
    int c = 15;
    if ((a > b) && (a > c)) {
      System.out.println("a is the largest number.");
    } else if ((b > a) && (b > c)) {
      System.out.println("b is the largest number");
    } else {
      System.out.println("c is the largest number");
    }
  }

  public static void reverseNum() {
    int num = 13456;
    int revNum = 0;
    do {
      revNum = num % 10;
      System.out.print(revNum);
      num /= 10;

    } while (num != 0);
    System.out.println();
  }

  public static void triangle() {
    for (int i = 1; i <= 5; i++) {
      for (int j = 5; j >= i; j--) {
        System.out.print(" ");
      }
      for (int k = 1; k <= 2 * i - 1; k++) {
        System.out.print("X");
      }
      System.out.println();
    }
  }
}
