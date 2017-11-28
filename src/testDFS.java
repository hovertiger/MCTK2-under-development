import java.io.IOException;

public class testDFS {
    int[][] G = {
            {0, 1, 0, 0, 1},
            {0, 0, 1, 1, 1},
            {0, 0, 0, 0, 0},
            {0, 0, 1, 0, 1},
            {0, 0, 1, 0, 0}
    };
    int path[] = new int[500];
    int top = 0;

    boolean visited[] = {false, false, false, false, false};

    public static void main(String[] args) throws IOException {
        testDFS tester= new testDFS();
        tester.dfs(0);
    }

    void dfs(int n) {
        if (!visited[n]) {
            path[top++] = n;
            visited[n] = true;
            if (n == 2) {
                boolean output=true;
                for (int i = 0; i < top; i++) if(path[i]==3) {output=false; break;}
                if(output) {
                    for (int i = 0; i < top; i++) {
                        System.out.print(path[i] + ", ");
                    }
                    System.out.println();
                    visited[path[top - 1]] = false;
                }
            }
        }
        for (int i = 0; i < 5; i++) {
            if (G[n][i] == 1) {
                if (!visited[i]) {
                    dfs(i);
                }

            }
        }
        if (top > 0) {
            visited[path[--top]] = false;
        }

    }


}
