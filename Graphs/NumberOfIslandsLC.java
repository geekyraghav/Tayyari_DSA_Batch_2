package Graphs;

public class NumberOfIslandsLC {
    public int numIslands(char[][] grid) {
        int m = grid.length, n = grid[0].length;
        boolean[][] vis = new boolean[m][n];
        int count = 0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]=='1' && !vis[i][j]){
                    dfs(i,j,grid,vis);
                    count++;
                }
            }
        }
        return count;
    }

    private void dfs(int i, int j, char[][] grid, boolean[][] vis) {
        int m = grid.length, n = grid[0].length;
        vis[i][j] = true;
        if(i-1 >= 0 && grid[i-1][j] == '1' && !vis[i-1][j]) dfs(i-1,j,grid,vis); // up
        if(i+1 < m && grid[i+1][j] == '1' && !vis[i+1][j]) dfs(i+1,j,grid,vis); // down
        if(j-1 >= 0 && grid[i][j-1] == '1' && !vis[i][j-1]) dfs(i,j-1,grid,vis); // left
        if(j+1 < n && grid[i][j+1] == '1' && !vis[i][j+1]) dfs(i,j+1,grid,vis); // right
    }
}
