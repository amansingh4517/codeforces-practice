import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class UnitedWeStand {

    private static boolean prime(int n) {
        for (int i = 2; i * i < n; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (0 != t--) {
            int n = sc.nextInt();
            int[] a = new int[n];
            ArrayList<Integer> b = new ArrayList<>();
            ArrayList<Integer> c = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                // if(prime(x) || x==1) b.add(x);
            }
            Arrays.sort(a);
            int max = a[a.length - 1];
            for (int val : a) {
                if (val == max)
                    c.add(val);
                else
                    b.add(val);
            }
            if (c.isEmpty() || b.isEmpty()) {
                System.out.println(-1);
                continue;
            } else {
                System.out.println(b.size() + " " + c.size());
                
                for (int val : b) {
                    System.out.print(val+" ");
                }
                System.out.println();
                for (int val : c) {
                    System.out.print(val+" ");
                }
                System.out.println();
            }
        }
        sc.close();

    }
}
