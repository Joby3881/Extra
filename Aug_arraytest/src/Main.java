//Q.Maximum numbers.
//import java.util.*;
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter arry size: ");
//        int size = sc.nextInt();
//        int a[] = new int[size];
//        int max = Integer.MIN_VALUE;
//
//        for (int i = 0; i < size; i++) {
//            a[i] = sc.nextInt();
//        }
//
//        for (int i = 0; i < a.length; i++) {
//            if(max < a[i])
//            {
//                max = a[i];
//            }
//        }
//        System.out.println("max number is :" +max);
//    }
//}
//Q.even number
//import java.util.*;
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter Array size: ");
//        int size = sc.nextInt();
//        int a[] = new int[size];
//
//        for (int i = 0; i < size; i++) {
//            a[i] = sc.nextInt();
//        }
//
//        for (int i = 0; i < a.length; i++) {
//            if (a[i] % 2 == 0) {
//                System.out.println(a[i]);
//            }
//        }
//    }
//}

//Q.odd number
//import java.util.*;
//public class Main{
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter arry size: ");
//        int size = sc.nextInt();
//        int a[] = new int[size];
//
//        for (int i = 0; i < size; i++) {
//            a[i] = sc.nextInt();
//        }
//
//        for (int i = 0; i < a.length; i++) {
//            if (a[i]%2 != 0) {
//                System.out.println(a[i]);
//            }
//        }
//    }
//}

//Q.prime number array
//import java.util.Scanner;
//public class Main
//{
//    public static void main(String args[])
//    {
//        int a[]=new int[5], i,j,count=0;
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter 5 numbers");
//        for(i=0; i<5; i++)
//        {
//            a[i]=sc.nextInt();
//        }
//        System.out.println("is a prime Numbers");
//        for(i=0; i<5; i++)
//        {
//            count=0;
//            for(j=1; j<=a[i]; j++)
//            {
//                if(a[i]%j==0)
//                {
//                    count++;
//                }
//            }
//            if(count==2)
//            {
//                System.out.print(a[i]+" ");
//            }
//        }
//    }
//}
//

//Reverse number
//        import java.util.*;
//public class Main
//{
//    public static void main(String[] args)
//    {
//
//        Scanner sc= new Scanner(System.in);
//        System.out.println("enter the number want revers");
//        int num= sc.nextInt();
//        System.out.println("the number is" +num);
//        int sum=0,rem;
//        while(num>0)
//        {
//            rem = num % 10;
//            sum = sum * 10 + rem;
//            num = num / 10;
//        }
//        System.out.println("reverse number is" +sum);
//
//    }
//}
//342 - 453
import java.util.*;
//public class Main
//{
//    public static void main(String[] args)
//    {
//        int a=342;
//        int rev=0;
//
//        while(a>0)
//        {
//            int r=a%10;
//            rev=rev*10+r+1;
//            a=a/10;
//
//        }
//        System.out.println(rev+99);
//    }
//}









