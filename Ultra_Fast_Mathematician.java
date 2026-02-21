import java.util.Scanner;
public class Ultra_Fast_Mathematician {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            String x = sc.next();
            String y = sc.next();

            StringBuilder sb = new StringBuilder();
            for(int i = 0; i<x.length() ; i++){
                sb.append((x.charAt(i)==y.charAt(i)) ? '0' : '1');
            }
            System.out.println(sb);
        }
        sc.close();
    }
}
