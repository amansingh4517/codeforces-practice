import java.util.Scanner;

public class PrependAndAppend {
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        outer : while(0<t--){
            int  n = sc.nextInt();
            String s = sc.next();

            int i = 0  , j = n-1;
            while(i<=j){
                if(i<=j && s.charAt(i)==s.charAt(j)){
                    System.out.println(j-i+1);
                    continue outer;
                }
                i++;
                j--;

            }
            System.out.println(0);
        }
        sc.close();
    }
}
