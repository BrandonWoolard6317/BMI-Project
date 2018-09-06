import java.util.Scanner;

public class BMIProject {

    public static void main(String[] args) {
        String personsName;
        /*String personsHeight;
        String personsWeight;
        String personsBMI;*/
       
        int personsHeight,personsWeight,heightModifier,weightModifier,personsBMI,
        convertedHeight,convertedWeight;
        
        keyboard = new Scanner(System.in);
        heightModifier = 0.0254;
        weightModifier = 0.453592;
        
        System.out.println("Hello this is my BMI Calculator! Lets start off with your name.");
        personsName = keyboard.nextLine();
        System.out.println("Hi " + personsName + "! Next what is your height in inches?");
        personsHeight = keyboard.nextLine();
        System.out.println("My last question, if you don't mind me asking what's your weight in pounds?");
        personsWeight = keyboard.nextLine();
        
        convertedHeight = personsHeight * heightModifier;
        convertedWeight = personsWeight * weightModifier;
        personsBMI = (convertedHeight/convertedWeight)/convertedWeight;
        
        System.out.println("Thank you for the information! I calculated your BMI to be " + personsBMI + ".");




    }
}
