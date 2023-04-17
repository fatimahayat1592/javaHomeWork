package homeWorkProject;

public class Task8 {
    public static void main(String[] args) {
        // Maximum and minimum number in the array?
        int [] numbers={4,6,10,15,34,21};
        int max=numbers[0];
        int min=numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i]>max){
                max=numbers[i];
            }else if(numbers[i]<min){
                min=numbers[i];
            }
        }
        System.out.println("Maximum number is " +max);
        System.out.println("Minimum number is " +min);
    }
}
