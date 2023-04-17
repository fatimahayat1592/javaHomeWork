package homeWorkProject;

public class Task1 {
    public static void main(String[] args) {
        /*1. Create a program that uses an array to store a list of temperatures for a week, and
        then uses a loop to find the highest and lowest temperature for the week*/
        int [] temp={67,68,69,70,77,78,72};
        int num= temp[0];
        int num1=temp[0];
        for (int i = 0; i < temp.length; i++) {
            if (temp[i] > num) {
                num = temp[i];
            } else if (temp[i] < num1) {
                num1=temp[i];
            }
        }
        System.out.println("Highest temperature is "+num);

        System.out.println("Lowest temperature is "+num1);

    }
}
