import java.util.Scanner;

public class THUPackingPuzzle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T--!=0){
            long t = sc.nextInt();
            long h = sc.nextInt();
            long u = sc.nextInt();
            long n = 0;
            if(t>0 && u>0){
                long min = (t<u) ? t : u;
                n += min*4;
                t -= min;
                u -= min;
            } 
            if(t>1 && h>0){
                if(t>=2*h){
                    n += h*7;
                    t -= 2*h;
                    h -= h;

                }
                else if(h>=t/2){
                    n += 7*(t/2);
                    h -= t/2;
                    t -= (t/2)*2;
                }
                
            }
            if(t>0 && h>0){
                long min = (t<h) ? t : h;
                n += min*5;
                t -= min;
                h -= min;
            }
            if(t>1){
                n += t*2 + 1;
                t = 0;
            }
            n += (t+h+u)*3;
            System.out.println(n);
        }
        sc.close();
    }
}
