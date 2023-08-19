////import java.util.Scanner;
////public class Main
////{
////    public static void main(String[] args)
////    {
////        Scanner sc=new Scanner(System.in);
////        System.out.println("enter a for male and f for female");
////        String c=sc.next();
////        switch(c.toLowerCase())
////        {
////                case "m" :
////                System.out.println("male");
////                break;
////
////            case "f":
////                    System.out.println("female");
////                    break;
////
////            default:
////                System.out.println("other");
////
////        }
////
////    }
////}
//
////}
//
//import java.util.Scanner;
//public class Main
//{
//    public static void main(String[] args)
//    {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("enter any number");
//        int a=sc.nextInt();
//        System.out.println("enter any number");
//        int b=sc.nextInt();
//        System.out.println("enter 1 for addition 2 for sub 3 for multiplication 4 for division ");
//        int ch=sc.nextInt();
//        switch (ch)
//        {
//            case 1:
//                System.out.println(a+b);
//                break;
//
//            case 2:
//                System.out.println(a-b);
//                break;
//
//            case 3:
//                System.out.println(a*b);
//                break;
//            case 4:
//                System.out.println(a/b);
//                break;
//
//        }
//
//
//    }
//}


//        0 0 0 0 0
//        1 1 1 1 1
//        0 0 0 0 0
//        1 1 1 1 1
//        0 0 0 0 0

//public class Main {
//    public static void main(String[] args) {
//        for (int i =0; i <= 4; i++) {
//            for (int j =0; j <= 4; j++) {
//                System.out.print((i % 2) + " ");
//
//            }
//
//            System.out.println();
//        }
//
//
//    }
//}



//        1 1 1 1 1
//        0 0 0 0 0
//        1 1 1 1 1
//        0 0 0 0 0
//        1 1 1 1 1

//public class Main {
//    public static void main(String[] args) {
//        for (int i = 1; i <= 5; i++) {
//            for (int j = 1; j <= 5; j++) {
//                System.out.print((i % 2) + " ");
//
//            }
//
//            System.out.println();
//        }
//
//
//    }
//}



//        1
//        0 0
//        1 1 1
//        0 0 0 0
//        1 1 1 1 1


//public class Main {
//    public static void main(String[] args) {
//        for (int i =1; i <=5; i++) {
//            for (int j =1; j <= i; j++) {
//                System.out.print((i % 2) + " ");
//
//            }
//
//            System.out.println();
//        }
//
//
//    }
//}

//        1
//        44
//        999
//        16161616

//public class Main {
//    public static void main(String[] args) {
//        for (int i =1; i <= 4; i++)
//        {
//            for (int j =1; j <= i; j++) {
//                System.out.print(i*i);
//
//            }
//
//            System.out.println();
//        }
//
//
//    }
//}
//        abcd
//        efgh
//        ijkl
//        mnop

//public class Main {
//    public static void main(String[] args) {
//        char n='a';
//        for (int i =1; i <= 4; i++)
//        {
//            for (int j =1; j <= 4; j++)
//            {
//                System.out.print(n);
//                n++;
//
//            }
//
//            System.out.println();
//        }
//
//
//    }
//}
//


//        a
//        bb
//        ccc
//        dddd

//public class Main {
//    public static void main(String[] args) {
//
//        for (char i ='a'; i <='d'; i++)
//        {
//            for (char j ='a'; j <= i; j++)
//            {
//                System.out.print(i);
//
//
//            }
//
//            System.out.println();
//        }
//
//
//    }
//}

//        a
//        ab
//        abc
//        abcd

//public class Main {
//    public static void main(String[] args) {
//
//        for (char i ='a'; i <='d'; i++)
//        {
//            for (char j ='a'; j <=i; j++)
//            {
//                System.out.print(j);
//
//
//            }
//
//            System.out.println();
//        }
//
//
//    }
//}


//10101
//01010
//10101
//01010
//10101
//public class Main {
//    public static void main(String[] args) {
//        for (int i = 1; i <= 5; i++) {
//            for (int j = 1; j <= 5; j++) {
//                if ((i + j) % 2 == 0) {
//                    System.out.print(1);
//
//                } else {
//                    System.out.print(0);
//                }
//            }
//            System.out.println();
//        }
//    }
//}

//        1 0 1 0 1
//        1 0 1 0 1
//        1 0 1 0 1
//        1 0 1 0 1
//        1 0 1 0 1

//public class Main {
//    public static void main(String[] args) {
//        for (int i = 1; i <= 5; i++) {
//            for (int j = 1; j <= 5; j++) {
//                System.out.print((i+j));
//
//            }
//
//            System.out.println();
//        }
//
//
//    }
//}

