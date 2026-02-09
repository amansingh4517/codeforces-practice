import java.util.Scanner;
import java.util.HashMap;

public class Doremys_Paint3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // no of test case

        while (t-- > 0) {
            int n = sc.nextInt();
            HashMap<Integer,Integer> map = new HashMap<>();
            
            while (n-- > 0) {
                int x = sc.nextInt();
                map.merge(x, 1, Integer::sum);
            }
            if(map.size()>2) System.out.println("NO");
            else if(map.size()==1) System.out.println("Yes");
            else {
                int first=-1, second=-1;
                for(int key : map.keySet()){
                    if(first==-1) first = map.get(key);
                    else second = map.get(key);
                }
                if(Math.abs(first-second)>1) System.out.println("NO");
                else System.out.println("Yes");
            }  
        }
        sc.close();

    }
}

//Algo : if (a1 +a2 = a2 +a3 ) then a1 = a3 , similarly a2 = a4 so all the even element are same and odd element are same
//if they are arrange alternate then they are good 
//and there should not be a element repeat itself in adjacent place after rearranging 