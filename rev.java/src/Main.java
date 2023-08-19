//import java.util.Scanner;
//  public class Main {
//    public static void main(String[] args)
//    {
//             int n=1;
//
//          for (int i=1; i<=5;i++)
//          {
//              {
//                  for (int j = 1; j <= 5; j++) {
//                      System.out.print(n);
//                  }
//                  n++;
//                  System.out.println();
//              }
//
//
//
//        }
//    }
//}

//import java.util.*;
//public class Main {
//    public static void main(String[] args) {
//        for (int i = 1; i <= 3; i++) {
//            for (int j = 2; j >= i; j--) {
//                System.out.print(" ");
//            }
//            for (int j = 1; j <= i; j++) {
//
//                {
//                    System.out.print("*");
//                }
//                System.out.println();
//            }
//
//        }
//    }
//
//
//}

//import java.util.Scanner;
//  public class Main {
//    public static void main(String[] args)
//    {
//             int n=1;
//
//          for (int i=1; i<=5;i++)
//          {
//              {
//                  for (int j = 1; j <= 5; j++) {
//                      System.out.print(n);
//                  }
//                  n++;
//                  System.out.println();
//              }
//
//
//
//        }
//    }
//}

//342 to 453 reverse.
// import java.util.Scanner;
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("enter the number you wat reverse");
//        int num=sc.nextInt();
//        int rem, sum = 0;
//        int ram, sam = 0;
//
//        while (num > 0) {
//            rem = num % 10;
//            sum = sum * 10 + rem + 1;
//            num = num / 10;
//        }
//                while (sum > 0) {
//                    ram = sum % 10;
//                    sam = sam * 10 + ram;
//                    sum = sum / 10;
//                }
//                System.out.println("the reverse number is : " + sam);
//            }
//
//        }

//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("enter the number");
//        int num=sc.nextInt();
//        int rem,sum=0,c=num;
//
//        while(num>0){
//            rem=num%10;
//            sum=sum*10+rem;
//            num=num/10;
//
//        }
//        if(c==sum){
//            System.out.println("the number is pallindrome");
//        }
//        else {
//            System.out.println("number is not pallindrome");
//        }
//    }
//}
//
//how much count or digit
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("enter the number");
//        int num=sc.nextInt();
//        int count=0;
//        while(num>0){
//            num=num/10;
//            count=count+1;
//        }
//        System.out.println("digits are :" +count);
//    }
//}

//import java.util.Scanner;

//import java.util.Scanner;
//
////multiplication table 2 to 10
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("enter where do you want to start the table");
//        int num=sc.nextInt();
//        System.out.println("enter how far you want to make the table");
//        int num1=sc.nextInt();
//
//
//        for (int i =num; i <=num1;i++)
//        {
//            for (int j=1;j<=10; j++)
//
//            {
//                System.out.println(i*j);
//            }
//
//            }
//            System.out.println();
//        }
//    }
//muli table of 2
//public class Main {
//    public static void main(String[] args) {
//
//        for(int i=2;i<=2;i++){
//            for(int j=1;j<=10;j++){
//                System.out.println(i*j);
//            }
//            System.out.println();
//        }
//    }
//}
//any no multi table
//import java.util.*;
//public class Main
//{
//
//    public static void main(String[] args)
//
//    {
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//
//        for (int i = 1; i <= 10; i++)
//        {
//            System.out.println(num+"*"+i+"="+num*i);
//        }
//    }
//}
//odd or even
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner((System.in));
//        System.out.println("enter the number");
//        int num=sc.nextInt();
//        if(num%2==0){
//            System.out.println("number is even");
//        }
//        else{
//            System.out.println("number is odd");
//        }
//    }
//}
//
//swap with tree variable
//public class Main {
//    public static void main(String[] args) {
//        int a=10;
//        int b=20;
//        int c=0;
//        c=a;
//        a=b;
//        b=c;
//        System.out.println(a+" and" +b);
//    }
//}
//public  class Main {
//    public static void main(String[] args) {
//        int a=10;
//        int b=20;
//        a=a+b;
//        b=a-b;
//        a=a-b;
//        System.out.println("a is : "+a+" b is : "+b);
//    }
//}
//Find first and last digit.
//import java.util.Scanner;
//public class Main{
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("enter the numbers");
//        int num=sc.nextInt();
//        System.out.println();
//         int rem;
//         rem=num%10;
//        System.out.println("end digit is :" +rem);
//        while(num>10){
//            num=num/10;
//        }
//        System.out.println("first is :" +num);
//    }
//