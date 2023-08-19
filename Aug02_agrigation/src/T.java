//1.  class T{
//    void show(){
//        System.out.println(" hello");
//    }
//    void show1(){
//        System.out.println("hii");
//    }
//    void show2(){
//        System.out.println("bye");
//    }
//    void show3(){
//        System.out.println("how's u");
//    }void show4(){
//        System.out.println("what's up");
//    }
//}
//----------------------------------------------------------------------------------------------------------------------
//2.a  class T{
//    int a=10,b=2;
//    void addition(){
//        System.out.println(a+b);
//    }
//    void division(){
//        System.out.println(a/b);
//    }
//    void multiply(){
//        System.out.println(a*b);
//    }
//    void sub(){
//        System.out.println(a-b);
//    }
//    void modulas(){
//        System.out.println(a%b);
//    }
//}

//b.
//import java.util.Scanner;
// class T{
//     Scanner sc=new Scanner(System.in);
//     int a=sc.nextInt();
//     int b=sc.nextInt();
//    void addition(){
//
//        System.out.println(a+b);
//    }
//    void division(){
//        System.out.println(a/b);
//    }
//    void multiply(){
//        System.out.println(a*b);
//    }
//    void sub(){
//        System.out.println(a-b);
//    }
//
//    void modulas(){
//        System.out.println(a%b);
//    }
//}

//3.
//    class T{
//    void swap(){
//    int a = 20;
//    int b = 40;
//    a=a*b;
//    b=a/b;
//    a=a/b;
//    System.out.println(a);
//    System.out.println(b);
//    }
//}


//4.
//class T {
//    void vehicale() {
//        System.out.println("this is parent class");
//    }
//}
// class Car extends T{
//     void vehicale(){
//         super.vehicale();
//         System.out.println("this is a child class");
//     }
// }

//5.
//    class T {
//    void vehicale() {
//        System.out.println("this is parent class");
//    }
//}
// class Car extends T {
//     void vehicale() {
//         super.vehicale();
//         System.out.println("this is a car class");
//     }
// }
//
//     class thar extends Car{
//         void vehicale(){
//             super.vehicale();
//             System.out.println("this is thar class");
//         }
//     }

//6.
//class A{
//    void show()
//    {
//        System.out.println("::: Mahindra ::: ");
//    }
//}
//class B extends A{
//
//    void show1()
//    {
//        System.out.println("Thar");
//    }
//}
//class C extends A{
//    void show2()
//    {
//        System.out.println("Scorpio");
//    }
//}
//

//7.
//class T{
//    T(){
//        System.out.println("hii");
//    }
//    T(int a){
//        System.out.println(a);
//    }
//    T(int a, int b){
//        System.out.println(a+b);
//    }
//}

//8.
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

