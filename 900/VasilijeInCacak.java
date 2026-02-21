import java.util.Scanner;

public class VasilijeInCacak {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int z = 0; z < t; z++) {
            int n = sc.nextInt(); // range
            int k = sc.nextInt(); // no. of element to pick
            long x = sc.nextLong(); // required sum
            

            //find possible largest and smallest k element in range n;
            long ksumSmallest = (long) k*(k+1)/2;
            long ksumLargest = (long) k * (2L * n - k + 1) / 2;

            if (x < ksumSmallest || x > ksumLargest) {
                System.out.println("NO");
                continue;
            } else {
                System.out.println("YES");
                continue;
            }
        }
        sc.close();
    }
}

//Algo : find the smallest possible sum using k element and largest also 
// we if given sum is smaller than minimun possible sum or larger than maximun possible sum then return NO
// if given sum is in between these possible sum then return YES