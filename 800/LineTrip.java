import java.util.Scanner;

public class LineTrip {
    private static int maxGap(int[] arr) {
        int max = 0;
        for (int i = 1; i < arr.length; i++) {
            int diff = arr[i] - arr[i - 1];
            if (max < diff)
                max = diff;
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int z = 0; z < t; z++) {
            int n = sc.nextInt(); // no. of gas stations
            int x = sc.nextInt(); // distance
            int gas[] = new int[n];
            for (int i = 0; i < n; i++) {
                gas[i] = sc.nextInt(); // gas station points
            }
            // 1 L gas -> 1 unit distance
            // ans is the max distace it have to travel without gas station in between
            int zeroToFirst = gas[0];
            int lastToDestination = 2 * (x - gas[n - 1]);
            int maxGap = maxGap(gas);

            if (zeroToFirst > lastToDestination) {
                if (zeroToFirst > maxGap)
                    System.out.println(zeroToFirst);
                else
                    System.out.println(maxGap);
            } else {
                if (lastToDestination > maxGap)
                    System.out.println(lastToDestination);
                else
                    System.out.println(maxGap);
            }

        }
    }
}

// Possible max distance with without gas station , 3 case
// 0 - first gas staion distance
// largest gap btw adjacent gas station
// 2(last gas station to destination)

// whichever is largest is ans
