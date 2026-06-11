import java.util.Scanner;
import java.util.Arrays;

public class FlipFlops {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- != 0) {

            int n = sc.nextInt();
            long c = sc.nextLong();
            int k = sc.nextInt();

            int[] monster = new int[n];
            for (int i = 0; i < n; i++) {
                monster[i] = sc.nextInt();
            }
            Arrays.sort(monster);
            for (int i = 0; i < n; i++) {
                if (monster[i] > c)
                    break;
                if (k > 0 && monster[i] + k <= c) {
                    monster[i] += k;
                    k = 0;
                } else if (k > 0 && monster[i] + k > c) {
                    k -= c - monster[i];
                    monster[i] += c - monster[i];

                } 
                if (monster[i] <= c) {
                    c += monster[i];
                }
            }
            System.out.println(c);

        }
        sc.close();
    }
}
