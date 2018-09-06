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
        System.out.println("Hi " + personsName + "! Next what is your height in feet?");
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

        System.out.println("Thanks for the information" + personsName + "! Your BMI is " + personsBMI + ". Feel free " +
                "to use this calculator again, have a nice day!");
    }


    /*BMI Calculator Inches Already Converted
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

        System.out.println("Thanks for the information" + personsName + "! Your BMI is " + personsBMI + ". Feel free " +
                           "to use this calculator again, have a nice day!");
    }*/
}
