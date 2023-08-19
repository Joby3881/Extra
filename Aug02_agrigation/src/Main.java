//1.Main class
//T class
//show() -->show
//show1 print show1
//show2 print show2
//show3
//show4

//public class Main {
//    public static void main(String[] args) {
//        T k=new T();
//        k.show1();
//        k.show1();
//        k.show2();
//        k.show3();
//        k.show4();
//    }
//}
//-----------------------------------------------------------------------------------------------------------------------
//2.Main class
//access
//T class
//five metthod
//->addition
//->multi
//->div
//->modular
//->subs
//a)constant
//b)user input
//2.a

//public class Main {
//    public static void main(String[] args) {
//        T k = new T();
//        k.addition();
//        k.division();
//        k.multiply();
//        k.sub();
//        k.modulas();
//    }
//}

//2.b
//public class Main {
//    public static void main(String[] args) {
//        T k = new T();
//        k.addition();
//        k.division();
//        k.multiply();
//        k.sub();
//        k.modulas();
//    }
//}
//------------------------------------------------------------------------------------------------------------------------
//3)
//Main class
//access
//
//T class
//number swap
//
//E class
//reverse number
//
//S class
//pallindrome
//
//A
//armstrong
//
//F
//factorial
//
//O
//faibonaccii

//public class Main{
//    public static void main(String[] args) {
//        new T().swap();
//        new E().reverse();
//        new S().pallindrome();
//        new A().armstrong();
//        new F().factorial();
//        new O().fibbonachi();
//    }
//}
//------------------------------------------------------------------------------------------------------------------------
//4)Main class acess
//T class
//single level inheritance
//Car parent
//T class child car acess.
//public class Main {
//    public static void main(String[] args) {
//        Car k=new Car();
//        k.vehicale();
//    }
//}
//----------------------------------------------------------------------------------------------------------------------
//5.Main class :
//access
//T class
//multilevel inheritance
//Car
//Thar
//T
//public class Main {
//    public static void main(String[] args) {
//        thar k=new thar();
//        k.vehicale();
//    }
//}
//----------------------------------------------------------------------------------------------------------------------
//6)
//Main class :
//access
//T class
//heirarichal
//Parent
//chil1
//child2
//public class Main {
//    public static void main(String[] args) {
//        B b=new B();
//        b.show(); b.show1();
//        C c = new C();
//        c.show();c.show2();
//    }
//}
//----------------------------------------------------------------------------------------------------------------------
//7)
//Main class
//T class
//a)T class k constructor ko overload krna hey
//b)T class k constructor ki chaining through this
//public class Main{
//    public static void main(String[] args) {
//        new T().show();
//    }
//}
//----------------------------------------------------------------------------------------------------------------------
//8)
//Main class
//access
//
// second class
//parent class B show()
//t class k method ka naam bhi samne rkhgene
//overriding
//a)single
//b)multilevel
//c)heirarichal

//public class Main{
//    public static void main(String[] args) {
//        B k=new B();
//        k.show();
//    }
//}
//------------------------------------------------------------------------------------------------------------------------
//10)
//Main class
//T class
//A add() =>paramterised
//B extends A sub() =>paramterised
//C extends B div() =>paramterised
//E extends C multi() =>paramterised
//T extends E
//modylar () =>paramterised
//
//a)constant
//class A{
//    void add(int a, int b){
//        System.out.println("add :"+(a+b));
//    }
//}
//class B extends A{
//    void sub(int a, int b){
//        System.out.println("sub :"+(a-b));
//    }
//}
//class C extends B{
//    void multi(int a, int b){
//        System.out.println("multi :"+(a*b));
//    }
//}
//class D extends C{
//    void div(int a, int b){
//        System.out.println("div :"+(a/b));
//    }
//}
//class T extends D{
//    void mod(int a, int b){
//        System.out.println("mod :"+(a%b));
//    }
//}
//import java.util.Scanner;
//
//public class Main{
//    public static void main(String[] args) {
//       T k = new T();
//       k.sub(15,3);
//       k.multi(15,3);
//       k.div(15,3);
//       k.mod(15,3);
//     //  k.add(15,3);
//    }
//}
//b)user define
//class A{
//    void add(int a, int b){
//        System.out.println("add :"+(a+b));
//    }
//}
//class B extends A{
//    void sub(int a, int b){
//        System.out.println("sub :"+(a-b));
//    }
//}
//class C extends B{
//    void multi(int a, int b){
//        System.out.println("multi :"+(a*b));
//    }
//}
//class D extends C{
//    void div(int a, int b){
//        System.out.println("div :"+(a/b));
//    }
//}
//class T extends D{
//    void mod(int a, int b){
//        System.out.println("mod :"+(a%3b));
//    }
//}
//import java.util.Scanner;
//
//public class Main{
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter two number :");
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//       T k = new T();
//       k.sub(a,b);
//       k.multi(a,b);
//       k.div(a,b);
//       k.mod(a,b);
//       k.add(a,b);
//    }
//}

class A{
    Integer a=1;
}
