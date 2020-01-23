package OutputSorulari;

/**
 * Created by Universal on 7/3/2019.
 */
public class tersUcgen {

    public static void main(String[] args) {
        long[] arr = new long[5];
        arr[0] = 256741038;
        arr[1] = 623958417;
        arr[2] = 467905213;
        arr[3] = 714532089;
        arr[4] = 938071625;

        long maxSum = 0;
        long minSum = 0;
        long tempMin = arr[0];
        long tempMax = arr[0];
        long sum = 0;

        for(long i = 0; i< arr.length; i++){

            if (tempMin > arr[(int) i]){
                tempMin = arr[(int) i];
            }

            if (tempMax < arr[(int) i]){
                tempMax = arr[(int) i];
            }
        }

        for (long i = 0; i < arr.length; i++) {
            sum = sum + arr[(int) i];
        }

        minSum = sum - tempMax;
        maxSum = sum - tempMin;

        System.out.println(minSum+ " " + maxSum);

//        int i = 2147483647;
//        System.out.println(i -1 );
//        System.out.println(i);
//        System.out.println(i+1);
//        System.out.println(i+2);
//
//        System.out.println(i+i);
//        System.out.println(i+i+i);

    }
}
