package ProjectHw;

public class task9 {
    public static void main(String[] args) {
        int[][] arr = {
                {45, 75, 13, 53, 5, 6, 7, 8},
                {12, 23, 45, 67, 129, 12},
                {41, 12, 234, 43, 13, 67}
        };
        int max = arr[0][0];


        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr[i].length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];

                }
            }
        }
        System.out.println("2nd largest element is  =" + max);
    }
}
