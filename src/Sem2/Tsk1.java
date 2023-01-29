package Sem2;

import java.io.File;
import java.util.Arrays;
import java.util.logging.Logger;

public class Tsk1 {
    static Logger logger = Logger.getLogger(String.valueOf(Tsk1.class));
    public static void main(String[] args) {
//        File log = new File("log.txt");
        int[] arr = new int[]{3, 9, 4, 5, 2, 7, 1, 6};
        boolean isWorked = false;
        while (!isWorked) {
            isWorked = true;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    isWorked = false;
                    int temp2 = arr[i + 1];
                    arr[i + 1] = arr[i];
                    arr[i] = temp2;
                    logger.info(String.valueOf(arr[i]));

                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
