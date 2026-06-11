import java.util.Arrays;
import java.util.Scanner;

public class JellyfishAndUndertale {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int z = 0; z < t; z++) {
            int a = sc.nextInt(); // max value of timer
            int b = sc.nextInt(); // initial time of timer
            int n = sc.nextInt(); // no. of tools
            long[] arr = new long[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            long totalTime = b;
            for(long val : arr){
                totalTime += Math.min(val ,a-1);
            }
            System.out.println(totalTime);

        }
        sc.close();
    }
}
