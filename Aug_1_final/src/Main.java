//*.Note: in the final cannot be allowed a value reassign.
//public class Main{
//    public static void main(String[] args)
//    {
//        final int a=4; a=67;
//        System.out.println(a);
//    }
//}
//o/p=67;

//class A{
//    final void S(){
//        System.out.println("hello");
//    }
//}
//public class Main {
//    public static void main(String[] args) {
//        A k=new A();
//        k.S();
//    }
//}


//1)class final and method non-final output
//final class A {
//     void S() {
//        System.out.println("hello");
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        A k=new A();
//        k.S();
//    }
//}
//o/p: hello.

//2)class final and method final output :
//final class A {
//   final void S() {
//        System.out.println("hello");
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        A k=new A();
//        k.S();
//    }
//}
//O/P:hello.

//3)class final and method final (paramter) :output
//        a)constant

//final class A {
//   final void Show() {
//       int a=10;
//        System.out.println(a);
//    }
//}
//public class Main {
//    public static void main(String[] args) {
//        A k=new A();
//        k.Show();
//    }
//}
//o/p=10;

//       b)user input
//import java.util.Scanner;
//final class A {
//   final void Show() {
//       Scanner sc=new Scanner(System.in);
//       int a=sc.nextInt();
//        System.out.println(a);
//    }
//}
//public class Main {
//    public static void main(String[] args) {
//        A k=new A();
//        k.Show();
//    }
//}

//4)class final and method final addition (void)
//        a)constant

//final class A {
//     void S() {
//        System.out.println("addition");
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        A k=new A();
//        k.S();
//    }
//}
//o/p=addition;

// b)use input.
//import java.util.Scanner;
//final class A {
//
//    Scanner sc=new Scanner(System.in);
//    String a=sc.nextLine();
//    String b=a;
//   final void addition() {
//
//       System.out.println(b);
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        System.out.println("enter addition");
//        A k=new A();
//        k.addition();
//    }
//}

//5)class final and method final (paramter) addition(void)
//        a)constant

//final class A {
//   final void addition() {
//       int a=10;
//       int b=15;
//        System.out.println(a+b);
//    }
//}
//public class Main {
//    public static void main(String[] args) {
//        A k=new A();
//        k.addition();
//    }
//}

//        b)user input
//import java.util.Scanner;
//final class A {
//   final void addition() {
//       Scanner sc=new Scanner(System.in);
//       int a=sc.nextInt();
//       int b=sc.nextInt();
//        System.out.println(a+b);
//    }
//}
//public class Main {
//    public static void main(String[] args) {
//        A k=new A();
//        k.addition();
//    }
//}

//6)class final and final method return type int addition (non paramter)
//        a)constant

//final class A {
//   final int show() {
//       int a=10;
//       int b=15;
//        System.out.println(a+b);
//        return a+b;
//    }
//}
//public class Main {
//    public static void main(String[] args) {
//        A k=new A();
//        k.show();
//    }
//}

//        b)user input
//import java.util.Scanner;
//final class A {
//   final int addition() {
//       Scanner sc=new Scanner(System.in);
//       int a=sc.nextInt();
//       int b=sc.nextInt();
//        System.out.println(a+b);
//        return a+b;
//    }
//}
//public class Main {
//    public static void main(String[] args) {
//        A k=new A();
//        k.addition();
//    }
//}

//7)class final and final method return type int add(paramter)
//        method final output :
//        a)constant

//final class A {
//   final int add(int a, int b) {
//
//        System.out.println(a+b);
//        return a+b;
//    }
//}
//public class Main {
//    public static void main(String[] args) {
//        A k=new A();
//        k.add(2,3);
//    }
//}

//        b)user input
//  import java.util.Scanner;
//  final class A {
//   final int add() {
//       Scanner sc=new Scanner(System.in);
//       int a=sc.nextInt();
//       int b=sc.nextInt();
//        System.out.println(a+b);
//        return a+b;
//    }
//}
//public class Main {
//    public static void main(String[] args) {
//        A k=new A();
//        k.add();
//    }
//}

//8)class final and method non final (paramter) :output

//final class A {
//     void Show(int a) {
//        System.out.println(a);
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        A k=new A();
//        k.Show(5);
//    }
//}

//9)class final and method final addition (void)
//        a)constant
//final class A {
//   final void addition( int a) {
//        System.out.println(a);
//    }
//}
//public class Main {
//    public static void main(String[] args) {
//        A k=new A();
//        k.addition(10);
//    }
//}
//o/p:10;


//       b)user input
//import java.util.Scanner;
//final class A {
//   final void addition() {
//       Scanner sc=new Scanner(System.in);
//       int a=sc.nextInt();
//        System.out.println(a);
//    }
//}
//public class Main {
//    public static void main(String[] args) {
//        A k=new A();
//        k.addition();
//    }
//}


