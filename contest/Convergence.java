import java.util.Scanner;

public class Convergence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (0 < t--) {
            int n = sc.nextInt();
            int table = sc.nextInt();
            int seat = sc.nextInt();
            int total_seat = table*seat;
            String s = sc.next();
            int empty_table = table , ans = 0;


            for (int i = 0; i < s.length(); i++) {
                char ch= s.charAt(i);
                if(ch =='I' && empty_table==seat ){
                    empty_table--;
                    total_seat--;
                    ans++;
                }
                else if(ch=='E' && empty_table!=)
            }
            int knife = height[0];
            for(int i = 1 ; i < n ; i++){

            }
        }
    }

}
