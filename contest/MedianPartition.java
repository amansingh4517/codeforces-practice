import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Scanner;

public class MedianPartition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        HashMap<Integer, Integer> map = new HashMap<>();
        while (t-- != 0) {
            int n = sc.nextInt();
            // int maxKey = Integer.MIN_VALUE;
            int fre = Integer.MIN_VALUE;
            while (0 != n--) {
                int x = sc.nextInt();
                map.put(x, map.getOrDefault(x, 0) + 1);
                if (map.get(x) > fre) {
                    // maxKey = x;
                    fre = map.get(x);
                }
            }
            if ((fre & 1) == 1)
                System.out.println(fre);
            else
                System.out.println(fre - 1);
            map.clear();
        }
        sc.close();
    }
}
