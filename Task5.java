package homeWorkProject;

public class Task5 {
    public static void main(String[] args) {
        int a=30;
        int b=20;
        System.out.println("Before swap");
        System.out.println("a is "+a);
        System.out.println("b is "+b);
        a=a-b;
        b=a+b;
        a=b-a;
        System.out.println("after swap");
        System.out.println("a is "+a);
        System.out.println("b is "+b);
    }
}
