import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        Scanner i= new Scanner(System.in);
        System.out.println("enter f");
        char r=i.next().charAt(0);

        if(r=='f') {

            System.out.println("female");
        }
        else if (r=='m') {

            System.out.println("male"); }
        else {
            System.out.println("other");
        }

    }

}

