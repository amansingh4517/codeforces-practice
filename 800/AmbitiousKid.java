import java.util.Scanner;

public class AmbitiousKid {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int min = Integer.MAX_VALUE;
        while(0!=n--){
            int c = Math.abs(sc.nextInt());
            if(c<min) min = c;
        }
        System.out.println(min);
        sc.close();
    }
}
