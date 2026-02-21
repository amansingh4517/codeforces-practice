import java.util.Scanner;

public class JellyfishAndUndertale {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int z = 0; z < t; z++) {
            int a = sc.nextInt(); // max value of timer
            int b = sc.nextInt(); // initial time of timer
            int n = sc.nextInt(); // no. of tools
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            int totalTime = b;
            int curr = b;
            for (int i : arr) {
                if (curr + i <= a) {
                    totalTime += i;
                    curr += i;
                } else {
                    if (i > a) {
                        curr = -curr + a;
                        totalTime += a;
                    } else {
                        curr = -curr + i;
                        totalTime += i;
                    }
                }
            }
            System.out.println("ans : "+(totalTime-1));

        }
        sc.close();
    }
}
