import java.util.Scanner;
// import java.util.Math;

public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- != 0) {

            int n = sc.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int i = 0;
            while (i < n) {
                for (int j = n - 1; j >= 0; j--) {
                    if (Math.abs(arr[i]) >= Math.abs(arr[j])) {
                        System.out.print(j + " ");
                        break;
                    }
                }
                i++;

            }
        }
    }

}
