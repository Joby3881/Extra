//public class Main {
//    static void printArray(char[] a) {
//        for (int i = 0; i < a.length; i++) {
//            System.out.print(a[i] + " ");
//        }
//    }
//    public static void main(String[] args) {
//        int a[] = { 1, 2, 3, 4, 5 };
//        // printArray(a);
//        float arr1[] = { 1.2f, 1.3f, 5.6f, 7.8f };
//        // printArray(arr1);
//        String arr2[] = { "hello", "hiii", "bye " };
//        // printArray(arr2);
//        char arr3[] = { 'e', 'u', 'w' };
//        printArray(arr3);
//    }
//}
//constant char.
//public class Main {
//    static void printArray(char[] a) {
//        for (int i = 0; i < a.length; i++) {
//            System.out.print(a[i] + " ");
//        }
//    }
//    public static void main(String[] args) {
//
//        char arr3[] = { 'j', 'u', 'w' };
//        printArray(arr3);
//    }
//}
//constant String
//public class Main {
//    public static void printArray(String[] a) {
//        for(int i=0;i<a.length;i++){
//            System.out.println(a[i] +" ");
//        }
//    }
//    public static void main(String[] args){
//        String arry1[]= { "hello" , " hai" , "bye"};
//        printArray(arry1);
//    }
//}
//constant int
//public class Main {
//    static void printArray(int [] a) {
//        for (int i = 0; i < a.length; i++) {
//            System.out.print(a[i] + " ");
//        }
//    }
//    public static void main(String[] args) {
//
//        int arr2[] = { 1, 2 ,3 };
//        printArray(arr2);
//    }
//}
//
//constant float
//public class Main {
//    static void printArray(float [] a) {
//        for (int i = 0; i < a.length; i++) {
//            System.out.print(a[i] + " ");
//        }
//    }
//    public static void main(String[] args) {
//
//        float arry[] = { 1.1f, 2.3f ,3.1f };
//        printArray(arry);
//    }
//}
//constant double
//public class Main {
//    static void printArray(double [] a) {
//        for (int i = 0; i < a.length; i++) {
//            System.out.print(a[i] + " ");
//        }
//    }
//    public static void main(String[] args) {
//
//        double arry1[] = { 1.23, 2.11 ,3.12 };
//        printArray(arry1);
//    }
//}
//
//constant short
//public class Main {
//    static void printArray(short [] a) {
//        for (int i = 0; i < a.length; i++) {
//            System.out.print(a[i] + " ");
//        }
//    }
//    public static void main(String[] args) {
//
//        short arry2[] = { 3, 2 ,4 };
//        printArray(arry2);
//    }
//}
//
//constant byte
//public class Main {
//    static void printArray(byte [] a) {
//        for (int i = 0; i < a.length; i++) {
//            System.out.print(a[i] + " ");
//        }
//    }
//    public static void main(String[] args) {
//
//        byte arry3[] = { 1, 2 ,3 };
//        printArray(arry3);
//    }
//}
//Dynamic through new***************************************************************************************************
//public class Main {
//    static void printArray(int[] a) {
//        for (int i = 0; i < a.length; i++) {
//            System.out.print(a[i] + " ");
//        }
//        System.out.println();
//    }
//
//    static void printArray1(float[] a) {
//        for (int i = 0; i < a.length; i++) {
//            System.out.print(a[i] + " ");
//        }
//        System.out.println();
//    }
//
//    public static void main(String[] args) {
//        int a[] = new int[5];
//        a[0] = 56;
//        a[1] = 67;
//        a[2] = 1;
//        a[3] = 12;
//        a[4] = 9;
//        printArray(a);
//        float[] arr1 = new float[3];
//        arr1[0] = 7.8f;
//        arr1[1] = 3.4f;
//        arr1[2] = 1.2f;
//        printArray1(arr1);
//    }
//}
//Dynamic through new int
//public class Main {
//    static void printArray(int[] a) {
//        for (int i = 0; i < a.length; i++) {
//            System.out.print(a[i] + " ");
//        }
//        System.out.println();
//    }
//
//
//    public static void main(String[] args) {
//        int a[] = new int[5];
//        a[0] = 56;
//        a[1] = 67;
//        a[2] = 1;
//        a[3] = 12;
//        a[4] = 9;
//        printArray(a);
//    }
//}
//Dynamic through new short
//public class Main {
//    static void printArray(short[] a) {
//        for (int i = 0; i < a.length; i++) {
//            System.out.print(a[i] + " ");
//        }
//        System.out.println();
//    }
//    public static void main(String[] args) {
//        short a[] = new short[5];
//        a[0] = 26;
//        a[1] = 20;
//        a[2] = 1;
//        a[3] = 12;
//        a[4] = 9;
//        printArray(a);
//    }
//}
//dynamic though byte
//public class Main {
//    static void printArray(byte[] a) {
//        for(int i=0; i<a.length; i++){
//            System.out.println(a[i]+ " ");
//        }
//        System.out.println();
//    }
//    public static void main(String[] args){
//    byte a[]=new byte[5];
//    a[0]=11;
//    a[1]=12;
//    a[2]=13;
//    a[3]=14;
//    a[4]=15;
//    printArray(a);
//    }
//}
//Dynamic through new float
//public class Main {
//    static void printArray(float[] a) {
//        for (int i = 0; i < a.length; i++) {
//            System.out.println(a[i] + " ");
//        }
//        System.out.println();
//    }
//    public static void main(String[] args) {
//        float a[] = new float[5];
//        a[0] = 2.3f;
//        a[1] = 3.2f;
//        a[2] = 4.5f;
//        a[3] = 5.3f;
//        a[4] = 5.2f;
//        printArray(a);
//    }
//}
//Dynamic through new double
//public class Main {
//    static void printArray(double[] a) {
//        for (int i = 0; i < a.length; i++) {
//            System.out.print(a[i] + " ");
//        }
//        System.out.println();
//    }
//    public static void main(String[] args) {
//        double a[] = new double[5];
//        a[0] = 23.12;
//        a[1] = 67.23;
//        a[2] = 15.11;
//        a[3] = 12.16;
//        a[4] = 92.21;
//        printArray(a);
//    }
//}
//Dynamic through new char
//public class Main {
//    static void printArray(char[] a) {
//        for (int i = 0; i < a.length; i++) {
//            System.out.print(a[i] + " ");
//        }
//        System.out.println();
//    }
//    public static void main(String[] args) {
//        char a[] = new char[4];
//        a[0] = 'J';
//        a[1] = 'O';
//        a[2] = 'B';
//        a[3] = 'Y';
//        printArray(a);
//    }
//}
//Dynamic through new String
//public class Main {
//    static void printArray(String[] a) {
//        for (int i = 0; i< a.length; i++) {
//            System.out.print(a[i] + " ");
//        }
//        System.out.println();
//    }
//    public static void main(String[] args) {
//        String a[] = new String[5];
//        a[0] = "You";
//        a[1] = "i'll";
//        a[2] = "Never";
//        a[3] = "Walk";
//        a[4] = "alone";
//        printArray(a);
//    }
//}
//
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter size :");
//        int size = sc.nextInt();
//        int a[] = new int[size];
//        System.out.println("enter the array number ");
//        for (int i = 0; i < size; i++) {
//            a[i] = sc.nextInt();
//        }
//        System.out.println("enter numbers are :");
//        for (int i = 0; i < a.length; i++) {
//            System.out.print(a[i] + " ");
//        }
//    }
//}
//user input int
//import java.util.*;
//public class Main {
//    static void printArray(int[] a) {
//        for (int i = 0; i < a.length; i++) {
//            System.out.print(a[i] + " ");
//        }
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter the size of array ");
//        int size = sc.nextInt();
//        // dynamic array
//        int arr1[] = new int[size];
//        // loop used for user input
//        for (int i = 0; i < size; i++) {
//            arr1[i] = sc.nextInt();
//        }
//        System.out.println("this is a arr1 ");
//        // for output
//        for (int j = 0; j < size; j++) {
//            System.out.print(arr1[j] + " ");
//        }
//        }
//    }
//user input short
//import java.util.*;
//public class Main {
//    static void printArray(short[] a) {
//        for (short i = 0; i < a.length; i++) {
//            System.out.print(a[i] + " ");
//        }
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter the size of array ");
//         short size = sc.nextShort();
//        short arr1[] = new short[size];
//        for (short i = 0; i < size; i++) {
//            arr1[i] = sc.nextShort();
//        }
//        System.out.println("this is a arr1 ");
//        // for output
//        for (short j = 0; j < size; j++) {
//            System.out.print(arr1[j] + " ");
//        }
//        }
//    }
//user input byte
//import java.util.*;
//public class Main {
//    static void printArray(byte[] a) {
//        for (int i = 0; i < a.length; i++) {
//            System.out.print(a[i] + " ");
//        }
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter the size of array ");
//        byte size = sc.nextByte();
//        // dynamic array
//        byte arr1[] = new byte[size];
//        // loop used for user input
//        for (byte i = 0; i < size; i++) {
//            arr1[i] = sc.nextByte();
//        }
//        System.out.println("this is a arr1 ");
//        // for output
//        for (byte j = 0; j < size; j++) {
//            System.out.print(arr1[j] + " ");
//        }
//        }
//    }
//user input float
//import java.util.*;
//public class Main {
//
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter the size of array ");
//        int size =sc.nextInt();
//        // dynamic array
//        float arr1[] = new float[size];
//        // loop used for user input
//        for (int i = 0; i < size; i++) {
//            arr1[i] = sc.nextFloat();
//        }
//        System.out.println("this is a arr1 ");
//        // for output
//        for (int j = 0; j < size; j++) {
//            System.out.print(arr1[j] + " ");
//        }
//        }
//    }
//user input double
//import java.util.*;
//public class Main {
//
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter the size of array ");
//        int size =sc.nextInt();
//        // dynamic array
//        double arr1[] = new double[size];
//        // loop used for user input
//        for (int i = 0; i < size; i++) {
//            arr1[i] = sc.nextDouble();
//        }
//        System.out.println("this is a arr1 ");
//        // for output
//        for (int j = 0; j < size; j++) {
//            System.out.print(arr1[j] + " ");
//        }
//        }
//    }
//user input char
//import java.util.*;
//public class Main {
//
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter the size of array ");
//        int size =sc.nextInt();
//        // dynamic array
//        char arr1[] = new char[size];
//        // loop used for user input
//        for (int i = 0; i < size; i++) {
//            arr1[i] = sc.next().charAt(0);
//        }
//        System.out.println("this is a arr1 ");
//        // for output
//        for (int j = 0; j < size; j++) {
//            System.out.print(arr1[j] + " ");
//        }
//        }
//    }
//
//user input String
//import java.util.*;
//public class Main {
//
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter the size of array ");
//        int size =sc.nextInt();
//        // dynamic array
//        String arr1[] = new String[size];
//        // loop used for user input
//        for (int i = 0; i < size; i++) {
//            arr1[i] = sc.nextLine();
//        }
//        System.out.println("this is a arr1 ");
//        // for output
//        for (int j = 0; j < size; j++) {
//            System.out.print(arr1[j] + " ");
//        }
//        }
//    }
////user input int copy************************************************************************************************
//import java.util.*;
//
//public class Main {
//  static void printArray(int[] a) {
//    for (int i = 0; i < a.length; i++) {
//      System.out.print(a[i] + " ");
//    }
//  }
//  public static void main(String[] args) {
//    Scanner sc = new Scanner(System.in);
//    System.out.println("enter the size of array ");
//    int size = sc.nextInt();
//    // dynamic array
//    int arr1[] = new int[size];
//    // loop used for user input
//    for (int i = 0; i < size; i++) {
//      arr1[i] = sc.nextInt();
//    }
//    System.out.println("this is a arr1 ");
//    // for output
//    for (int j = 0; j < size; j++) {
//      System.out.print(arr1[j] + " ");
//    }
//    System.out.println();
//    System.out.println("------------------------------------");
//    int arr2[] = arr1;
//    printArray(arr2);
//  }
//}
//user input copy of byte
//import java.util.*;
//public class Main {
//  static void printArray(byte[] a) {
//    for (int i = 0; i < a.length; i++) {
//      System.out.print(a[i] + " ");
//    }
//  }
//  public static void main(String[] args) {
//    Scanner sc = new Scanner(System.in);
//    System.out.println("enter the size of array ");
//    int size = sc.nextInt();
//    // dynamic array
//    byte arr1[] = new byte[size];
//    // loop used for user input
//    for (int i = 0; i < size; i++) {
//      arr1[i] = sc.nextByte();
//    }
//    System.out.println("this is a arr1 ");
//    // for output
//    for (int j = 0; j < size; j++) {
//      System.out.print(arr1[j] + " ");
//    }
//    System.out.println();
//    System.out.println("---------------------");
//    byte arr2[] = arr1;
//    printArray(arr2);
//  }
//}
//user input copy of byte
//import java.util.*;
//public class Main {
//  static void printArray(short[] a) {
//    for (int i = 0; i < a.length; i++) {
//      System.out.print(a[i] + " ");
//    }
//  }
//  public static void main(String[] args) {
//    Scanner sc = new Scanner(System.in);
//    System.out.println("enter the size of array ");
//    int size = sc.nextInt();
//    // dynamic array
//    short arr1[] = new short[size];
//    // loop used for user input
//    for (int i = 0; i < size; i++) {
//      arr1[i] = sc.nextByte();
//    }
//    System.out.println("this is a arr1 ");
//    // for output
//    for (int j = 0; j < size; j++) {
//      System.out.print(arr1[j] + " ");
//    }
//    System.out.println();
//    System.out.println("---------------------");
//    short arr2[] = arr1;
//    printArray(arr2);
//  }
//}
//user input copy of float
//import java.util.*;
//public class Main {
//  static void printArray(float[] a) {
//    for (int i = 0; i < a.length; i++) {
//      System.out.print(a[i] + " ");
//    }
//  }
//  public static void main(String[] args) {
//    Scanner sc = new Scanner(System.in);
//    System.out.println("enter the size of array ");
//    int size = sc.nextInt();
//    // dynamic array
//    float arr1[] = new float[size];
//    // loop used for user input
//    for (int i = 0; i < size; i++) {
//      arr1[i] = sc.nextFloat();
//    }
//    System.out.println("this is a arr1 ");
//    // for output
//    for (int j = 0; j < size; j++) {
//      System.out.print(arr1[j] + " ");
//    }
//    System.out.println();
//    System.out.println("---------------------");
//    float arr2[] = arr1;
//    printArray(arr2);
//  }
//}
//user input copy of double
//import java.util.*;
//public class Main {
//  static void printArray(double[] a) {
//    for (int i = 0; i < a.length; i++) {
//      System.out.print(a[i] + " ");
//    }
//  }
//  public static void main(String[] args) {
//    Scanner sc = new Scanner(System.in);
//    System.out.println("enter the size of array ");
//    int size = sc.nextInt();
//    // dynamic array
//    double arr1[] = new double[size];
//    // loop used for user input
//    for (int i = 0; i < size; i++) {
//      arr1[i] = sc.nextDouble();
//    }
//    System.out.println("this is a arr1 ");
//    // for output
//    for (int j = 0; j < size; j++) {
//      System.out.print(arr1[j] + " ");
//    }
//    System.out.println();
//    System.out.println("---------------------");
//    double arr2[] = arr1;
//    printArray(arr2);
//  }
//}
//user input copy of float
//import java.util.*;
//public class Main {
//  static void printArray(float[] a) {
//    for (int i = 0; i < a.length; i++) {
//      System.out.print(a[i] + " ");
//    }
//  }
//  public static void main(String[] args) {
//    Scanner sc = new Scanner(System.in);
//    System.out.println("enter the size of array ");
//    int size = sc.nextInt();
//    // dynamic array
//    float arr1[] = new float[size];
//    // loop used for user input
//    for (int i = 0; i < size; i++) {
//      arr1[i] = sc.nextByte();
//    }
//    System.out.println("this is a arr1 ");
//    // for output
//    for (int j = 0; j < size; j++) {
//      System.out.print(arr1[j] + " ");
//    }
//    System.out.println();
//    System.out.println("---------------------");
//    float arr2[] = arr1;
//    printArray(arr2);
//  }
//}
//User input copy of char
//import java.util.*;
//public class Main {
//  static void printArray(char[] a) {
//    for (int i = 0; i < a.length; i++) {
//      System.out.print(a[i] + " ");
//    }
//  }
//  public static void main(String[] args) {
//    Scanner sc = new Scanner(System.in);
//    System.out.println("enter the size of array ");
//    int size = sc.nextInt();
//    // dynamic array
//    char arr1[] = new char[size];
//    // loop used for user input
//    for (int i = 0; i < size; i++) {
//      arr1[i] = sc.next().charAt(0);
//    }
//    System.out.println("this is a arr1 ");
//    // for output
//    for (int j = 0; j < size; j++) {
//      System.out.print(arr1[j] + " ");
//    }
//    System.out.println();
//    System.out.println("---------------------");
//    char arr2[] = arr1;
//    printArray(arr2);
//  }
//}
//User input copy of char
//import java.util.*;
//public class Main {
//  static void printArray(String[] a) {
//    for (int i = 0; i < a.length; i++) {
//      System.out.print(a[i] + " ");
//    }
//  }
//  public static void main(String[] args) {
//    Scanner sc = new Scanner(System.in);
//    System.out.println("enter the size of array ");
//    int size = sc.nextInt();
//    // dynamic array
//    String arr1[] = new String[size];
//    // loop used for user input
//    for (int i = 0; i < size; i++) {
//      arr1[i] = sc.nextLine();
//    }
//    System.out.println("this is a arr1 ");
//    // for output
//    for (int j = 0; j < size+1; j++) {
//      System.out.print(arr1[j] + " ");
//    }
//    System.out.println();
//    System.out.println("---------------------");
//    String arr2[] = arr1;
//    printArray(arr2);
//  }
//}
//
