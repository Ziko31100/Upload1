package ProjectHw;

import java.util.Scanner;

public class task3 {

    public static void main(String[] args) {
        double [][] arr={
                {1.4, 2.0, 3.3,5.0 },
                {4.0, 1.5, 6.1,4.2},
                {1.2, 3.1, 4.0,1.5}

        };
        for (int i=0;i<arr.length;i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }

            System.out.println();
        }

    }}
