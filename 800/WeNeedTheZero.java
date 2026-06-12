import java.util.Scanner;

public class WeNeedTheZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(0<t--){
            int  n = sc.nextInt();
            int[] arr = new int[n];
            int XOR = 0;
            for(int i = 0 ; i < n ; i++){
                arr[i]= sc.nextInt();
                XOR ^= arr[i];
            }
            if((n&1)!=1){
                if(XOR==0) System.out.println(0);
                else System.out.println(-1);
            }
            else {
                System.out.println(XOR);
            }
        }
        sc.close();
    }
}
