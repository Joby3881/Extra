//Singleton class: A class which allow us to create only one object is called singleton class. (constructor will invoke
//only one object this mean the object's referance will same.)
//private constructor used.
//Adavntage is: Inconsisitancey the avoid.
class student{
    static student st=new student();
    private student(){
        System.out.println(" construct will invoke only one object");
    }
    static student getInstance(){
        return st;
    }
}
class test{
    public static void main(String[] args) {
        student st1=student.getInstance();
        student st2=student.getInstance();
    }
}
//O/P: construct will invoke only one object.

