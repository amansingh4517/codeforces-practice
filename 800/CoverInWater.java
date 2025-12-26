import java.util.Scanner;

public class CoverInWater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int z = 0; z < t; z++) {
            int n = sc.nextInt(); // no. of cell
            String s = sc.next(); // (.) for empty , (#) for blocked
            int count = 0;
            int adjCell = 0;
            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == '.'){
                    adjCell++;          
                }
                if ((s.charAt(i) == '#' && adjCell != 0 )|| i==n-1) {
                    if(adjCell>=3) {
                        count = 2;
                        break;
                    }
                    if(adjCell == 1)
                        count++;
                    else if(adjCell==2) count += 2;
                    adjCell = 0;
                }
            }
            System.out.println(count);
        }
    }
}

// Algo : 1 -> put water and 2 -> replace water
// case 1 : one empty cell -> 1
// case 2 : two empty adjcent cell -> 11
// case 3 : three empty adjcent cell -> 101
//result : fail
// ------------new thought-----------
// case 1 : if only one empty cell -> 1 time action 1 perfomed to fill
// case 2 : if only two adjacent empty cell -> 2 times action 1 perfomed                                           
// case 3 : if only three adjacent empty cell -> 2 times action 1 perfomed
// case 4 : if more than 3 adjacent empty cell -> 2 times action 1 perfomed and others are 2
// result :fail
// ------------new thought-----------
// case 1 : if only one empty cell -> 1 time action 1 perfomed to fill
// case 2 : if only two adjacent empty cell -> 2 times action 1 perfomed
// case 3 : if only three adjacent empty cell -> 2 times action 1 perfomed
// case 4 : if any where adjacent empty cell found and we fill it with case 3 then we don't need to fill by action 1 we can replace water from center of three unlimited time and it will refill
// so if case 3 is fullfill immediately return the ans 2 no need to check futher
