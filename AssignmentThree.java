import java.util.Scanner;
public class AssignmentThree{
    public static void main(String[] args) {
        System.out.println("Welcome to Calories Counter Pro!");
        String food1,food2,food3;
        int calories1,calories2,calories3;
        int TotalCalories;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the first food item:");
        food1 = sc.nextLine();
        System.out.println("Enter the calories for " + food1 + ":");
        calories1 = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the name of the second food item:");
        food2 = sc.nextLine();
        System.out.println("Enter the calories for " + food2 + ":");
        calories2 = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the name of the third food item:");
        food3 = sc.nextLine();
        System.out.println("Enter the calories for " + food3 + ":");
        calories3 = sc.nextInt();
        sc.nextLine();
        TotalCalories = calories1 + calories2 + calories3;
        System.out.println("\nYour Calories Intake:");
        System.out.println("1." + food1 + "-" + calories1 + " calories");
        System.out.println("2." + food2 + "-" + calories2 + " calories"); 
        System.out.println("3." + food3 + "-" + calories3 + " calories");
        System.out.println("\nTotal Calories Intake: " + TotalCalories + " Calories");

        sc.close();
    }
}
