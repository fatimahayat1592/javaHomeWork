package homeWorkProject;

public class Task4 {
    public static void main(String[] args) {
      //  4. Create a 2D array of integers. Develop a program which will
        //  calculate the sum of even and odd numbers for that array.
        int [][] numbers={
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12}
        };
        int sum=0;
        int sum1=0;
        for (int i = 0; i <numbers.length ; i++) {
            for (int j = 0; j <numbers[i] .length; j++) {
                if (numbers[i][j] % 2 == 0) {
                    sum = sum + numbers[i][j];
                }else if(numbers[i][j]%2==1){
                    sum1=sum1+numbers[i][j];
                }
            }

            }
            System.out.println(sum);
        System.out.println(sum1);


    }
}
