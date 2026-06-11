import java.util.*;
import java.io.*;

public class SequenceGame {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine().trim());

        while (0 != t--) {
            int n = Integer.parseInt(br.readLine().trim());

            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }

            // FIXED: plain int[] instead of ArrayList<Integer>
            // max possible size is 2*n (each element can add at most 2 entries)
            int[] list = new int[2 * n];
            int size = 0;

            list[size++] = arr[0];

            for (int i = 1; i < arr.length; i++) {
                int last = list[size - 1];
                if (last <= arr[i]) {
                    list[size++] = arr[i];        // >= case: just add
                } else {
                    // arr[i] < last: insert arr[i]-1 first, then retry arr[i]
                    list[size++] = (arr[i] != 1) ? arr[i] - 1 : 1;
                    i--;                           // retry same element
                }
            }

            // Output
            sb.append(size).append('\n');
            for (int i = 0; i < size; i++) {
                if (i > 0) sb.append(' ');
                sb.append(list[i]);
            }
            sb.append('\n');
        }

        System.out.print(sb);
    }
}