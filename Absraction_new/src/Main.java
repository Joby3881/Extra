//Abstraction: abstract is a detail hiding (implementation hiding).(user se hum implimentation detial hide karke ke rakh
//hai orr apne user ko sirff higlighted set of service dikha the hai.
//abstraction we can achive with Abstract class(0-100%) and Intefaces(100%).

//abstract class program.
//1.A method without body (no implementation) is know as abstract method.
//2.eak abstract class ke ander abstract method banana compolsury nahi hai but method abstract bana diya tho class
//abstract banana padega.
//3.Koi bhi class abstract class ko inherit karta hai tho who abstract class ka jith ne bhi method ki body inherited class
//me banaba compolsary hai.
//4.Abstract class ka method name same hai tho ither method overriding ka consep bhi use ho raha hai.
//4.Abstract class ka object hum creat nahi kar sakthe.but abstract class ka refarence create karr sakt he hai.
//advantage of abstraction.
abstract class vehicale{
    abstract void start();
}
class car  extends vehicale{
    void start(){
        System.out.println(" car start with key");
    }
}
class scooter extends vehicale{
    void start(){
        System.out.println("scooter starts with key");
    }
}
public class Main {
    public static void main(String[] args) {
        //vehicale v=new vehicale();

     vehicale v=new car();
//       v.start();
//       vehicale v1=new scooter();
//       v1.start();
//        car c=new car();
//        c.start();
//        scooter s=new scooter();
//        s.start();

    }
}