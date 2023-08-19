//user input
import java.util.*;
public class Main{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size ");
        int size=sc.nextInt();
        int a[]=new int[size];
        //input
        for(int i=0;i<a.length;i++)
        {
            System.out.println("enter number");
            a[i]=sc.nextInt();
        }
        //output
        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
    }
}