import java.util.Scanner;

public class UnitArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (0 < t--) {
            int n = sc.nextInt();
            int positive = 0 , negative = 0 , operation = 0;
            for (int x = 0; x < n; x++) {
                int i = sc.nextInt();
                if (1 == i)
                    positive++;
                else
                    negative++;
            }
            // -1 should be even for multiple to be 1
            // and -1 should equal to or small to 1 to be sum to 0 or greater
            while(negative>positive || (negative&1)==1){
                operation++;
                negative--;
                positive++;
            }
            System.out.println(operation);

        }
    }
}
