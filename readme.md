# <p>JAVA ASSIGNMENT<p>
# <p>03 Handling User Input<p>
# <p>Let's Practice: Calories Counter Pro<p>
## <P>**Objective :**<p>
### <p>In this exercise, you will create a simple Calorie Counter program in Java. The program enables users to input food items and their corresponding calorie values, calculates the total daily calorie intake, and displays the results.<p>
## <p>**Problem Statement :**<P>
## <p>Create a Java program that:<p>
### <p>1. **Prompt the user** to enter the names of three food items.<p>
### <p>2. **Ask for the calorie values** of each food item.<p>
### <p>3. **Calculate the total calorie intake.**<p>
### <p>4. **Displays** a summary of the foods and their corresponding calories.<p>
## <p>5. Exercise Instructions:<p>
### <p>6. 1️⃣ **Define the variables** to store food names and calorie values.<p>
### <p>7.2️⃣ **Use** Scanner **to read input from the user**(both String and int).<p>
### <p>8.3️⃣ **Handle the** Scanner **properly** by consuming the newline character when needed.<p>
### <p>9.4️⃣ **Compute the total calorie intake.**<P>
### <P>10.5️⃣ **Display the results in a clear format.**<P>
```
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
```
[githublink](https://github.com/Aromalpriyan/Assignment-3)
