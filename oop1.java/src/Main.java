//this is parent class
//this is child class

//class parent {
//    void parent() {
//        System.out.println("this is parent class");
//    }
//}
//class child {
//    void child() {
//        System.out.println("this is child class");
//    }
//}
//public class Main
//{
//    public static void main(String[] args)
//    {
//        parent p=new parent();
//        p.parent();
//        child c=new child();
//        c.child();
//    }
//}
//
//
//}

//class parent
//{
//    void parent()
//    {
//        System.out.println("this is parent class");
//    }
//}
//class child extends parent
//    {
//        void parent ()
//        {
//            super.parent();
//            System.out.println("this is child class");
//        }
//    }
//    public class Main
//    {
//        public static void main(String[] args)
//        {
//            child c=new child();
//            c.parent();
//        }
//    }


//class parent
//{
//    void parent()
//    {
//        System.out.println("this is parent class");
//    }
//}
//class child extends parent
//{
//    void parent ()
//    {
//        super.parent();
//        System.out.println("this is child class");
//    }
//}
//class grandson extends child
//{
//    void parent ()
//    {
//        super.parent();
//        System.out.println("this is grandson class");
//    }
//}
//public class Main
//{
//    public static void main(String[] args)
//    {
//        grandson gs=new grandson();
//        gs.parent();
//
//    }
//}


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
//
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
//



//this is animal class
//this is lion class
//this is cub class class
//class animal
//{
//    void parent ()
//    {
//        System.out.println("this is animal class");
//    }
//}
//class lion extends animal
//{
//    void parent ()
//    {
//        super.parent();
//        System.out.println("this is lion class");
//    }
//}
//class cub extends lion
//{
//    void parent ()
//    {
//        super.parent();
//        System.out.println("this is cub class class");
//    }
//}
//public class Main
//{
//    public static void main(String[] args)
//    {
//        cub c=new cub();
//        c.parent();
//    }
//}

//multileavel inheritance
//class A
//{
//    int a;
//    void setA (int f)
//    {
//        a=f;
//    }
//
//}
//class B extends A
//{
//    int b;
//    void setB(int k)
//    {
//        b=k;
//    }
//}
//class C extends B
//{
//    int c;
//    void setC (int d)
//    {
//        c=d;
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
//        C c=new C();//object creation
//      c.setA(1); // objectname.methodname
//      c.setB(2);
//      c.setC(4);
//      c.add();
//    }
//}
// o/p=7;

//division by multilevel inheritance
//class A
//{
//    int a;
//    void subA (int x)
//    {
//        a=x;
//    }
//}
//class B extends A
//{
//    int b;
//    void subB (int y)
//    {
//        b=y;
//    }
//}
//class C extends B
//{
//    int c;
//    void subC (int z)
//    {
//       c=z;
//    }
//
//    void sum()
//    {
//        int sum=a*b*c;
//        System.out.println(sum);
//    }
//}
//public class Main
//{
//    public static void main(String[] args)
//    {
//        C c=new C();
//        c.subA(2);
//        c.subB(4);
//        c.subC(3);
//        c.sum();
//    }
//}
//o/p=24;


//Division by multilevel inheritance
//class A
//{
//    int a;
//    void partA(int j)
//    {
//        a=j;
//    }
//}
//class B extends A
//{
//    int b;
//    void partB(int k)
//    {
//        b=k;
//    }
//}
//class C extends B
//{
//    int c;
//    void partC(int l)
//    {
//        c=l;
//    }
//
//    void sub()
//    {
//        int sub=((a/b)/c);
//        System.out.println(sub);
//    }
//}
//public class Main
//{
//    public static void main(String[] args)
//    {
//        C c=new C();
//        c.partA(12);
//        c.partB(2);
//        c.partC(2);
//        c.sub();
//    }
//}
//o/p=3;


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
//public class Main{
//    public static void main(String[] args)
//    {
//       cal c=new cal();
//       c.setA(3);
//       c.setB(5);
//       int m=c.getA();
//       int n=c.getB();
//       c.add();
//
//    }
//}
//o/p=8;


