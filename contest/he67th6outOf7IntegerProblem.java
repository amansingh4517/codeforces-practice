import java.util.Arrays;
import java.util.Scanner;

public class he67th6outOf7IntegerProblem {

        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t--!=0){
            int[] arr = new int[7];
            for(int i = 0 ; i < 7 ; i++){
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            int sum = 0;
            for(int i = 0 ; i < 7 ; i++){
                if(i<6) sum += arr[i]*(-1);
                else sum += arr[i];
;            }
            System.out.println(sum);
        }
        sc.close();
    }
}
