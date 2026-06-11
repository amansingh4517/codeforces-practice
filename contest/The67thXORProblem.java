import java.util.Scanner;

public class The67thXORProblem {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t--!=0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i = 0 ; i < n ; i++){
                arr[i] = sc.nextInt();
            }
            int max = Integer.MIN_VALUE;
            for(int i = 0 ; i < arr.length ; i++){
                for(int j = 0 ; j < arr.length ; j++){
                    if((arr[i]^arr[j])>max)  max = arr[i]^arr[j];
                }
            }
            System.out.println(max); 
        }
        sc.close();
    }
}
