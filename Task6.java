package homeWorkProject;

public class Task6 {
    public static void main(String[] args) {
       // 6. Write a java program to check whether a given number is prime or not?
        int num=3;
        int count=0;

            for (int i = 1; i <=num ; i++) {
                if(num%i==0){
                    count++;
                }
            }
            if(count==2){
                System.out.println("Prime number");
            }else{
                System.out.println("Number is not prime");
            }
        }

    }

