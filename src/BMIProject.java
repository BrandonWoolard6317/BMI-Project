import java.util.Scanner;

public class BMIProject {
    public static void main(String[] args) {
        String personsName;
        String personsHeightInches;
        String personsHeightFeet;
        String personsWeightPounds;
        int personsHeight;
        int personsWeight;
        int personsHeightFeetCombine;
        int personsHeightInchesCombine;
        int personsHeightCombined;
        double personsHeightConverted;
        double personsWeightConverted;
        double personsBMI;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Hello this is my BMI Calculator! Lets start off with your name.");
        personsName = keyboard.nextLine();
        System.out.println("Hi " + personsName + "! What is your height in feet?");
        personsHeightFeet = keyboard.nextLine();
        System.out.println("Inches?");
        personsHeightInches = keyboard.nextLine();
        System.out.println("My last question, if you don't mind me asking what's your weight in pounds?");
        personsWeightPounds = keyboard.nextLine();

        personsHeightFeetCombine = Integer.parseInt(personsHeightFeet);
        personsHeightInchesCombine = Integer.parseInt(personsHeightInches);
        personsHeightCombined = personsHeightInchesCombine + (personsHeightFeetCombine * 12);
        personsHeight = Integer.parseInt(String.valueOf(personsHeightCombined));
        personsHeightConverted = (personsHeight*0.0254);
        personsWeight = Integer.parseInt(personsWeightPounds);
        personsWeightConverted = (personsWeight*0.453592);
        personsBMI = (personsWeightConverted/personsHeightConverted)/personsHeightConverted;
        double roundOffBMI = Math.round(personsBMI * 100.0) / 100.0;

        System.out.println("BMI Groups");
        System.out.println("Underweight: Your BMI is less than 18.5");
        System.out.println("Healthy weight: Your BMI is 18.5 to 24.9");
        System.out.println("Overweight: Your BMI is 25 to 29.9");
        System.out.println("Obese: Your BMI is 30 or higher");

        System.out.println(" ");
        System.out.println(" ");

        System.out.println("Name: " + personsName);
        System.out.println("Height: " + personsHeightFeet + "'" + personsHeightInches + "\"");
        System.out.println("Weight: " + personsWeightPounds);
        System.out.println("BMI: " + roundOffBMI);

        if(roundOffBMI < 18.5){
            System.out.println("Group: Underweight");
        }
        if(roundOffBMI > 18.5) {
            if (roundOffBMI < 24.9) {
                System.out.println("Group: Healthy");
            }
        }
        if(roundOffBMI > 25) {
            if (roundOffBMI < 29.9) {
                System.out.println("Group: Overweight");
            }
        }
        if(roundOffBMI > 30){
            System.out.println("Group: Obese");
        }
    }
}