//Array is a homogenius colletion of datatype.
//Arrays are objet in java it's super class is object class so array stored in the hip are of memmory.

//public class Main {
//    public static void main(String[] args) {
//        int[] a={1,2,3,4};  //Declaration, Creation and Initialisation in one line.
//        for(int i=0;i<a.length;i++){
//            System.out.print(a[i]+ " ");
//        }
//        }
//   }
//import java.util.Scanner;
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("enter the size");
//        int size=sc.nextInt();
//        int [] a=new int[size];
//
//        for(int i=0; i<size; i++)
//        {
//            System.out.println("enter the number");
//            a[i]=sc.nextInt();
//        }
//        for(int j=0;j<size; j++){
//            System.out.print(a[j]+ " ");
//        }
//    }
//}
//
//Q 1.
//Compute the Sum and Average of Array Elements

//public class Main{
//  public static void main(String[] args) {
//    int a[]= new int[]{10,20,30,40};
//    int sum =0;
//    for(int i=0;i<a.length;i++){
//       sum=sum+a[i];
//    }
//    System.out.println("sum of array :"+sum);
//    System.out.println("average :"+sum/4);
//  }
//}
//********************************************************************************************************************
//Q 2. Find the Length of Array in Java
//
//import java.util.Scanner;
//
//public class Main{
//  public static void main(String[] args) {
//    Scanner sc = new Scanner(System.in);
//    System.out.println("enter the size");
//    int size = sc.nextInt();
//    int a[] = new int[size];
//    System.out.println("enter numbers :");
//    for(int i=0;i<size;i++){
//      a[i]=sc.nextInt();
//    }
//    System.out.println("length of arry is :"+size);
//  }
//}
//********************************************************************************************************************
//3)Get Array Input in Java
//
//import java.util.Scanner;
//public class Main{
//  public static void main(String[] args) {
//    Scanner sc = new Scanner(System.in);
//    System.out.println("enter the size");
//    int size = sc.nextInt();
//    int a[] = new int[size];
//    System.out.println("enter numbers :");
//    for(int i=0;i<size;i++){
//      a[i]=sc.nextInt();
//    }
//    for(int i=0;i<size;i++){
//      System.out.print(a[i]+" ");
//    }
//  }
//}
//*******************************************************************************************************************
//Q 4.Sum of Two Arrays Elements
//a[]
//b[]
//add
//
//import java.util.Scanner;
//public class Main{
//  public static void main(String[] args) {
//    Scanner sc = new Scanner(System.in);
//    System.out.println("enter the size for both array");
//    int size = sc.nextInt();
//    int a[]= new int[size];
//    int b[]= new int[size];
//    System.out.println("enter numbers for a:");
//    for(int i=0;i<size;i++){
//      a[i]=sc.nextInt();
//    }
//     System.out.println("enter numbers for b :");
//     for(int i = 0;i<size;i++){
//      b[i]=sc.nextInt();
//     }
//     System.out.println("sum of two arry a and b is :");
//    for(int i=0;i<size;i++){
//      System.out.print((a[i]+b[i])+" ");
//    }
//  }
//}
//********************************************************************************************************************
//
//Q 5. Take 10 integer inputs from user and store them in an array.
// Again ask user to give a number. Now, tell user whether that number is present in array or not.

