import java.util.Scanner;
public class q7 {
    public static void main(String[] args)
    {
        //Linear Search 
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int n=scan.nextInt();
        int []a = new int[n];
        int i=0;
        System.out.println("Enter the elements of the array :");
        for( i=0;i<n;i++)
        {
            a[i] = scan.nextInt();
        }
        System.out.println("enter the key to be found :");
        int key = scan.nextInt();
        
        i=0;
        while(i<n  && a[i]!=key)
        {
            i++;
        }
        
        if(i<n)
        {
            System.out.println("The key" +key+"is found at index" +i);
        }
            
        else    
        {
            System.out.println("key "+key+"not found in the array");
        }

        
    }
    
}
