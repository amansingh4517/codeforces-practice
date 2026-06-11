import java.util.Scanner;

public class AntimedianDeletion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- != 0) {
            int n = sc.nextInt();
            for (int i = 0; i < n; i++) {
                int curr = sc.nextInt();
                if (n >= 3) {
                    if (i == n - 1)
                        System.out.println(2);
                    else
                        System.out.print(2 + " ");
                } else if (n == 2) {
                    if (i == 1)
                        System.out.println(2);
                    else
                        System.out.print(2 + " ");

                } else
                    System.out.println(1);
            }
            System.out.println();

        }
        sc.close();
    }

}
