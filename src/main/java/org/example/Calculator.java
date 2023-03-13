package org.example;

import java.util.Scanner;

public class Calculator {
    public static double add(double a, double b)
    {
        return (a+b);
    }
    public static double subtract(double a, double b)
    {
        return (a-b);
    }
    public static double multiply(double a, double b)
    {
        return (a*b);
    }
    public static double divide(double a, double b)
    {
        if(b==0) throw new ArithmeticException();
        return (a/b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String c = "yes";
        while(c.equals("yes"))
        {
            System.out.println("\nEnter 1st number");
            double a = sc.nextDouble();
            System.out.println("\nEnter 2nd number");
            double b = sc.nextDouble();
            while(true)
            {
                int flag = 0;

                System.out.println("Operations :\n1.Add\n2.Subtract\n3.Multiply\n4.Divide\n5.Exit");
                int choice = sc.nextInt();

                switch (choice)
                {
                    case 1:
                        System.out.println("Sum of the numbers = " + add(a,b));
                        break;

                    case 2:
                        System.out.println("Difference of the numbers = " + subtract(a,b));
                        break;

                    case 3:
                        System.out.println("Multiplication of the numbers = " + multiply(a,b));
                        break;

                    case 4:
                        try
                        {
                            System.out.println("Division of the numbers = " + divide(a,b));
                        }catch (ArithmeticException e)
                        {
                            System.out.println("Cannot divide with 0");
                        }
                        break;

                    case 5:
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

