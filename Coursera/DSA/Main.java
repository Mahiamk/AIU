public class Main {
  public static void main(String[] args){
    String[] studentsName = new String[] {"Anwar","Abdi","John","Ali","Alex"};
  
    int[] studentsAge = new int[] {18,20,22,16,19};
  
    int[] rollNumber = new int[] {6,3,14,5,4};
    for (int i = 0; i < rollNumber.length - 1; i++) {
      for (int j = i + 1; j < rollNumber.length; j++) {
      if (rollNumber[j] < rollNumber[i]) {
        int tmpRoll = rollNumber[i]; rollNumber[i] = rollNumber[j]; rollNumber[j] = tmpRoll;
        int tmpAge = studentsAge[i]; studentsAge[i] = studentsAge[j]; studentsAge[j] = tmpAge;
        String tmpName = studentsName[i]; studentsName[i] = studentsName[j]; studentsName[j] = tmpName;
      }
      }
    }

    for (int i = 0; i < studentsName.length; i++) {
      System.out.println(rollNumber[i] + ": " + studentsName[i] + " is " + studentsAge[i] + " years old.");
    }
  }
}