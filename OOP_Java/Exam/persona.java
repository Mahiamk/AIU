import java.util.Scanner;

public class persona {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] names = new String[4];
        int[] ages = new int[4];
        double[] salaries = new double[4];
        for (int i = 0; i < 4; i++) {
            System.out.print("Name"+ (i + 1) +" : ");
            names[i] = scanner.nextLine();
            System.out.print("Age"+ (i + 1) +": ");
            ages[i] = scanner.nextInt();

            System.out.print("Salary"+ (i + 1) +": ");
            salaries[i] = scanner.nextDouble();
            scanner.nextLine();  
        }

        System.out.println("Name\t\tAge\tSalary");
        for (int i = 0; i < 4; i++) {
            System.out.println(names[i] + "\t\t" + ages[i] + "\t" + salaries[i]);
        }
        scanner.close();
    }
}