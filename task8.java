package ProjectHw;

public class task8 {
    public static void main(String[] args) {
        int[][] arr = {
                {45, 75, 13, 53, 5, 6, 7, 8},
                {12, 23, 45, 67, 89, 12},
                {41, 12, 234, 43, 13, 67}
        };
        int max = arr[0][0];
        int min =arr[0][0];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];

                }
            }
        }
        System.out.println("the maximum number of array ="+max);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] < min) {
                    min = arr[i][j];

                }
            }

        }
        System.out.println("the minimum number of array ="+min);

    }
}