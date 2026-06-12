import java.util.Scanner;

public class Coins {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(0<t--){
            long  n = sc.nextLong();
            long  k = sc.nextLong();

            if((n&1)!=1) System.out.println("Yes");
            else if(n%k==0) System.out.println("Yes");
            else if(((n-k)&1)==1) System.out.println("No");
            else System.out.println("Yes");
        }
        sc.close();
    }
}
