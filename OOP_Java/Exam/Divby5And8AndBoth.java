public class Divby5And8AndBoth {
  public static void main(String[] args){
    System.out.println("Numbers divuisible by 5,8 and both");
    for (int i=1; i<100; i++){
      if((i%5==0)&&(i%8==0)){
        System.out.println(i+" ");
      }
    }
  }
}