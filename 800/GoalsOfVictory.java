import java.util.Scanner;

public class GoalsOfVictory {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(0!=t--){
            int n = sc.nextInt();
            int sum = 0;
            for(int i = 0 ; i < n-1 ; i++){
                sum += sc.nextInt();
            }
            System.out.println(sum*-1);

        }
        sc.close();
    }
}
