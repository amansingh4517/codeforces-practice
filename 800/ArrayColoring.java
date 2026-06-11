import java.util.Scanner;

public class ArrayColoring {
    public static void main(String[] args) {
        //same parity means all either odd or even
        // odd + odd = even , even + even  = even , odd + even = odd
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(0!=t--){
            int n = sc.nextInt();
            int sum = 0 ;
            while(0!=n--){
                sum += sc.nextInt();
            }
            if((sum&1)==1) System.out.println("NO");
            else System.out.println("YES");
        }
        sc.close();
    }
    
}
