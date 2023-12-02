package ProjectHw;

public class task4 {
    public static void main(String[] args) {
        int [][] arr={
                {2,4,6,7,8,9},
                {1,4,6,7,11,21},
                {5,7,10,13,14}
        };
        int sumEven=0,
                sumOdd=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]%2==0){
                    sumOdd=sumOdd+arr[i][j];
                }
                else{
                    sumEven=sumEven+arr[i][j];
                }
            }
        }
        System.out.println("sum of Odd numbers"+sumOdd);
        System.out.println("Sum of Even numbers"+sumEven);

    }
}
