import java.lang.management.MonitorInfo;

public class MaxValueIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {76,32,67,98},
                {33,98,99,233},
                {100,8755},
                {3213,4443,8998},
                {9999}
        };
        System.out.println(maxValue(arr));
    }

    static int maxValue(int[][] arr){
        int max = Integer.MIN_VALUE;
        for(int i = 0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                if(arr[i][j] > max){
                    max = arr[i][j];
                }
            }
        }
        return max;
    }

}

