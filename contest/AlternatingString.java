import java.io.*;

public class AlternatingString {
    public static void main(String[] args) throws IOException {

        // CHANGED: Scanner → BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        // CHANGED: sc.nextInt() → Integer.parseInt(br.readLine().trim())
        int t = Integer.parseInt(br.readLine().trim());

        while (0 != t--) {

            // CHANGED: sc.next() → br.readLine().trim()
            String s = br.readLine().trim();

            if (s.length() == 3) {
                sb.append("Yes\n");   // CHANGED: System.out.println → sb.append
                continue;
            }

            int count = 0;
            int set = 0;
            for (int i = 1; i < s.length(); i++) {
                if (s.charAt(i - 1) == s.charAt(i)) {
                    count++;
                    set++;
                } else
                    count = 0;
                if (count > 2 || set > 2) {
                    break;
                }
            }

            if (count > 2 || set > 2) {
                sb.append("No\n");    // CHANGED
            } else {
                sb.append("Yes\n");   // CHANGED
            }
        }

        // CHANGED: single print at the very end
        System.out.print(sb);
    }
}