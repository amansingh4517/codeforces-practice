
import java.util.Scanner;

// import 
public class HalloumiBoxes {
    private static boolean isSorted(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] > arr[i])
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // no of test case
        for (int x = 0; x < t; x++) {
            int n = sc.nextInt(); // no. of boxes
            int k = sc.nextInt(); // length of maximum reverse that theofanis can make
            int[] box = new int[n];
            for (int i = 0; i < n; i++) {
                box[i] = sc.nextInt();
            }
            if (isSorted(box))
                System.out.println("YES");
            else {
                if (k > 1)
                    System.out.println("YES");
                else
                    System.out.println("NO");
            }

        }
        sc.close();

    }
}

// Algo : if list is already sorted return YES
// if not sorted then
// if k = 1 you can not change two element positions
// if k = 2 you can change position of any array and make it sort
// Ex: 6421 -> 4621 -> 4261 -> 4216 -> 2416 -> 2146 -> 1246 it is sorted
// if k=2 if can place any element to it desired location , it can be sorted
// if k>2 then we know max reverse it k but we can perform reverse less than k
// value
// if k>2 still we can perform k=2 reverse and sort any array
// so , if k>=2 it can be sorted , but not for k=1
