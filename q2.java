import java.util.Scanner;
public class q2 {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner (System.in);
        int a[][] = new int[3][4];
        System.out.println("Enter the elements of the matrix");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<4;j++)
            {
                a[i][j]=scan.nextInt();
            }
        }
        System.out.println("Matrix");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<4;j++)
            {
                System.out.print(a[i][j]+" ");

            }
            System.out.println();
        }

    }
    
}
