import java.util.Scanner;

public class ForbiddenInteger {
    public static void main(String[] args) {
        // BufferdReader br = new BufferedReader(new inputSteam(System.in));
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (0 < t--) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int x = sc.nextInt();

            if (x == 1) {

                if (k == 1)
                    System.out.println("No");
                // n==even and (k>=2)
                else if ((n & 1) != 1) {
                    System.out.println("Yes");
                    System.out.println(n / 2);
                    while (n > 0) {
                        System.out.print(2 + " ");
                        n -= 2;
                    }
                    System.out.println();
                }
                // n=odd and k = 2
                else if (k == 2)
                    System.out.println("No");
                // k>=3 and n = odd
                else {
                    System.out.println("Yes");
                    System.out.println((n - 3) / 2 + 1);
                    System.out.print(3 + " ");
                    n -= 3;
                    while (n > 0) {
                        System.out.print(2 + " ");
                        n -= 2;
                    }
                    System.out.println();
                }

            } 
            //if x not 1
            else {
                System.out.println("Yes");
                System.out.println(n);
                while (0 < n--) {
                    System.out.print(1 + " ");
                }
                System.out.println();
            }
        }
        sc.close();
    }
}
