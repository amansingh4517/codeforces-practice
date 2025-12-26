import java.util.Scanner;
import java.util.HashSet;

public class Forked {

    private static void possiblePosition(HashSet<String> set, int[][] dir, int x, int y) {
        for (int i = 0; i < dir.length; i++) {
            int a = x + dir[i][0];
            int b = y + dir[i][1];
            String cord = a + "," + b;
            set.add(cord);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int z = 0; z < t; z++) {
            int a = sc.nextInt(); // possible move of knight
            int b = sc.nextInt(); // possible move of knight
            int Kx = sc.nextInt(); // position of king on x axis
            int Ky = sc.nextInt(); // position of king on y axis
            int Qx = sc.nextInt(); // position of queen on x axis
            int Qy = sc.nextInt(); // position of queen on y axis

            // where (Kx,Ky)!=(Qx,Qy)
            // knight move a in one dir and b in other (not normal like 1 in one dir 2 in other it become variable)

            int[][] dir = { { a, b }, { a, -b }, { -a, b }, { -a, -b }, { b, a }, { b, -a }, { -b, +a }, { -b, -a } };
            HashSet<String> KingSet = new HashSet<>();
            HashSet<String> QueenSet = new HashSet<>();
            possiblePosition(QueenSet, dir, Qx, Qy);
            possiblePosition(KingSet, dir, Kx, Ky);
            KingSet.retainAll(QueenSet); // take intersection
            System.out.println(KingSet.size());
        }
    }
}

// Algo : calculate all possible position after move
// if king and queen both cordinate falls under that range
// but we have to give possible initial possition from where knight can target
// both
// if we reverse this idea take king as initial position and perform the move
// make a range of possible intial position for knight
// similarly for queen check possible position
// then take intersection , number of element in intersection set is ans (common
// position in both)
