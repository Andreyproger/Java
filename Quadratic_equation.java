package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("INput A,B,C: ");
        Scanner reader = new Scanner(System.in);
        int a = reader.nextInt();
        int b = reader.nextInt();
        int c = reader.nextInt();
        //System.out.println(a);
        double D;
        //D = Math.sqrt(b*b-4*a*c);
        D = Discriminant(a,b,c);
        Print_Roots(D, b,a);
        //System.out.print(D);
        /*double X1 = (-b + D) / (2 * a);
        double X2 = (-b - D) / (2 * a);
        System.out.println("The first root: " + X1+ ", second root: " + X2);*/
    }

    private static double Discriminant(double a,double b, double c){
        return Math.sqrt(b * b - 4 *a * c);
    }
    private static void Print_Roots(double D, double b, double a){
        if (D > 0) {
            System.out.print("First root: " + (-b + D) / (2 * a) + "\n");
            System.out.print("Second root: " + (-b - D) / (2 * a) + "\n");
        }
        else if (D == 0) {
            System.out.print("Both roots equal and solution: " + (-b + D) / (2 * a));
        }

    }
}
