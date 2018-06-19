
import java.util.Scanner;
public class palindrome
{
    public static void main(String args[])
    {
        int x, y, a = 0,b;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any number:");
        x = scanner.nextInt();
        y = x;
        while(x > 0)
        {
            b = x % 10;
            a = a * 10 + b;
            x = x / 10;
        }
        if(a == y)
        {
            System.out.println("Given number "+y+" is Palindrome");
        }
        else
        {
            System.out.println("Given number "+y+" is Not Palindrome");
        }
    }
}