//10)class final and method final (paramter) addition(void)
//        a)constant

//final class A {
//   final void add(int a, int b) {
//
//        System.out.println(a+b);
//
//    }
//    final void addition(int a,int b){
//        System.out.println(a+b);
//    }
//}
//public class Main {
//    public static void main(String[] args) {
//        A k=new A();
//        k.add(2,3);
//        k.addition(4,2);
//
//
//    }
//}

// b)user input.
//import java.util.Scanner;
//
//final class A {
//    Scanner sc=new Scanner(System.in);
//    int a=sc.nextInt();
//    int b=sc.nextInt();
//    final void add() {
//
//        System.out.println(a+b);
//    }
//
//    final void addition(){
//        System.out.println(a-b);
//
//    }
//}
//public class Main {
//    public static void main(String[] args) {
//        A k = new A();
//        k.add();
//        k.addition();
//
//
//    }
//}
//o/p: 7 and 3.

//11)class final and final method return type int addition (non paramter)
//        a)constant
//final class A {
//    final char addition() {
//        System.out.println("hellow");
//        return 0;
//    }
//}
//
//    public class Main {
//        public static void main(String[] args) {
//            A k = new A();
//            k.addition();
//        }
//    }

// b.user input.
//import java.util.Scanner;
//final class A {
//    Scanner sc=new Scanner(System.in);
//
//    String a=sc.nextLine();
//    final void add() {
//        System.out.println(a);
//    }
//}
//public class Main {
//    public static void main(String[] args) {
//        System.out.println("enter addition");
//        A k = new A();
//        k.add();
//    }
//}
//o/p:addition

//12)class final and final method return type int add(paramter)
//        a)constant

//final class A {
//    final int add(int a, int b) {
//
//        System.out.println(a + b);
//        return a + b;
//    }
//}
//public class Main {
//    public static void main(String[] args) {
//        A k=new A();
//        k.add(2,3);
//    }
//}
//O/P:5.

// b. user input
//import java.util.Scanner;
//final class A {
//    Scanner sc=new Scanner(System.in);
//    int a=sc.nextInt();
//    int b=sc.nextInt();
//    final int add() {
//        System.out.println(a+b);
//        return a+b;
//
//    }
//}
//public class Main {
//    public static void main(String[] args) {
//        System.out.println("enter two number for addition" );
//        A k = new A();
//        k.add();
//    }
//}

//13)class final and method final
//can we use mulitple final in a single class
//show()
//show1()
//show2()
//show3()

//  final class A {
//    final void show() {
//        System.out.println("hello");
//    }
//
//    final void show1() {
//        System.out.println("Hiii");
//    }
//
//    final void show2() {
//        System.out.println("bye");
//    }
//
//    final void show3() {
//        System.out.println("what's up");
//    }
//}
//    public class Main{
//        public static void main(String[] args) {
//            A k=new A();
//            k.show();
//            k.show1();
//            k.show2();
//            k.show3();
//        }
//    }
    //Yes class and inside method are final then we can use multiple final method in a single class.

//14)class and method final
//can we use multiple final in a single class
//show()
//show1()
//show2()
//show3()
//class A {
//    final void show() {
//        System.out.println("hello");
//    }
//
//    final void show1() {
//        System.out.println("Hiii");
//    }
//
//    final void show2() {
//        System.out.println("bye");
//    }
//
//    final void show3() {
//        System.out.println("what's up");
//    }
//}
//    public class Main{
//        public static void main(String[] args) {
//            A k=new A();
//            k.show();
//            k.show1();
//            k.show2();
//            k.show3();
//        }
//    }
//Yes class not final but inside method are final then we can use multiple final method in a single class.


//15)class and method final
//can we use multiple final in a single class
//show() final
//show1()
//show2() final
//show3()
//Yes we can create.
//    final class A{
//    final void show() {
//        System.out.println("hello");
//    }
//
//     void show1() {
//        System.out.println("Hiii");
//    }
//
//    final void show2() {
//        System.out.println("bye");
//    }
//     void show3() {
//        System.out.println("what's up");
//    }
//}
//    public class Main{
//        public static void main(String[] args) {
//            A k=new A();
//            k.show();
//            k.show1();
//            k.show2();
//            k.show3();
//        }
//    }

