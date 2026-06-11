import java.util.Scanner;

public class GridCovering{

    static long count = 0;

    private static void dfs(int i, int j, int down, int right, boolean[][] visited) {
        visited[i][j] = true;
        count++;
        if (!visited[(i + down) % visited.length][j])
            dfs((i + down) % visited.length, j, down, right, visited);
        if (!visited[i][(j + right) % visited[0].length])
            dfs(i, (j + right) % visited[0].length, down, right, visited);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- != 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();
            boolean[][] grid = new boolean[n][m];
            dfs(0, 0, a, b, grid);
            if(count == n*m) System.out.println("Yes");
            else System.out.println("No");

        }
        sc.close();
    }
}
