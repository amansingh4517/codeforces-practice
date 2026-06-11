import java.util.Scanner;

public class AWonderfulContest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(0!=t--){
            int n = sc.nextInt();
            boolean flag = false;
            while(0!=n--){
                if(100 == sc.nextInt()) flag = true;
            }
            if(flag) System.out.println("Yes");
            else System.out.println("No");
        }
        sc.close();
    }
}
