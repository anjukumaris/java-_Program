package hackerRankProblem;
import java.util.Scanner;
public class BirthdayDayCandles {
    public static void main(String[] ar) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println(" Enter array elements :::");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Array Elements are:::");
        for (int a : arr) {
            System.out.println(a);
        }
        int max=arr[0],count=0;
        for(int i=0;i<n;i++) {
            if (arr[i]>=max ) {
                max = arr[i];
                count++;
                           }


        }
        System.out.println(count);
        System.out.println("Max:::"+max);

    }

}
