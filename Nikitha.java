import java.util.Scanner;

class palindrome
{
    public void palindromChecker(String a)
    {
        String reversed = "";
        for(int i = a.length()-1;i>=0;i--)
            {
            reversed = reversed + a.charAt(i);
        }
        if(reversed.equals(a))
            System.out.println("It is a palindrome");
        else
            System.out.println("It is not a palindrome");
    }
}
public class Nikitha {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter the String you want to check ?");
        String original = sc.next();
        palindrome obj = new palindrome();
        obj.palindromChecker(original);
        sc.close();
    }
}
