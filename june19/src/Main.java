//single leavel inheritance
//class cat{
//    void parent(){
//        System.out.println("i am cat");
//    }
//}
//class babycat {
//    void parent(){
//        System.out.println("i am babycat");
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//       cat a=new cat();
//       a.parent();
//       babycat b=new babycat();
//       b.parent();
//
//    }
//}
//o/p
// i am cat.
// i am babycat.


//multileavel inheritance Q1.
//class mobile
//{
//    void phone1()
//    {
//        System.out.println("mobile");
//    }
//}
//class android extends mobile
//{
//    void phone2()
//    {
//        System.out.println("android");
//    }
//}
//class smartphone extends android{
//    void phone3()
//    {
//        System.out.println("smartphone");
//    }
//}
//public class Main{
//    public static void main(String[] args) {
//        smartphone s=new smartphone();
//        s.phone1();
//        s.phone2();
//        s.phone3();
//    }
//}

//O/P
// mobile
// android
// smartphone


//multilevel inheritance Q2.

//class A
//{
//    int a;
//    void setA (int f)
//{
//    a=f;
//}
//
//}
//class B extends A
//{
//    int b;
//    void setB(int k)
//    {
//       b=k;
//    }
//}
//class C extends B
//{
//    int c;
//    void setC (int d)
//    {
//       c=d;
//    }
//    void add()
//    {
//        int add=a+b+c;
//        System.out.println(add);
//    }
//
//}
//public class Main
//{
//    public static void main(String[] args)
//    {
//        C p=new C();
//      p.setA(1);
//      p.setB(2);
//      p.setC(4);
//      p.add();
//    }
//}
//o/p=7;


//Herarical inheritance.


//class stationery {
//    void showA()
//    {
//        System.out.println("Stationery");
//    }
//}
//class pen extends stationery {
//    void showB()
//    {
//        System.out.println("pen");
//    }
//}
//class pencil extends stationery{
//    void showC()
//    {
//        System.out.println(" pencil");
//    }
//}
//class eraser extends stationery{
//    void showD()
//    {
//        System.out.println("eraser");
//    }
//}
//public class Main {
//    public static void main(String[] args) {
//        pen p = new pen();
//        p.showA();
//        p.showB();
//        pencil c = new pencil();
//        c.showA();
//        c.showC();
//        eraser e=new eraser();
//        e.showA();
//        e.showD();
//    }
//}
//O/P
//Stationery
//pen
//Stationery
// pencil
//Stationery
//eraser



//herarical inheritance with add,sub & division.
//class  A
//{
//    public int a;
//    void setA(int a)
//    {
//        this.a = a;
//    }
//    int getA()
//    {
//        return a;
//    }
//}
//class B extends A
//{
//    int b;
//
//    void setB (int b)
//    {
//        this.b=b;
//    }
//    int getB()
//    {
//        return b;
//    }
//    void add()
//    {
//        System.out.println(a+b);
//    }
//}
//class C extends A
//{
//    int c;
//    void setC(int c)
//    {
//     this.c=c;
//    }
//    int getC()
//    {
//        return c;
//    }
//    void sub()
//    {
//        System.out.println(a-c);
//    }
//}
//class D extends A{
//    int d;
//    void setD(int d)
//    {
//        this.d=d;
//    }
//    int getD()
//    {
//        return d;
//    }
//    void div()
//    {
//        System.out.println(a/d);
//    }
//}
//public class Main{
//
//    public static void main(String[] args)
//    {
//        B b=new B();
//        b.setA(3);
//        b.setB(4);
//        b.getA();
//        b.getB();
//        b.add();
//        C c=new C();
//        c.setA(3);
//        c.setC(2);
//        c.getA();
//        c.getC();
//        c.sub();
//        D d=new D();
//        d.setA(6);
//        d.setD(2);
//        d.getA();
//        d.getD();
//        d.div();
//    }
//}
//o/p=7,1,3.

//set & get metherod used to addition.

//class  cal {
//  private int a,b;
//
//    void setA(int a)
//    {
//        this.a = a;
//    }
//    void setB(int b)
//    {
//        this.b=b;
//    }
//    int getA()
//    {
//        return a;
//    }
//
//    int getB()
//    {
//        return b;
//    }
//
//    void add() {
//        System.out.println(a + b);
//    }
//}

//set & get 3 variable metherod used to addition.

//class  cal {
//  private int a,b,c;
//
//    void setA(int a)
//    {
//        this.a = a;
//    }
//    void setB(int b)
//    {
//        this.b=b;
//    }
//    void setC(int c)
//    {
//        this.c=c;
//    }
//    int getA()
//    {
//        return a;
//    }
//
//    int getB()
//    {
//        return b;
//    }
//    int getC()
//    {
//        return c;
//    }
//
//    void add() {
//        System.out.println(a+b+c);
//    }
//}
//public class Main{
//    public static void main(String[] args)
//    {
//       cal c=new cal();
//       c.setA(3);
//       c.setB(5);
//       c.setC(4);
//       int m=c.getA();
//       int n=c.getB();
//       int l=c.getC();
//       c.add();
//
//    }
//}
//o/p=12;


//setter metherod two class use multi,div,sub and addition.

//class  A {
//    int a;
//
//    void setA(int a)
//    {
//        this.a = a;
//    }
//
//    int getA()
//    {
//        return a;
//    }
//}
//    class B extends A
//    {
//        int b;
//        void setB(int b)
//        {
//          this.b=b;
//        }
//
//    int getB()
//    {
//        return b;
//    }
//
//    void add()
//    {
//        System.out.println(a + b);
//    }
//    void sub()
//    {
//        System.out.println(a-b);
//    }
//    void multi()
//    {
//        System.out.println(a*b);
//    }
//    void div()
//    {
//        System.out.println(a/b);
//    }
//    }
//
//public class Main {
//    public static void main(String[] args) {
//        B b = new B();
//        b.setA(10);
//        b.setB(2);
//        b.getA();
//        b.getB();
//        b.add();
//        b.div();
//        b.multi();
//        b.sub();
//    }
//}
//o/p=12
//5
//20
//


