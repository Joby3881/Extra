//1.
//class A{
//    A(){
//        System.out.println(" constractor");
//    }
//    {
//        System.out.println("anoniymous");
//    }
//    static{
//        System.out.println("static block");
//    }
//}
//public class Main {
//    public static void main(String[] args) {
//        new A();
//    }
//}
//o/p:static block
//anoniymous
// constractor

//2.
//class A{
//    A(){
//        System.out.println(" constractor");
//    }
//    static{
//        System.out.println("static block");
//    }
//    {
//        System.out.println("anoynimous");
//    }
//}
//public class Main {
//    public static void main(String[] args) {
//        new A();
//    }
//}
//static block
//anoynimous
// constractor

//3.
//class A{
//
//    {
//        System.out.println("anoynimous");
//    }
//    static{
//        System.out.println("static block");
//    }
//    A(){
//        System.out.println(" constractor");
//    }
//}
//public class Main {
//    public static void main(String[] args) {
//        new A();
//    }
//}
//O/P:static block
//    anoynimous
//    constractor

//4.
//class A{
//    static{
//        System.out.println("static block");
//    }
//    A(){
//        System.out.println("constractor");
//    }
//    {
//        System.out.println("anoynimous");
//    }
//}
//public class Main {
//    public static void main(String[] args) {
//        new A();
//    }
//}
//o/p:static block
//anoynimous
//constractor


//class A{
//     class B{
//        void f(){
//            System.out.println("message");
//        }
//    }
//}
//public class Main {
//    public static void main(String[] args) {
//        new A().new B().f();
//    }
//}

//1.Outer class is non static and inner class is static but method is non static.
//class A{
//    static class B{
//       static void f(){
//            System.out.println("message");
//        }
//    }
//}
//public class Main {
//    public static void main(String[] args) {
//         A.B.f();
//    }
//}
//O/P: non-static method f() cannot be referenced from a static context.error

//2.outer class static and non static inner class and non static method.

//static class A{
//    class B{
//        void f(){
//            System.out.println("message");
//        }
//    }
//}
//public class Main {
//    public static void main(String[] args) {
//        A.B.f();
//    }
//}
//o/p=modifier static not allowed here.

//3.outer class static and inner class non static and method is static.
//static class A{
//    class B{
//        static void f(){
//            System.out.println("message");
//        }
//    }
//}
//public class Main {
//    public static void main(String[] args) {
//        A.B.f();
//    }
//}
//o/p:  Static declarations in inner classes are not supported at language level '8' and modifier static not allowed here.

//4.outer class static and inner class static but method static.
//static class A{
//    static class B{
//        static void f(){
//            System.out.println("message");
//        }
//    }
//}
//public class Main {
//    public static void main(String[] args) {
//        A.B.f();
//    }
//}
//o/p: qualified new of static class.

//5.outer class static and inner class non static and method non static but outer class method non static.
//static class A{
//   static void k(){
//        System.out.println("hello");
//    }
//    class B{
//        void f(){
//            System.out.println("message");
//        }
//    }
//}
//public class Main {
//    public static void main(String[] args) {
//        new A().k();
//        A.B.f();
//    }
//}
//o/p: modifier static not allowed here.

//1.(A) static adition constant.
//class A{
//    static int a=10, b=15;
//    static void display(){
//        System.out.println(a+b);
//    }
//}
//public class Main {
//    public static void main(String[] args) {
//        A.display();
//    }
//}
//o/p:25.
//note: Static declarations in inner classes are not supported at language level '8'.


//1.b. class parent
// void show()
// four variable : static add

// output :
// a)constant
// b)user input

//class Parent{
//    static int a = 10;
//    static int b = 20;
//    static int c = 30;
//    static int d = 40;
//
//    void show(){
//        int j = a+b+c+d;
//        System.out.print(j);
//    }
//}
//public class Main
//{
//    public static void main(String[] args) {
//
//        new Parent().show();
//    }
//}

