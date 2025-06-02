public class division {
  public static void main(String[] args){
    System.out.println("Numbers divuisible by 5 and 8");
    for (int i=1; i<100; i++){
      if((i%5==0)&&(i%8==0)){
        System.out.print(i+" ");
      }
    }
    System.out.println("\n\nNumbers divuisible by 8");
    for (int i=1; i<100; i++){
      if((i%5==0)&&(i%8!=0)){
        System.out.print(i+" ");
      }
    }
    System.out.println("\n\nNumbers divuisible by 5");
    for (int i=1; i<100; i++){
      if((i%5!=0)&&(i%8==0)){
        System.out.print(i+" ");
      }
    }
  }
}
