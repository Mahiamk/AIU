// import java.util.Scanner;

public class Try {
  public static void main(String[] args) {
    Try obj = new Try();
    // obj.month();
    // obj.num();
    obj.array();
  }

  // public void month() {
  //   Scanner scanner = new Scanner(System.in);
  //   System.out.println("Enter month number (1-12): ");
  //   int month = scanner.nextInt();
  //   scanner.close();
  //   int days;
  //   switch (month) {
  //     case 1: // January
  //     case 3: // March
  //     case 5: // May
  //     case 7: // july
  //     case 8: // August
  //     case 10:
  //     case 12:
  //       days = 31;
  //       break;
  //     case 4: // April
  //     case 6: // June
  //     case 9: // Sept
  //     case 11: // Nov
  //       days = 30;
  //       break;
  //     case 2: // Febr
  //       days = 28;
  //       break;
  //     default:
  //       System.out.println("Invalid month number. Please enter a correct number (1-12)");
  //       return;
  //   }
  //   String[] monthName = { "January", "February", "March" };
  //   for (int i = 0; i < 12; i++) {
  //     if (i + 1 == month) {

  //       System.out.println("Number of days in month " + monthName[i] + ": " + days + " days.");
  //     }

  //   }
  // }

  // public void num() {
  //   for (int i = 1; i <= 100; i++) {
  //     if ((i%4==0)&&(i%6==0)){
  //       System.out.println(i);
  //     }
  //     if((i%4==0)||(i%6==0)){
  //       System.out.println(i);
  //     }
  //   }
  // }
  public void array(){
    int[] num={296,4,5,6,78,10};
    int sum = 0;
    for(int i=0;i<num.length; i++){
      sum+=num[i];
    }
    System.out.println("The sum of the array is: "+sum);
    System.out.println();
    for (int j=num.length-1; j>=0;j--){
      System.out.print(num[j]+" ");
    }
    System.out.println();
  }

}