//16.class and method final
//can we use mulitple final in a single class
//show()  final (paramter)
//        show1()
//        show2() final (paramter)
//        show3()
//        a)constant
//        b)user input
//Yes we can use.
//    final class A{
//    final void show(int a) {
//        System.out.println(a);
//    }
//
//     void show1() {
//        System.out.println("Hiii");
//    }
//
//    final void show2(int b) {
//        System.out.println(b);
//    }
//     void show3() {
//        System.out.println("what's up");
//    }
//}
//    public class Main{
//        public static void main(String[] args) {
//            A k=new A();
//            k.show(5);
//            k.show1();
//            k.show2(9);
//            k.show3();
//        }
//    }

// b. user input
//import java.util.Scanner;
//    final class A{
//        Scanner sc=new Scanner(System.in);
//        int a=sc.nextInt();
//        int b=sc.nextInt();
//    final void show() {
//        System.out.println(a);
//    }
//
//     void show1() {
//        System.out.println("Hiii");
//    }
//
//    final void show2() {
//        System.out.println(b);
//    }
//     void show3() {
//        System.out.println("what's up");
//    }
//}
//    public class Main{
//        public static void main(String[] args) {
//            System.out.println("enter tow numbers");
//            A k=new A();
//            k.show();
//            k.show1();
//            k.show2();
//            k.show3();
//        }
//    }

//17)class and method final output :
//final class A {
//   final void add(int a) {
//        System.out.println(a);
//    }
//}
//public class Main {
//    public static void main(String[] args) {
//        A k=new A();
//        k.add(5);
//    }
//}


// 18)class and method final (paramter) :output
// multiply
// div
// a)constant
//final class A {
//   final void multiply(int a, int b) {
//
//        System.out.println(a*b);
//
//    }
//    final void division(int a,int b){
//        System.out.println(a/b);
//    }
//}
//public class Main {
//    public static void main(String[] args) {
//        A k = new A();
//        k.multiply(5, 3);
//        k.division(4, 2);
//    }
//}

// b)user input.
//import java.util.Scanner;
//
//final class A {
//    Scanner sc=new Scanner(System.in);
//    int a=sc.nextInt();
//    int b=sc.nextInt();
//    final void multiply() {
//
//        System.out.println(a*b);
//    }
//    final void division(){
//        System.out.println(a/b);
//
//    }
//}
//public class Main {
//    public static void main(String[] args) {
//        A k = new A();
//        k.multiply();
//        k.division();
//    }
//}

//19)class and method final reverse(void)
//a)constant
//final class A {
//    final void reverse() {
//        int num = 123;
//        int sum = 0, rem;
//        while(num>0)
//        {
//            rem = num % 10;
//            sum = sum * 10 + rem;
//            num = num/10;
//        }
//        System.out.println(sum);
//    }
//}
//public class Main {
//    public static void main(String[] args) {
//        A k=new A();
//        k.reverse();
//    }
//}

//b)user input
//import java.util.Scanner;
//final class A {
//    final void reverse() {
//        Scanner sc=new Scanner(System.in);
//        int num =sc.nextInt();
//        int sum=0, rem;
//        while(num>0)
//        {
//            rem = num % 10;
//            sum = sum * 10 + rem;
//            num = num/10;
//        }
//        System.out.println(sum);
//    }
//}
//public class Main {
//    public static void main(String[] args) {
//        System.out.println("enter you want reverse number");
//        A k=new A();
//        k.reverse();
//    }
//}

//20)class and method final (paramter) pallindrome(void).
//final class A {
//    final void palindrome(int num) {
//
//        int sum = 0, c = num, rem;
//
//        while (num > 0) {
//            rem = num % 10;
//            sum = sum * 10 + rem;
//            num = num / 10;
//        }
//        if (c == sum) {
//            System.out.println("number is palindrome");
//        } else {
//            System.out.println("number is not palindrome");
//        }
//    }
//}
//
//      public class Main {
//          public static void main(String[] args) {
//              System.out.println("enter a pallindrome number");
//               A k=new A();
//               k.palindrome(121);
//          }
//      }

//21)class and final method return type int armstrong(non paramter)
//final class A {
//    final void amstrong() {
//        int num = 371;
//        int sum = 0, c = num, rem;
//
//        while (num > 0) {
//            rem = num % 10;
//            sum = sum + rem * rem * rem;
//            num = num / 10;
//        }
//        if (c == sum) {
//            System.out.println("number is amstrong");
//        } else {
//            System.out.println("number is not amstrong");
//        }
//
//    }
//}
//public class Main {
//    public static void main(String[] args) {
//        A k=new A();
//        k.amstrong();
//    }
//}

//22)class and final method return type int factorial(paramter).
//final class A {
//
//    final int factorial(int n) {
//        int fact = 1;
//        for (int i = 1; i <= n; i++) {
//            fact = fact * i;
//        }
//        System.out.println("factorial is" +fact);
//        return 0;
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        A k=new A();
//        k.factorial(5);
//    }
//}
//
















