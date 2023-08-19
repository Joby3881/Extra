//a)single leavel inheritance
//class parent{
//    void show(){
//        System.out.println("parent class");
//    }
//}
//class T extends parent{
//    void show(){
//        super.show();
//        System.out.println("child class");
//    }
//}
//
//public class Main{
//    public static void main(String[] args) {
//        new T().show();
//    }
//}


//1.by setter and getter metherod second class use to to A+B or addition.
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
//}
//public class Main {
//    public static void main(String[] args) {
//        B b = new B();
//        b.setA(5);
//        b.setB(2);
//        b.getA();
//        b.getB();
//        b.add();
//}
//}
//o/p=7;



//2.override in herarical inheritance.
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
//Note: in the herarical inheritace the override can be change with use of 'super' key word other wise parent class
//values cannot because of overriding process.



//3.multilevel inheritance overriding.
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
//class C extends B{
//    void show()
//    { super.show();
//        System.out.println("C");
//    }
//}
//class D extends C{
//    void show()
//    {
//        super.show();
//        System.out.println("D");
//    }
//}
//class E extends D{
//    void show()
//    { super.show();
//        System.out.println("E");
//    }
//}
//public class Main{
//    public static void main(String[] args) {
//
//        E e=new E();
//        e.show();
//    }
//}
//O/P
//A
//B
//C
//D
//E



//4.herarical inheritance.
//class A{
//    void show()
//    {
//        System.out.println("A");
//    }
//}
//class B extends A{
//
//    void show1()
//    {
//        System.out.println("B");
//    }
//}
//class C extends A{
//    void show2()
//    {
//        System.out.println("C");
//    }
//}
//public class Main {
//    public static void main(String[] args) {
//        B b=new B();
//        b.show(); b.show1();
//        C c = new C();
//        c.show();c.show2();
//    }
//}
//o/p
//A
//B
//A
//C


//5.Set & get metherod by herarical inheritance.
//class  A
//{
//    public int a;
//    void setA()
//    {
//        this.a = a;
//    }
//    int getA()
//    {
//        return a;
//    }
//    void show1()
//    {
//        System.out.println("A");
//    }
//}
//class B extends A
//{
//    int b;
//
//    void setB ()
//    {
//        this.b=b;
//    }
//    int getB()
//    {
//        return b;
//    }
//    void show2()
//    {
//        System.out.println("B");
//    }
//}
//class C extends A
//{
//    int c;
//    void setC()
//    {
//     this.c=c;
//    }
//    int getC()
//    {
//        return c;
//    }
//    void show3()
//    {
//        System.out.println("C");
//    }
//}
//class D extends A{
//    int d;
//    void setD()
//    {
//        this.d=d;
//    }
//    int getD()
//    {
//        return d;
//    }
//    void show4()
//    {
//        System.out.println("D");
//    }
//}
//public class Main{
//
//    public static void main(String[] args)
//    {
//        B b=new B();
//        b.setA();
//        b.setB();
//        b.getA();
//        b.getB();
//        b.show1();
//        b.show2();
//        C c=new C();
//        c.setA();
//        c.setC();
//        c.getA();
//        c.getC();
//        c.show1();
//        c.show3();
//        D d=new D();
//        d.setA();
//        d.setD();
//        d.getA();
//        d.getD();
//        d.show1();
//        d.show4();
//    }
//}
//O/P
//A
//B
//A
//C
//A
//D


//6.by getter setter metherod to a+b and b+c.
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
//    void add1()
//    {
//        System.out.println(a+b);
//    }
//}
//class C extends B
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
//    void add2()
//    {
//        System.out.println(b+c);
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
//        b.add1();
//        C c=new C();
//        c.setB(4);
//        c.setC(2);
//        c.getA();
//        c.getC();
//        c.add2();
//    }
//}
//o/p
//7
//6


//1.create person class get name and age through constructor ?
// class Person {
//    String name;
//    int age;
//
//    Person(String name,int age)
//    {
//        this.name = name;
//        this.age = age;
//    }
//}
//
//public class Main{
//    public static void main(String[] args)
//    {
//        Person p=new Person("anil",22);
//        System.out.println(p.name);
//        System.out.println(p.age);
//    }
//}



//2.create rectangle class with width & hight attributes calculate area and rectangle ?
//class rectangle{
//    int hight;
//    int width;
//
//    rectangle(int hight, int width){
//        this.hight=hight;
//        this.width=width;
//    }
//    void area()
//    {
//        int area=width*hight;
//        System.out.println("area is :" +area);
//    }
//}
//public class Main{
//    public static void main(String[] args) {
//        rectangle r=new rectangle(5,6);
//        r.area();
//    }
//}
//o/p : area is :30


//3.create a class circle with a redius and perameter calculate the area and circumference of the circle ?
//class circle{
//    int redius;
//
//    circle(int redius){
//
//        this.redius=redius;
//    }
//    void area()
//    {
//        double area=3.14*redius*redius;
//        System.out.println("area is :" +area);
//    }
//    void circumference()
//    {
//        double circumference=2*3.14*redius;
//        System.out.println("circumference of circle :" +circumference);
//    }
//}
//
//4.public class Main{
//    public static void main(String[] args) {
//        circle c=new circle(3);
//        c.area();
//        c.circumference();
//    }
//}
//
//o/p : area is :28.26.
//circumference of circle :18.84.



//4.traffic lite red green yellow (multileavel inheritance);
//class trafficlite{
//    void show()
//    {
//        System.out.println("Trafficlite lite showing attention please:::::");
//    }
//}
//class red extends trafficlite{
//    void show(){ super.show();
//        System.out.println("redlite");
//    }
//}
//class orange extends red{
//    void show(){ super.show();
//        System.out.println("orangelite");
//    }
//}
//class green extends orange{
//    void show(){ super.show();
//        System.out.println("greenlite");
//    }
//}
//public class Main{
//    public static void main(String[] args) {
//        green g=new green();
//        g.show();
//    }
//}
//o/p : Trafficlite lite showing attention please:::::
//redlite
//orangelite
//greenlite


//5.area : circle class, rectangle class, square class, rectangle class.(by getter seter metherod)
//class  area {
//    int r;
//    int l, h;
//    int a;
//}
//    class circle extends area{
//
//    void setA(int r)
//    {
//        this.r=r;
//    }
//    int getA(){
//        return r;
//    }
//    void area(){
//     double area=3.14*r*r;
//        System.out.println("area of circle is : "+area);
//    }
//}
//class rectangle extends area{
//    void setB(int l,int h){
//        this.l=l;
//        this.h=h;
//    }
//    int getB(){
//        return r;
//    }
//    void area(){
//        double area=l*h;
//        System.out.println("area of rectangle is : "+area);
//    }
//}
//class square extends area{
//    void setC(int l){
//        this.l=l;
//    }
//    int getC(){
//        return r;
//    }
//    void area(){
//        double area=l*l;
//        System.out.println("area of square is : " +area);
//    }
//}
//public class Main{
//    public static void main(String[] args) {
//        circle c=new circle();
//        c.setA(5);
//        c.getA();
//        c.area();
//        rectangle r=new rectangle();
//        r.setB(2,3);
//        r.getB();
//        r.area();
//        square s=new square();
//        s.setC(2);
//        s.getC();
//        s.area();
//
//    }
//}
//o/p:area of circle is : 78.5
//area of rectangle is : 6.0
//area of square is : 4.0.
zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz




