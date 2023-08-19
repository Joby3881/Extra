
//1)Compute Sum and Average of Array Elements
//public class Main {
//    public static void main(String[] args) {
//     int a[]=new int[]{10,20,30,40};
//     int sum=0;
//
//     for(int i=0;i<a.length;i++){
//         sum+=a[i];
//     }
//        System.out.println("Sum ops an array is :" +sum);
//        System.out.println("Average of an array" +sum/4);
//    }
//}
//2)Find Length of Array in Java
//import java.util.Scanner;
//public  class Main {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("enter a the size of an array");
//        int size=sc.nextInt();
//        int a[]=new int[size];
//        System.out.print("enter the array numbers :");
//
//        for(int i=0;i<a.length;i++){
//            a[i]=sc.nextInt();
//        }
//        System.out.println("Length of an array is :" +size);
//    }
//}
//3)Get Array Input in Java
//import java.util.Scanner;
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("enter the array size");
//        int size=sc.nextInt();
//        int a[]=new int[size];
//        System.out.println("enter the numbers in array");
//        for(int i=0;i<size;i++){
//            a[i]=sc.nextInt();
//        }
//        for(int i=0;i<size;i++){
//            System.out.print(a[i]+" ");
//        }
//    }
//}
//4)Sum of Two Arrays Elements
//a[]
//b[]
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("enter the array size for both array");
//        int size=sc.nextInt();
//        int a[]=new int[size];
//        int b[]=new int[size];
//        System.out.println("enter the number for a array");
//        for(int i=0;i<size;i++){
//            a[i]=sc.nextInt();
//        }
//        System.out.println("enter the number for b array");
//        for(int i=0;i<size;i++){
//            b[i]=sc.nextInt();
//        }
//        System.out.print("The sum of an array is :");
//        for(int i=0;i<size;i++){
//            System.out.print( a[i]+b[i] +" ");
//        }
//    }
//}

//5) Take 10 integer inputs from user and store them in an array. Again ask user to give a number.
// Now, tell user whether that number is present in array or not. which?

//import java.util.*;
//public class Main{
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("enter a number you want compare");
//        int num=sc.nextInt();
//        System.out.println("enter the array size");
//        int size=sc.nextInt();
//        int a[]=new int[size];
//        System.out.println("enter the array's numbers");
//        for(int i=0;i<size;i++){
//            a[i]=sc.nextInt();
//        }
//        for(int i=0;i<a.length;i++){
//            if(a[i]==num){
//                System.out.println(" This number Present");
//            }
//            else{
//                System.out.println("This number not present");
//            }
//        }
//    }
//}

//6.Find even numbers in array

//import java.util.Scanner;
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("enter the size of an array");
//         int size=sc.nextInt();
//         int a[]=new int[size];
//        System.out.println("enter the integers");
//        for(int i=0;i<size;i++){
//            a[i]=sc.nextInt();
//        }
//        System.out.print("the even numbers are : ");
//        for(int i=0;i<a.length;i++){
//            if(a[i]%2==0){
//                System.out.print(a[i] +" ");
//            }
//        }
//    }
//}
//7.Find odd numbers in array
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("enter the array size");
//        int size=sc.nextInt();
//        int a[]=new int[size];
//        System.out.println("enter the integer");
//        for(int i=0;i<size;i++){
//            a[i]=sc.nextInt();
//        }
//        System.out.println("the odd numbers are :");
//        for(int i=0;i<a.length;i++){
//          if(a[i]%2==1) {
//              System.out.print(a[i] +" ");
//          }
//        }
//    }
//}

//8.take 10 integer inputs from user and store them in an array and print them on screen
//how?
//import java.util.Scanner;
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("enter the size of an array :");
//        int size=sc.nextInt();
//        int a[]=new int[size];
//        System.out.print("enter the integers of in the array");
//        for(int i=0;i<size;i++){
//            a[i]=sc.nextInt();
//        }
//        System.out.print("the array numbers are :");
//        for(int i=0;i<a.length;i++){
//            System.out.println(a[i]);
//        }
//    }
//}

//9.Find number max in array
//import java.util.*;
//public class Main {
//    public static void main(String[] args) {
//       Scanner sc=new Scanner(System.in);
//        System.out.println("enter the size of an array");
//        int size=sc.nextInt();
//        int a[]=new int[size];
//        int max= Integer.MIN_VALUE;
//
//        System.out.println("enter the number of an array");
//        for(int i=0;i<size;i++){
//            a[i]=sc.nextInt();
//        }
//
//        for(int i=0;i<a.length;i++){
//                if(a[i]>max){
//                    max=a[i];
//                }
//        }
//        System.out.println("Maximum value is :" +max);
//
//    }
//
//}

//9.Find table of every element in array
//import java.util.Scanner;
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("enter the size of an array");
//        int size=sc.nextInt();
//        int a[]=new int[size];
//
//        System.out.println("enter the array numbers");
//        for(int i=0;i<size;i++){
//            a[i]=sc.nextInt();
//        }
//        for(int i=0;i<a.length;i++){
//            for(int j=1;j<=10;j++){
//                System.out.println(a[i]*j);
//            }
//            System.out.println();
//        }
//    }
//}

//10.positive number of an array
//import java.util.*;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter array size: ");
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
//

//11.negative number of an array
//import java.util.Scanner;
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("enter the size of an array");
//        int size=sc.nextInt();
//        int a[]=new int[size];
//        System.out.println("enter the values of an array");
//        for(int i=0;i<size;i++){
//            a[i]=sc.nextInt();
//        }
//        for(int i=0;i<a.length;i++){
//            if(a[i]<0){
//                System.out.println(a[i]);
//            }
//        }
//
//    }
//}
//12.Find smallest number in array
//import java.util.*;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter array size: ");
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

//13.import java.util.Scanner;
// Find Length of Array in Java
//import java.util.Scanner;
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("enter the size of an array");
//        int size=sc.nextInt();
//        int a[]=new int[size];
//        int count=0;
//
//        System.out.println("enter the number of an array");
//        for(int i=0;i<size;i++) {
//            a[i]=sc.nextInt();
//            count++;
//        }
//        System.out.print("count is : ");
//        for(int i=0;i<a.length;i++){
//        }
//        System.out.println( +count);
//    }
//}
//14.find last occurrence of duplicate element in array ? by user input
//import java.util.Scanner;
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("enter a number");
//        int num=sc.nextInt();
//
//        System.out.println("enter the size of an array");
//        int size=sc.nextInt();
//        int a[]=new int[size];
//        int count=0;
//
//        for(int i=0;i<size;i++){
//            a[i]=sc.nextInt();
//        }
//        System.out.print("Duplicate elements are :");
//        for(int i=0;i<a.length;i++){
//            if(a[i]==num) {
//                count++;
//            }
//        }
//        System.out.println(count);
//    }
//}

//iss program se how much duplicate element hai ya nahi check kar sakte hai.
//import java.util.Scanner;
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("enter a number");
//        int num=sc.nextInt();
//
//        System.out.println("enter the size of an array");
//        int size=sc.nextInt();
//        int a[]=new int[size];
//        int count=0;
//
//        for(int i=0;i<size;i++){
//            a[i]=sc.nextInt();
//        }
//        System.out.print("Duplicate elements are :");
//        for(int i=0;i<a.length;i++){
//            if(a[i]==num) {
//                count=i;
//                //break; agar first duplicate element chahiye tho Break use.
//            }
//        }
//        System.out.println(count);
//    }
//}
//
