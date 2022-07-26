import java.util.Scanner;

public class calculator {
    
   static int add(int num1, int num2) {
        return num1 + num2;
   }

   static int subtract(int num1, int num2){
        return num1 - num2;
   }

   static int multiply(int num1, int num2){
        return num1 * num2;
   }

   static int divide(int num1, int num2){
        return num1 / num2;
   }

   static int square(int num1, int num2){
        return num1 * num1;
   }

    public static void main(String[] args){
        Scanner num = new Scanner(System.in);

        System.out.println("Please enter two numbers:");
        int num1 = Integer.parseInt(num.nextLine());
        int num2 = Integer.parseInt(num.nextLine());
        
        System.out.println(num1);
        System.out.println(num2);

        System.out.println("Sum: " + add(num1, num2));
        System.out.println("Difference: " + subtract(num1, num2));
        System.out.println("Product: " + multiply(num1, num2));
        System.out.println("Quotient: " + divide(num1, num2));
        System.out.println("Square of 1st Integer: " + square(num1, num2));
    }
}
