import java.util.Scanner;
public class main {
    public static void main(String args[]){
        String string, sub;
        int i, c, length;

        System.out.println("Enter a string ");
        Scanner in = new Scanner(System.in);
        string = in.nextLine();

        System.out.println("Substrings of \"" + string + "\" are :-");

        length = string.length();

        for( c = 0; c < length; c++)
        {
            for( i = 1; i <=length - c; i++)
            {
                sub = string.substring(c, c+i);
                System.out.println(sub);
            }
        }
    }
}
