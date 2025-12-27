import java.util.Scanner;
import java.util.HashMap;

public class Chemistry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int z = 0; z < t; z++) {
            int n = sc.nextInt(); // length of string
            int k = sc.nextInt(); // no. of char to delete
            String s = sc.next();
            HashMap<Character, Integer> map = new HashMap<>();

            // create HashMap
            for (int i = 0; i < n; i++) {
                char ch = s.charAt(i);
                map.merge(ch, 1, Integer::sum); // if exist then update else initilize
            }

            int oddCount = 0; // odd frequency element

            // calculate total number of element with odd frequency
            for (char i : map.keySet()) {
                if (map.get(i) % 2 != 0)
                    oddCount++;
            }

            oddCount -= k;
            if (oddCount <= 1 )
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}

// ALGO : in palidrome we need same no. of letter in left and right (expect
// center element if odd length)
// even element form palindrome or even element with one odd element form
// palindrome
// create a hashmap for each unique letter and check above condition
// if there is no element with odd frequency means every element have even
// number so it can form palindrome
// if there is only one element with odd frequency it can also form palindrome 1
// element in center
