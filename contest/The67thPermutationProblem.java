import java.util.Scanner;

public class The67thPermutationProblem {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t--!=0){
            int n = sc.nextInt();
            int first = n;
            int after = n+1;
            while(first!=0){
                if(first == n) System.out.print(first--+" "+ (after++) +" " + after++ );
                else System.out.print(" " + first--+" "+ (after++) +" " + after++ );
            } 
            System.out.println(); 
        }
        sc.close();
    }

}
