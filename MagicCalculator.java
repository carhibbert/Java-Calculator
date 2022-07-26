import java.math.*;
import java.util.Scanner;

public class MagicCalculator extends calculator{


    static double squareRoot(int num1, int num2){
        Double num = Math.sqrt(num1);
        return num;

    }

    static double [] trig(int num1, int num2){
        double sin= Math.sin(num1);
        double cos= Math.cos(num1);
        double tan = Math.tan(num1);

        double[] trig = {sin, cos, tan};
        for(int i = 0; i<=2; i++){
            return trig[i];
        }
    }

    static int factorial(int num1, int num2){
        int product = num1;
        for (int i=num1-1; i>=1; i--){
            product *= i;
        }
        return product;
    }
    public static void main(String[] args){

        Scanner num = new Scanner(System.in);

        System.out.println("Please enter two numbers:");
        int num1 = Integer.parseInt(num.nextLine());
        int num2 = Integer.parseInt(num.nextLine());

        System.out.println("The square root of num1 is: " + squareRoot(num1, num2));
        System.out.println("The sine, cosine, and tangent of " + num1 + "is: " +trig(num1, num2));
        System.out.println(num1 + "! =" + factorial(num1, num2));
    }
    
}
