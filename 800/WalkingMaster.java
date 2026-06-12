import java.util.Scanner;

public class WalkingMaster {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(0<t--){
            int  a = sc.nextInt();
            int  b = sc.nextInt();
            int  c = sc.nextInt();
            int  d = sc.nextInt();

            if(d<b || c-d > a-b) { 
                System.out.println(-1);
            }
            else {
                System.out.println((d-b) + Math.abs(c-(a+(d-b))));
            }
           
                
        }
        sc.close();
    }
}
