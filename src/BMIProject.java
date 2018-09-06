import java.util.Scanner;

public class BMIProject {

    public static void main(String[] args) {
        String personsName;
        String personsHeightInches;
        String personsWeightPounds;
        int personsHeight;
        int personsWeight;
        double personsHeightConverted;
        double personsWeightConverted;
        double personsBMI;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Hello this is my BMI Calculator! Lets start off with your name.");
        personsName = keyboard.nextLine();
        System.out.println("Hi " + personsName + "! Next what is your height in inches?");
        personsHeightInches = keyboard.nextLine();
        System.out.println("My last question, if you don't mind me asking what's your weight in pounds?");
        personsWeightPounds = keyboard.nextLine();

        personsHeight = Integer.parseInt(personsHeightInches);
        personsHeightConverted = (personsHeight*0.0254);
        personsWeight = Integer.parseInt(personsWeightPounds);
        personsWeightConverted = (personsWeight*0.453592);
        personsBMI = (personsWeightConverted/personsHeightConverted)/personsHeightConverted;

        System.out.println("Thanks for the information! You're BMI is " + personsBMI + ".");
    }
}