//import java.util.Scanner;
//public class Main{
//  public static void main(String[] args) {
//    Scanner sc = new Scanner(System.in);
//    int num = sc.nextInt();
//    int a[]= {10,20,30,40,50};
//    for(int i=0;i<a.length;i++){
//      if(a[i]==num){
//        System.out.println("present at "+i);
//      }
//      if(a[i]!=num){
//        System.out.println("not p");
//      }
//    }
//  }
//}
//*********************************************************************************************************************
//Q. Find even numbers in array
//
import java.util.Scanner;
public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter size :");
    int size = sc.nextInt();
    int a[]=new int[size];
    System.out.println("enter the array number ");
    for(int i=0;i<size;i++){
      a[i]=sc.nextInt();
    }
     System.out.println("even numbers are :");
    for(int i=0;i<a.length;i++){
      if(a[i]%2==0){
        System.out.print(a[i]+" ");
      }
    }
  }
}
//**************************************************************************************************************
//Q. Find odd numbers in array
//
//import java.util.Scanner;
//
//public class Main{
//  public static void main(String[] args) {
//    Scanner sc = new Scanner(System.in);
//    System.out.println("enter size :");
//    int size = sc.nextInt();
//    int a[]=new int[size];
//    System.out.println("enter the array number ");
//    for(int i=0;i<size;i++){
//      a[i]=sc.nextInt();
//    }
//     System.out.println("even numbers are :");
//    for(int i=0;i<a.length;i++){
//      if(a[i]%2==1){
//        System.out.print(a[i]+" ");
//      }
//    }
//  }
//}
//*********************************************************************************************************************
//Q. take 10 integer inputs from user and store them in an array and print them on screen
//
//import java.util.Scanner;
//
//public class Main{
//  public static void main(String[] args) {
//    Scanner sc = new Scanner(System.in);
//    System.out.println("enter size :");
//    int size = sc.nextInt();
//    int a[]=new int[size];
//    System.out.println("enter the array number ");
//    for(int i=0;i<size;i++){
//      a[i]=sc.nextInt();
//    }
//     System.out.println("enter numbers are :");
//    for(int i=0;i<a.length;i++){
//      System.out.print(a[i]+" ");
//    }
//  }
//}
//**********************************************************************************************************************
//
//Q6. Take 10 integer inputs from user and store them in an array. Again ask user to give a number. Now, tell user whether
// that number is present in array or not.
//Find table of every element in array
//Find number max in array
//
//import java.util.*;
//public class Main{
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter number: ");
//        int num = sc.nextInt();
//        System.out.println("Enter arry size: ");
//        int size = sc.nextInt();
//        int a[] = new int[size];
//
//        for (int i = 0; i < size; i++) {
//            a[i] = sc.nextInt();
//        }
//        for (int i = 0; i < a.length; i++) {
//            if (a[i] == num) {
//                System.out.println("present");
//            } else {
//                System.out.println("not p");
//            }
//        }
//    }
//}
//*********************************************************************************************************************
//max number in array
//
//
//import java.util.*;
//
//public class Ab {
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
//        System.out.println("max number :" +max);
//    }
//}
//*********************************************************************************************************************
//Find table of every element in array.
//
//
//import java.util.*;
//public class Main {
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
//           for(int j=1;j<=10;j++)
//           {
//            System.out.println(a[i]*j);
//           }
//           System.out.println();
//        }
//    }
//}
//
//*********************************************************************************************************************
//// 7)Take 20 integer inputs from user and print the following:
//// Check the number is positive
//// negative
//// odd
//// even
//
//
//positive number
//
//import java.util.*;
//
//public class Ab {
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
//            if (a[i] > 0) {
//                System.out.println(a[i]);
//            }
//        }
//    }
//}
//********************************************************************************************************************
//nagative number
//
//import java.util.*;
//public class Ab {
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
//            if (a[i] < 0) {
//                System.out.println(a[i]);
//            }
//        }
//    }
//}
//********************************************************************************************************************
//even number
//import java.util.*;
//public class Ab {
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
//            if (a[i]%2 == 0) {
//                System.out.println(a[i]);
//            }
//        }
//    }
//}
//
//*********************************************************************************************************************
//odd number
//
//import java.util.*;
//public class Ab {
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
//
//*******************************************************************************************************************
//12)
//Take 20 integer inputs from user and print the following:
//number of positive numbers
//number of negative numbers
//number of odd numbers
//number of even numbers
//number of 0s.
//
//number of positive numbers
//number of negative numbers
//
//
//import java.util.*;
//
//public class Ab {
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
//            if (a[i] > 0) {
//                System.out.println("Number is positive: "+a[i]);
//            }
//            if (a[i] < 0) {
//                System.out.println("Number is nagative: "+a[i]);
//            }
//        }
//    }
//}
//
//number of odd numbers
//number of even numbers
//
//
//import java.util.*;
//
//public class Ab {
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
//            if (a[i]%2 == 0) {
//                System.out.println("Number is even: "+a[i]);
//            }
//            if (a[i]%2 != 0) {
//                System.out.println("Number is odd: "+a[i]);
//            }
//        }
//    }
//}
//
//
//Q 13Find smallest number in array
//
//
//import java.util.*;
//
//public class Ab {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter arry size: ");
//        int size = sc.nextInt();
//        int a[] = new int[size];
//        int min = Integer.MAX_VALUE;
//
//        for (int i = 0; i < size; i++) {
//            a[i] = sc.nextInt();
//        }
//
//        for (int i = 0; i < a.length; i++) {
//            if(min > a[i])
//            {
//                min = a[i];
//            }
//        }
//        System.out.println("min value: "+ min);
//    }
//}
//
//
//Q 14.Addition of two array in java
//
//public class Ab{
//    public static void main(String[] args)
//    {
//        int a[] = {12,21,13,22,33};
//        int b[] = {12,121,33,22,11};
//        int sum = 0;
//        for(int i=0;i<a.length;i++)
//        {
//            sum+=a[i];
//        }
//        for(int i=0;i<b.length;i++)
//        {
//            sum+=b[i];
//        }
//        System.out.println(sum);
//    }
//}
//
//Q 15write duplicate element in java
//import java.util.*;
//
//public class Main {
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
//            for(int j=0;j<a.length;j++)
//            {
//                if(a[i] == a[j] && i!=j)
//                {
//                    System.out.println("duplicate number is:"+a[i]);
//                }
//
//            }
//        }
//    }
//}
//
//import java.util.Scanner;
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the size of array");
//        int size = sc.nextInt();
//        int a[] = new int[size];
//        int b[] = new int[size];
//        System.out.println("enter the numbers for a array");
//        for (int i = 0; i < size; i++) {
//            a[i] = sc.nextInt();
//        }
//        System.out.println("enter the number for second array");
//        {
//            for (int i= 0; i< size; i++) {
//                b[i] = sc.nextInt();
//            }
//            System.out.println("Addition of an array ");
//            for (int i= 0; i< size; i++){
//                System.out.print((a[i] + b[i]));
//            }
//        }
//    }
//}

//import java.util.*;
