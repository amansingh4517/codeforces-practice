import java.util.Scanner;

public class ExtremelyRound {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(0<t--){
            int n = sc.nextInt();
            if(n<=10) {
                System.out.println(n);
                continue;
            }
            int digit = 0 , msd = 0;
            while(n>0){
                msd = n%10;
                digit++;
                n /= 10;
            }
            System.out.println(msd+((digit-1)*9));
        }
        sc.close();
    }
}
