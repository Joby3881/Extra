//class Cal{
//    int add(int a, int b)
//    {
//        int c=a+b;
//        return c;
//        //System.out.println(a+b);
//    }
//    int add(int a, int b, int c)
//    {
//        int d=a+b+c;
//        return d;
//        //System.out.println(a+b);
//    }
//}
//public class Main{
//    public static void main(String[] args)
//    {
//        Cal p=new Cal();
//        System.out.println( p.add(1,5));
//        System.out.println(p.add(1,2,3));
//    }
//}


class A{
    A(int a)
    {
        this(1,2);
        System.out.println(a);
    }
    A(int a, int b)
    {
        System.out.println(a+b);
    }
    A()
    {
        this(1);
    }
}
public class Main{
    public static void main(String[] args)
    {
        new A();
    }
}
