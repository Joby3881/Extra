abstract class A {
    void add()
    {
        System.out.println("this is add");
    }
    abstract void sub();
}
class B extends A{
    @Override
    void sub() {
        System.out.println("this is sub");
    }
}