//private class used in the first class and second used default.
//class  cal {
//     private int a;
//
//    void setA(int a)
//    {
//        this.a = a;
//    }
//    int getA()
//    {
//        return a;
//    }
//}
//class A extends cal
//{
//     int b;
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
//public class Main {
//    public static void main(String[] args) {
//        A a=new A();
//        a.setA(4);
//        a.setB(5);
//        int m=a.getA();
//        int n= a.getB();
//        a.add();
//    }
//}
//
//showing error nothing compiling.
//
//first class default used and second class private use to extends.
//
//class  first {
//     int a;
//
//    void setA(int a)
//    {
//        this.a = a;
//    }
//    int getA()
//    {
//        return a;
//    }
//}
//class A extends first
//{
//    private int b;
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
//public class Main {
//    public static void main(String[] args) {
//        A a=new A();
//        a.setA(5);
//        a.setB(5);
//        int m=a.getA();
//        int n= a.getB();
//        a.add();
//    }
//}
// o/p=10;
//
//
//both class used protected.
//class  one {
//    protected int a;
//
//    void setA(int a)
//    {
//        this.a = a;
//    }
//    int getA()
//    {
//        return a;
//    }
//}
//class A extends one
//{
//    protected int b;
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
//public class Main {
//    public static void main(String[] args) {
//        A a=new A();
//        a.setA(4);
//        a.setB(5);
//        int m=a.getA();
//        int n= a.getB();
//        a.add();
//    }
//}
//o/p=10;
//
//
//first class used the public and second class used the private.
//class  any {
//    public int a;
//
//    void setA(int a)
//    {
//        this.a = a;
//    }
//    int getA()
//    {
//        return a;
//    }
//}
//class A extends any
//{
//    private int b;
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
//        System.out.println(a*b);
//    }
//}
//public class Main {
//    public static void main(String[] args) {
//        A a=new A();
//        a.setA(2);
//        a.setB(4);
//        int m=a.getA();
//        int n= a.getB();
//        a.add();
//    }
//}
//o/p=4;
//
//
//first class public and second class public.
//class  any {
//    public int a;
//
//    void setA(int a)
//    {
//        this.a = a;
//    }
//    int getA()
//    {
//        return a;
//    }
//}
//class A extends any
//{
//   public int b;
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
//        System.out.println(a/b);
//    }
//}
//public class Main {
//    public static void main(String[] args) {
//        A a=new A();
//        a.setA(10);
//        a.setB(2);
//        int m=a.getA();
//        int n= a.getB();
//        a.add();
//    }
//}
//o/p=5;
//
//
//default and private class used.
//class  sim {
//     int a;
//
//    void setA(int a)
//    {
//        this.a = a;
//    }
//    int getA()
//    {
//        return a;
//    }
//}
//class A extends sim
//{
//    private int b;
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
//        System.out.println(a-b);
//    }
//}
//public class Main {
//    public static void main(String[] args) {
//        A a=new A();
//        a.setA(6);
//        a.setB(4);
//        int m=a.getA();
//        int n= a.getB();
//        a.add();
//    }
//}
//o/p=2;
//
//
//conclution : any parent class have used the private access member specifier that class does not extendeble and also the private
// used in the child class but another way default and any other access specifier use to extendable.
//


//super keyword used
//class parent
//{
//    void show ()
//    {
//        System.out.println("parent class");
//    }
//}
//class child1 extends parent{
//    void show()
//    {   super.show();
//        System.out.println("child class");
//    }
//}
//class child2 extends parent
//{
//    void show()
//    {
//        super.show();
//        System.out.println("this is child2");
//    }
//}
//public class Main{
//    public static void main(String[] args) {
//        {
//            child1 p=new child1();
//            p.show();
//            child2 s=new child2();
//            s.show();
//
//
//        }
//    }
//}

//parent class
//child class
//parent class
//this is child2
//


//class parent
//{
//    int i;
//    void show (int a)
//    {
//        i=a;
//    }
//}
//class child1 extends parent{
//    int j;
//    void show(int b)
//    {
//        j=b;
//    }
//    void add()
//    {
//        System.out.println(i+j);
//    }
//}
//class child2 extends parent
//{
//    int k;
//    void show(int c)
//    {
//        k=c;
//    }
//    void sub()
//    {
//        System.out.println(i-k);
//    }
//}
//class child3 extends parent
//{
//    int l;
//    void show(int d)
//        {
//            l=d;
//        }
//        void multi()
//        {
//            System.out.println(i*l);
//        }
//    }
//class child4 extends parent
//{
//    int m;
//    void show(int e)
//    {
//        m=e;
//    }
//    void div()
//    {
//        System.out.println(i/m);
//    }
//}
//public class Main{
//    public static void main(String[] args) {
//        {
//            child1 p=new child1();
//            p.show(2);
//            child2 s=new child2();
//            s.show(3);
//            child3 v=new child3();
//            v.show(2);
//            child4 u=new child4();
//            u.show(2);
//        }
//    }
//}
//
//class parent
//{
//    void show ()
//    {
//        System.out.println("parent class");
//    }
//}
//class child1 extends parent{
//    void show()
//    {
//        System.out.println("child class");
//    }
//}
//class child2 extends parent
//{
//    void show()
//    {
//
//        System.out.println("this is child2");
//    }
//}
//public class Main{
//    public static void main(String[] args) {
//        {
//            child1 p=new child1();
//            p.show();
//            child2 s=new child2();
//            s.show();
//
//
//        }
//    }
//}


//Herarical inheritance.
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
//Super class A
//Sub class of A
//Super class A
//C is sub class of a


//override in herarical inheritance.
//class A{
//    void show()
//    {
//        System.out.println("A");
//    }
//}
//class B extends A{
//
//    void show()
//    { super.show();
//        System.out.println("B");
//    }
//}
//class C extends A{
//    void show()
//    { super.show();
//        System.out.println("C");
//    }
//}
//class D extends A{
//    void show()
//    {
//        super.show();
//        System.out.println("D");
//    }
//}
//class E extends A{
//    void show()
//    { super.show();
//        System.out.println("E");
//    }
//}
//public class Main{
//    public static void main(String[] args) {
//        B b=new B();
//        b.show();
//        C c=new C();
//        c.show();
//        D d=new D();
//        d.show();
//        E e=new E();
//        e.show();
//    }
//}
//o/p
//A
//B
//A
//C
//A
//D
//A
//E