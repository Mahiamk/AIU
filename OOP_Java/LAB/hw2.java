
public class hw2 {
  public static void main(String[] args){
    hw2 two = new hw2();
    two.user2("Anwar",2500);
  }
  public void user2(String Name, int Capital){
    float interest;
    if (Capital>5000){
      interest = (float) (Capital*0.1);
      System.out.println(interest);
    }else{
      interest = (float) (Capital*0.15);
      System.out.println(interest);
    }
    float total= (float)(interest + Capital);
    System.out.println("Final amount is "+total);
  }
}
