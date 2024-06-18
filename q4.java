import java.util.*;

public class q4
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Calculator ");
        System.out.println("1.Addition 2.Subtraction 3.Mulitply 4.Divide 5.Modulus 6.power ");
        System.out.println("Enter your choice ");
        int choice = scan.nextInt();
        System.out.println("Enter the two numbers ");
        double num1=scan.nextInt();
        scan.nextLine();
        double num2=scan.nextInt();
        double result;
        switch(choice)
        {
            case 1 : result=num1+num2;
                     System.out.println("Result : " + result);
                     break;
            case 2: result =num1-num2;
                     System.out.println("Result :" +result);
                     break;
            case 3: result =num1*num2;
                    System.out.println("Result :" +result);
                    break;
            case 4: result =num1/num2;
                    System.out.println("Result :" +result);
                    break;

            case 5: result =num1%num2;
                    System.out.println("Result :" +result);
                    break;
            case 6:result= Math.pow(num1,num2);
                    System.out.println("result :"+result);
                    break;
            default:System.out.println("Enter correct choice ");
                    break;
           
           
            
            

        }

    }
}