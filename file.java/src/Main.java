

import java.util.*;
public class Main
    {
    public static void main(String[] args)
        {

        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number want revers");
        int num= sc.nextInt();
        System.out.println("the number is" +num);
        int sum=0,rem;
        while(num>0)
        {
            rem = num % 10;
            sum = sum * 10 + rem;
            num = num / 10;
        }
        System.out.println("reverse number is" +sum);

        }
    }


