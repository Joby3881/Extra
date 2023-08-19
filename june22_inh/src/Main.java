import java.util.Scanner;

//1.single leavel inheritance
//class A{
//    void parent(){
//        System.out.println("this is class a");
//    }
//}
//class B {
//    void parent(){
//        System.out.println("this is class b");
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);

//       A a=new A();
//       a.parent();
//       B b=new B();
//       b.parent();
//
//    }
//}

//2.multileavel inheritance.
//class A
//{
//    void first1()
//    {
//        System.out.println("Class A");
//    }
//}
//class B extends A
//{
//    void first2()
//    {
//        System.out.println("Class B");
//    }
//}
//class C extends B{
//    void first3()
//    {
//        System.out.println("Class C");
//    }
//}
//public class Main{
//    public static void main(String[] args) {
//        C s=new C();
//        s.first1();
//        s.first2();
//        s.first3();
//    }
//}

//3.Herarical inheritance.
//class A{
//    void showA()
//    {
//        System.out.println("Super class A");
//    }
//}
//class B extends A {
//    void showB()
//    {
//        System.out.println("Sub class of A");
//    }
//}
//class C extends A{
//    void showC()
//    {
//        System.out.println("C is sub class of a");
//    }
//}
//public class Main {
//    public static void main(String[] args) {
//        B b = new B();
//        b.showA();
//        b.showB();
//        C c = new C();
//        c.showA();
//        c.showC();
//    }
//}


//       public class Main{
//    public static void main(String[] args)
//    {
//        int n = 1;
//        for (int i = 1; i <= 5; i++)
//        {
//            {
//                for (int j =5; j >=i; j--)
//                {
//
//                    System.out.print(n);
//                    n++;
//
//                }
//
//            }
//            System.out.println();
//
//        }
//
//    }
//}

//public class Main {
//    public static void main(String[] args) {
//        int rem,sum=0;
//        int num = 548;
//        int r,s=0;
//
//        while(num>0){
//            rem=num%10;
//            sum=sum*10+rem+1;
//            num=num/10;
//        }
//        {
//            while(sum>0){
//                r=sum%10;
//                s=s*10+r;
//                sum=sum/10;
//
//            }
//            {
//                System.out.println(s);
//            }
//
//        }
//
//    }
//}
//        System.out.println("enter row");
//int n=sc.nextInt();
//for(int i=1;i<=n+n;i+=2)
//{
//    int m=1;
//    for(int j=1;j<=i;j++){
//        if(j%2==0)
//        {
//            System.out.print("* ");
//        }
//        else {
//            System.out.print(m+" ");
//            m++;
//        }
//    }
//    System.out.println();
//}
//}
//
//}
////o/p
//// 1
//// 1 * 2
//// 1 * 2 * 3
//// 1 * 2 * 3 * 4
//
//
