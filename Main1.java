
import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.Exception;

public class Main1
{
      public static void main(String[] args)
     {
        Scanner s=new Scanner(System.in);
        System.out.println("enter number of overs");
        int n = s.nextInt();
        int a[] = new int[n+1];
        System.out.println("Enter the number of runs for each over");
         if(n<0)
           throw new NegativeArraySizeException();
        for(int i = 1; i < n+1; i++)
        {
            a[i] = s.nextInt();
           
        }
        System.out.println("Enter the over number ");
        int ov=s.nextInt();
        try
        {
           
            int x = (int)Array.get(a, ov);
            System.out.println("Runs scored in this over:" + x);
        }
        catch (Exception e) 
        {
           System.out.println(e);
        }
     }
}



