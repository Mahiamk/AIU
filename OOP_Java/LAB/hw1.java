
public class hw1 {
  public static void main(String[] arg){
    hw1 tax = new hw1();
  tax.user("Anwar", 2000);
  }
  public void user(String Name, int Capital){
    float Interest = (float)(Capital * 0.1);
    float Final = (float)(Interest + Capital);
    System.out.println("Final amount for "+Name+" is "+ Final);
  }
}
