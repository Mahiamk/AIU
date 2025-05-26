public class Student {
  int age = 22;
  String name= "Anwar";
  String school= "SCI";
  public static void main(String[] args){
    Student student = new Student();
    System.out.println(student.age);
    student.conv(45.4);
    student.convr("66");
    student.oneten();
    boolean result = student.poseven();
    System.out.println(result);
  }
  public void conv(double x){
    String y = String.valueOf(x);
    System.out.println(y);
  }
  public boolean poseven(){
    int num=11;
    if ((num>0) && (num%2==0)){
      return true;
    }
    return false;
  }
  public void convr(String x){
    int y = Integer.valueOf(x);
    System.out.println(y);
  }
  public void oneten(){
    int num = 10;
    for (int i=1; i<=num; i++){
      System.out.println(i);
    }
  }
}
