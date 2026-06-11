import java.util.Scanner;

public class Desorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (0 != t--) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int min = Integer.MAX_VALUE;
            for (int i = 1; i < n; i++) {
                if (arr[i] - arr[i - 1] < min)
                    min = arr[i] - arr[i - 1];
            }
            if (min < 0)
                System.out.println(0);
            else
                System.out.println(min/2+1);
        }
        sc.close();
    }
}
