//1.This keyword can be used to invoke refer the current class instance variable.
//class A{
//    int i;
//    void show(int i){
//      this.i=i;
//    }
//    void show1(){
//        System.out.println(i);
//    }
//}
//public class Main {
//    public static void main(String[] args) {
//        A k=new A();
//        k.show(10);
//        k.show1();
//    }
//}
//o/p: 10.

//2. This key word can be used to invoke current class method.(impliclty)
//class A{
//    void show(){
//        System.out.println("hello");
//    }
//    void show1(){
//        show();
//    }
//}
//public class Main {
//    public static void main(String[] args) {
//        A k=new A();
//        k.show1();
//    }
//}
//o/p: hello.

//3. This key word can be used to invoke current class constructor.
//class A{
//    A(){
//        System.out.println("no arg constructor");
//    }
//    A(int a){
//        this();
//        System.out.println("parameterised constructor");
//    }
//}
//public class Main{
//    public static void main(String[] args) {
//        A k=new A(10);
//
//    }
//}
//o/p: no arg constructor.
//     parameterised constructor.

//4. This key word can be used to pass as an argument in the method calling.
//class A{
//    void show(A k){
//        System.out.println("method");
//    }
//    void show1(){
//        show(this);
//    }
//}
//public class Main {
//    public static void main(String[] args) {
//        A k=new A();
//        k.show1();
//    }
//}
//method

//5. This key word can be used to pass as an argument in the constructor calling.
// class A{
//    A(B k){
//        System.out.println("test class constructor");
//    }
//}
//class B {
//    void show() {
//        A k=new A(this);
//    }
//}
//   public class Main {
//    public static void main(String[] args){
//        B k=new B();
//        k.show();
//    }
//}
//test class constructor.

//6.this key word can be used to return current class instance from the method.
//o/p: nil.
//class A{
//    A a(){
//        return this;
//    }
//}
//public class Main{
//    public static void main(String[] args){
//        A k=new A();
//        k.a();
//    }
//}