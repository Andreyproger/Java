/**
 * Created by Andrey on 28.03.2017.
 */

import java.util.Scanner;

public class Main {
    /*private double a;
    private double b;
    private double c;
    private double d;*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Sequentially enter the space \n" +
                "Enter side AB, BC, CD, DA:");
        //String str;
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double d = sc.nextDouble();
        try{
            trapezezoid trap_d = new trapezezoid(a,b,c,d);
            System.out.println(trap_d.diagonal(a,b,c,d));
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }



}
