

class hw3 {
  public static void main(String[] args) {
    hw3 grade = new hw3();
    grade.pass(49.99);
  }

  public void pass(double mark) {
    if (mark >= 50) {
      System.out.println("Pass");
    } else {
      System.out.println("Fail");
    }
  }

}