//1.c. static variable are in the method by User input.
//import java.util.*;
//class Parent {
//    static Scanner sc = new Scanner (System.in);
//
//    static int a = sc.nextInt();
//    static int b = sc.nextInt();
//    static int c = sc.nextInt();
//    static int d = sc.nextInt();
//
//    void show ()
//    {
//        int j = a+b+c+d;
//        System.out.println(j);
//    }
//    void show1 ()
//    {
//        int k = a+b+c+d;
//        System.out.println(k);
//    }
//}
//    public class Main
//{
//    public static void main(String[] args) {
//
//        Parent k=new Parent();
//        k.show();
//        k.show1();
//    }
//}

//3.a. class parent
// static void show()
// four variable : static add
// static void show1 ()
// four variable : static add
// a)constant

//class Parent{
//    static int a = 1;
//    static int b = 2;
//    static int c = 3;
//    static int d = 4;
//
//    static void show(){
//        int j = a+b+c+d;
//        System.out.println(j);
//    }
//    static void show1(){
//        int k = a+b+c+d;
//        System.out.println(k);
//    }
//}
//public class Main
//{
//    public static void main(String[] args) {
//
//        Parent k = new Parent();
//        k.show();
//        k.show1();
//    }
//}

//3.b.user input
//
//import java.util.*;
//class Parent
//{
// static Scanner sc = new Scanner (System.in);
//
//  static int a = sc.nextInt();
//  static int b = sc.nextInt();
//  static int c = sc.nextInt();
//  static int d = sc.nextInt();
//
//
//  void show ()
//  {
//    int j= a + b + c + d;
//      System.out.println(j);
//  }
//}
//
//public class Main
//{
//  public static void main (String[]args)
//  {
//
//    Parent k = new Parent();
//      k.show();
//  }
//}
//

//3.c.user input
//
//import java.util.*;
//class Parent
//{
// static Scanner sc = new Scanner (System.in);
//
//  static int a = sc.nextInt();
//  static int b = sc.nextInt();
//  static int c = sc.nextInt();
//  static int d = sc.nextInt();
//
//
//  void show ()
//  {
//    int j= a + b + c + d;
//      System.out.println(j);
//  }
//  void show1 ()
//  {
//    int k= a + b + c + d;
//    System.out.println(k);
//  }
//}
//
//public class Main
//{
//  public static void main (String[]args)
//  {
//
//    Parent k = new Parent();
//      k.show();
//      k.show1();
//  }
//}


//4. class parent
// void show()
// four variable : static add
// void show1 ()
// four variable : static add
// output :
//4. a)constant
//class Parent{
//    static int a = 10;
//    static int b = 20;
//    static int c = 30;
//    static int d = 40;
//
//    static void show(){
//        int j = a+b+c+d;
//        System.out.println(j);
//    }
//    static void show1(){
//        int j = a+b+c+d;
//        System.out.println(j);
//    }
//}
//public class Main
//{
//    public static void main(String[] args) {
//
//        Parent k = new Parent();
//        k.show();
//        k.show1();
//    }
//}

//4.b.user input
//import java.util.*;
//class Parent{
//    static Scanner sc = new Scanner(System.in);
//    static int a = sc.nextInt();
//    static int b = sc.nextInt();
//    static int c = sc.nextInt();
//    static int d = sc.nextInt();
//
//    static void show(){
//        int j = a+b+c+d;
//        System.out.println(j);
//    }
//    static void show1(){
//        int k = a+b+c+d;
//        System.out.println(k);
//    }
//}
//public class Main
//{
//    public static void main(String[] args) {
//
//        Parent k = new Parent();
//        k.show();
//        k.show1();
//    }
//}


//class Employee{
//    int empid;
//    String name;
//   static String company="Smart programming";
//    Employee(int empid, String name){
//        this.empid=empid;
//        this.name=name;
//    }
//
//    void display(){
//        System.out.println(empid+" "+name+" "+company);
//    }
//}
//public class Main {
//    public static void main(String[] args) {
//        Employee e1=new Employee(101, "amit");
//        e1.display();
//        Employee e2=new Employee(102,"Deepak");
//        e2.display();
//    }
//}
//
//o/p: A common word have any object it makes static then it memory occupancy can save from the hip area and then the
//     common word memory will allocate anywhere in the class or method area.




