import java.util.Scanner;

public class RedBlackPairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (0 != t--) {
            int n = sc.nextInt();
            String s1 = sc.next();
            String s2 = sc.next();
            int fr1 = 0, fb1 = 0, fr2 = 0, fb2 = 0;

            while (n/2 != n--) {
                if(s1.charAt(n)=='R') fr1++;
                else fb1++;
                if(s2.charAt(n)=='R') fr2++;
                else fb2++;
            }
            
            int sr1 = 0, sb1 = 0, sr2 = 0, sb2 = 0;

            while (0 != n--) {
                if(s1.charAt(n)=='R') sr1++;
                else sb1++;
                if(s2.charAt(n)=='R') sr2++;
                else sb2++;
            }
            

        }
        sc.close();
    }
}