//        0 1 0 1 0
//        0 1 0 1 0
//        0 1 0 1 0
//        0 1 0 1 0
//        0 1 0 1 0

//public class Main {
//    public static void main(String[] args) {
//        for (int i = 0; i <= 4; i++) {
//            for (int j = 0; j <= 4; j++) {
//                System.out.print((j % 2) + " ");
//
//            }
//
//            System.out.println();
//        }
//
//
//    }
//}


//        0
//        1 1
//        0 0 0
//        1 1 1 1
//        0 0 0 0 0
//

//public class Main {
//    public static void main(String[] args) {
//        for (int i = 0; i <= 4; i++) {
//            for (int j = 0; j <= i; j++) {
//                System.out.print((i % 2) + " ");
//
//            }
//
//            System.out.println();
//        }
//    }
//}
// 10101
// 00000
// 10101
// 00000
//public class Main {
//    public static void main(String[] args) {
//        for (int i = 1; i <= 5; i++) {
//            for (int j = 1; j <= 5; j++) {
//                if (i % 2 == 0 && (i + j) % 2 != 0)
//                {
//                    System.out.print(1);
//                } else {
//                    System.out.print(0);
//                }
//            }
//            System.out.println();
//        }
//    }
//}

//        01010
//        00000
//        01010
//        00000
//        01010

//public class Main {
//    public static void main(String[] args) {
//        for (int i = 0; i <= 4; i++) {
//            for (int j = 0; j <= 4; j++) {
//                if (i % 2 == 0 && (i + j) % 2 != 0)
//                {
//                    System.out.print(1);
//                } else {
//                    System.out.print(0);
//                }
//            }
//            System.out.println();
//        }
//    }
//}

// *12345
// 6*78910
// 1112*1415
// 161718*20
// 21222324*

//public class Main {
//    public static void main(String[] args) {
//        int n = 1;
//        for (int i = 1; i <= 5; i++) {
//            for (int j = 1; j <= 5; j++) {
//                if (i == j)
//                {
//                    System.out.print('*');
//                } else
//                {
//                    System.out.print(n);
//                    n++;
//
//                }
//
//
//            }
//            System.out.println();
//
//
//        }
//    }
//}

// 1234*
// 123*5
// 12*45
// 1*345
// *2345

//    public class Main {
//    public static void main(String[] args)
//    {
//        for (int i = 5; i >= 1; i--)
//        {
//            for (int j = 1; j <= 5; j++)
//            {
//                if (i == j) {
//                    System.out.print('*');
//                } else {
//                    System.out.print(j);
//
//                }
//            }
//            System.out.println();
//        }
//    }
//}



//import java.util.Scanner;
//public class Main
//{
//    public static void main(String[] args)
//    {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("enter you want table");
////        int num=sc.nextInt();
//
//
//        for(int i=2;i<=10;i++) {
//            for (int j = 1; j <= 10; j++) {
//
//                System.out.println(i * j);
//
//            }
//        }
//
//
//    }
//}


//13579
//357911
//5791113
//911131517

//public class Main {
//    public static void main(String[] args) {
//
//        for (int i = 1; i <= 9; i=i+2)
//        {
//            int n=i;
//            for (int j = 1; j<=5; j++)
//            {
//                System.out.print(" "+n);
//                n=n+2;
//
//            }
//
//            System.out.println();
//        }
//
//
//    }
//}
//


//        16111621
//        27121722
//        38131823
//        49141924
//        510152025

//public class Main{
//    public static void main(String[] args) {
//
//
//        for (int i = 1; i <=5; i++)
//        {
//            int x=i;
//            for (int j= 1;j<=5; j++)
//            {
//                System.out.print(x);
//                x=x+5;
//
//            }
//            System.out.println();
//        }
//
//
//    }
//}


// multiplication table 2 to 10

//public class Main {
//    public static void main(String[] args) {
//
//
//        for (int i = 2; i <=10;i++)
//        {
//
//            for (int j= 1;j<=10; j++)
//            {
//                System.out.println(i*j);
//            }
//
//            }
//            System.out.println();
//        }
//
//
//    }
//

//        10101
//        01010
//        10101
//        01010
//        10101

//public class Main
// {
//    public static void main(String[] args) {
//        for (int i = 1; i <= 5; i++) {
//            for (int j = 1; j <= 5; j++)
//            {
//                if ((i + j) % 2 == 0)
//                {
//                    System.out.print(1);
//                } else
//                {
//                    System.out.print(0);
//                }
//
//            }
//            System.out.println();
//        }
//    }
//}



