import java.util.Scanner;
public class Try {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter month number (1-12): ");
    int month = scanner.nextInt();
    scanner.close();
    int days;
    switch(month){
      case 1: //January
      case 3: //March
      case 5: //May
      case 7: //july
      case 8: //August
      case 10:
      case 12:
      days = 31;
      break;
      case 4: //April
      case 6: //June
      case 9: //Sept
      case 11: //Nov
      days = 30;
      break;
      case 2: //Febr
      days = 28;
      break;
      default:
      System.out.println("Invalid month number. Please enter a correct number (1-12)");
      return;
    }
    String[] monthName = {"January","February","March"};
    for (int i=0; i<12; i++){
      if (i+1==month){

        System.out.println("Number of days in month "+monthName[i]+ ": "+ days+" days.");
      }

    }
  }
}
