import java.util.*;
public class q3 {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first string :");
        String s1 = scan.nextLine();
        
        System.out.println("Enter the second string :");
        String s2 = scan.nextLine();
        boolean result = s1.equals(s2);//comparison is case sensitive
        System.out.println("Result :"+result);
    }
    
}
