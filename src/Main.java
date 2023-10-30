import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static final DecimalFormat DF = new DecimalFormat("0.00");
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please type your weight (kg):");
        double weight = scanner.nextDouble();

        System.out.print("Please type your height (cm):");
        double height = scanner.nextDouble() / 100;

        double bmi = Double.parseDouble(DF.format(weight / (height * height))) ;
        System.out.println("Your BMI is: "+ bmi);

        if(bmi < 18) {
            System.out.println("你的體重過輕");
        } else if(bmi < 24) {
            System.out.println("你的體重正常");
        } else if (bmi < 30) {
            System.out.println("你的體重微胖");
        } else{
            System.out.println("你的體重過胖");
        }
    }
}