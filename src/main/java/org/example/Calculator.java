package org.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;

public class Calculator {

    private static final Logger logger = LogManager.getLogger(Calculator.class);

    public static double add(double a, double b)
    {
        logger.info("[SUM] - "+a+", "+b);
        logger.info("[RESULT - SUM] - " + (a+b));
        return (a+b);
    }
    public static double subtract(double a, double b)
    {
        logger.info("[SUBTRACT] - "+a+", "+b);
        logger.info("[RESULT - DIFFERENCE] - " + (a-b));
        return (a-b);
    }
    public static double multiply(double a, double b)
    {
        logger.info("[MULTIPLY] - "+a+", "+b);
        logger.info("[RESULT - MULTIPLY] - " + (a*b));
        return (a*b);
    }
    public static double divide(double a, double b)
    {
        logger.info("[DIVIDE] - "+a+", "+b);
        logger.info("[RESULT - DIVIDE] - " + (a/b));
        if(b==0) throw new ArithmeticException();
        return (a/b);
    }
    public static double fact(double num) {
        double facto = 1;
        for(int i = 1; i <= num; ++i)
        { facto *= i;   }
        return  facto;
    }
    public static double factorial(double a) {
        logger.info("[FACTORIAL] - " + a);
        double result = 0;
        try
        {
            if(a<0)
            {
                result = Double.NaN;
                throw new ArithmeticException("Case of NaN ");
            }
            else
            {
                result = fact(a);
            }
        }catch (ArithmeticException error)
        {
            System.out.println("[EXCEPTION - FACTORIAL] - Cannot find factorial of negative numbers " + error.getLocalizedMessage());
        }
        logger.info("[RESULT - FACTORIAL] - " + result);
        return result;
    }
    public static double squareRoot(double a) {
        logger.info("[SQ ROOT] - " + a);
        double result = 0;
        try {
            if(a<0)
            {
                result = Double.NaN;
                throw new ArithmeticException("Case of NaN ");
            }
            else {
                result = Math.sqrt(a);
            }
        }catch (ArithmeticException error)
        {
            System.out.println("[EXCEPTION - SQ ROOT] - Cannot find square root of negative numbers " + error.getLocalizedMessage());
        }

        logger.info("[RESULT - SQ ROOT] - " + result);
        return result;
    }

    public static double power(double number1, double number2) {
        logger.info("[POWER - " + number1 + " RAISED TO] " + number2);
        double result = Math.pow(number1,number2);
        logger.info("[RESULT - POWER] - " + result);
        return result;
    }
    public static double naturalLog(double a) {
        logger.info("[NATURAL LOG] - " + a);
        double result = 0;
        try {

            if (a <=0 ) {
                result = Double.NaN;
                throw new ArithmeticException("Case of NaN ");
            }
            else {
                result = Math.log10(a);
            }
        } catch (ArithmeticException error) {
            System.out.println("[EXCEPTION - LOG] - Cannot find log of negative numbers " + error.getLocalizedMessage());
        }
        logger.info("[RESULT - NATURAL LOG] - " + result);
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String c = "yes";
        while(c.equals("yes"))
        {
            while(true)
            {
                int flag = 0;

                System.out.println("\nEnter a number");
                double a = sc.nextDouble();
                double b;
                System.out.println("Operations :\n1.Add\n2.Subtract\n3.Multiply\n4.Divide\n5.Factorial\n6.Square Root\n7.Power\n8.Natural log\n9.Exit");
                int choice = sc.nextInt();

                switch (choice)
                {
                    case 1:
                        System.out.println("\nEnter 2nd number");
                        b = sc.nextDouble();
                        System.out.println("Sum of the numbers = " + add(a,b));
                        break;

                    case 2:
                        System.out.println("\nEnter 2nd number");
                        b = sc.nextDouble();
                        System.out.println("Difference of the numbers = " + subtract(a,b));
                        break;

                    case 3:
                        System.out.println("\nEnter 2nd number");
                        b = sc.nextDouble();
                        System.out.println("Multiplication of the numbers = " + multiply(a,b));
                        break;

                    case 4:
                        try
                        {
                            System.out.println("\nEnter 2nd number");
                            b = sc.nextDouble();
                            System.out.println("Division of the numbers = " + divide(a,b));
                        }catch (ArithmeticException e)
                        {
                            System.out.println("Cannot divide with 0 ");
                        }
                        break;

                    case 5:
                        System.out.println("Factorial of the number = " +factorial(a));
                        break;

                    case 6:
                        System.out.println("Square Root of the number = " + squareRoot(a));
                        break;

                    case 7:
                        System.out.println("\nEnter the power");
                        b = sc.nextDouble();
                        System.out.println(a+ " raised to power  "+b+" is : " + power(a, b));
                        break;

                    case 8:
                        System.out.println("Natural log of the number = " + naturalLog(a));
                        break;

                    case 9:
                        return;

                    default:
                        flag = 1;
                        System.out.println("Wrong Input !! \n Please enter correct choice ");
                }
                if(flag==0) break;
            }
            System.out.println("Do you want to continue (yes/no) ? ");
            c = sc.next();
        }

    }
}

