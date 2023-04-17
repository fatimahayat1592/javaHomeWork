package homeWorkProject;

public class Task9 {
    public static void main(String[] args) {
        /*Write a java program to find the second largest
        number in the array?*/
        int [] arr={6,9,34,54,32};
        int largest=0;
        int secondLargest=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>largest){
                secondLargest=largest;
                largest=arr[i];
            }

        }
        System.out.println("Second largest number is "+secondLargest);

    }
}
