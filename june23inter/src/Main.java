////In inter face me method ke agge Public Abstract key word lagadeta hai. by default bhi hote hai
////interface concret method can make body but use key word only default and static.
//ex.this programm.
//*inter face ke ander sare varible 'public static fianal' by default hota hai  (public static fianal int a=10;)

//1.
//interface A{
//    void show();
//        static void show1(){  //inter face me concret method banake body bana sakte hai but default and static key word
//                                   // ka use kar na padega.
//            System.out.println();
//        }
//}

//1interface A{
//    void show();
//        }
//        class B implements A{
//     public void show(){
//         System.out.println("hiii");
//     }
//        }
//        public class Main {
//            public static void main(String[] args) {
//                A b=new B();//abstract method like we cannot make the object of interface class but we can make
//                b.show();    // reference from the interface class.
//            }
//}

//2.Multiple inheritance possible in interfaces.
//interface A {
//    void show();   //by default public abstract static
//}
//interface B {
//    void display();
//}
//class C implements A,B {
//    public void show() {
//        System.out.println("showinggg");
//    }
//
//    public void display() {
//        System.out.println("diplay");
//    }
//}
//public class Main{
//    public static void main(String[] args)
//    {
//        C k=new C();
//        k.show();
//        k.display();
//    }
//}

//3.
//can we make parameterised implements method ?
// yes , we can make
//
//abstract A{
// abstract  void show();
//}
//class B extends A{
//    public void show()
//    {
//        System.out.println("showwinggg");
//    }
//}
//public class Main{
//    public static void main(String[] args)
//    {
//        A k=new A();
//        k.show();
//    }
//}


//interface A{
//    void show();
//}
//interface B{
//    void print();
//}
//interface C{
//    void view();
//}
//interface D{
//    void add();
//}
//class E implements A,B,C,D{
//
//    @Override
//    public void show() {
//        System.out.println("hellooo");
//    }
//
//    @Override
//    public void print() {
//        System.out.println("hiii");
//    }
//
//    @Override
//    public void view() {
//        System.out.println("how's u");
//    }
//
//    @Override
//    public void add() {
//        System.out.println("what's up");
//    }
//}
//public class Main {
//    public static void main(String[] args) {
//        E e=new E();
//        e.show();
//        e.print();
//        e.view();
//        e.add();
//    }
//}
//
//
//
//
//

import java.util.Scanner;
//public class Main {
//    public static void main(String[] args)
//    {
//        for (int i=1; i<=5;i++)
//        {
//            {
//                for (int j = 1; j <= 5; j++) {
//                    System.out.print(j);
//                }
//                System.out.println();
//            }
//        }
//    }
//}

//public class Main {
//    public static void main(String[] args) {
//
//        for(int i=1;i<=4;i++){
//            for(int j=1;j<=4;j++){
//                System.out.print(i);
//            }
//            System.out.println();
//        }
//    }
//}




