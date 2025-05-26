public class prepost {
  public static void main(String[] args){
    prepost oper = new prepost();
    oper.pre();
    oper.post();
  }
  public void pre(){
    int x=6;
    int y=++x;
    System.out.println("The pre increment of x is: "+ y);
  }
  public void post(){
    int x=6;
    int y=x++;
    System.out.println("This is post increment of x is: "+ y+",But now X is "+x);

  }
}
