import java.util.Scanner;

public class OneAndTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        outer : while(0<t--){
            int  n = sc.nextInt();
            int twoCount = 0;
            int[] arr = new int[n];
            for(int i = 0 ;i<n ; i++){
                arr[i] = sc.nextInt();
                if(arr[i]==2) twoCount++;
            }
            if((twoCount&1)==1) {
                System.out.println(-1);
                continue;
            }
            int currTwo = 0;
            for(int i = 0 ; i < n ; i++){
                if(arr[i]==2) currTwo++;
                if(currTwo == twoCount/2) {
                    System.out.println(i+1);
                    continue outer;
                }  
            }        
        }
        sc.close();
    }
}
