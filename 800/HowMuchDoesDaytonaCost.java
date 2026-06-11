import java.util.Scanner;
public class HowMuchDoesDaytonaCost {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(0!=t--){
            int n = sc.nextInt();
            int k = sc.nextInt();
            boolean flag = false;
            while(0!=n--){
                if(k==sc.nextInt()) {
                    flag = true;
                }
            }
            if(flag) System.out.println("Yes");
            else System.out.println("No");
        }
        sc.close();
    }
}