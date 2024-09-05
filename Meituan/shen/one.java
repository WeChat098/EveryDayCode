package Meituan.shen;

/**
 * @Author : Yinghao Zhang
 * @Date : 2024/9/3 19:25
 * @Version : V1.2
 * @Description : 111
 */
public class one {
    public int numIslands(char[][] grid) {
        int count = 0;
        for (int i = 0;i < grid.length;i++) {
            for (int j = 0;j < grid[0].length;j++) {
                if (grid[i][j] == '1') {
                    count++;
                    dfs(grid,i,j);
                }
            }
        }
        return count;
    }
    public void dfs(char[][] grid,int x,int y) {
        if (x < 0 || x >= grid.length || y < 0 || y >= grid[0].length || grid[x][y] == '0' || (char)grid[x][y] == '2') {
            return;// base case;
        }
        grid[x][y] = '2';
        dfs(grid,x - 1,y);
        dfs(grid,x + 1,y);
        dfs(grid,x,y - 1);
        dfs(grid,x,y + 1);
    }

    public static void main(String[] args) {
        one one1 = new one();
        char[][] strArray = {{'1', '1', '1', '1', '0'},
                {'1', '1', '0', '1', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '0', '0', '0'}};
        System.out.println(strArray.length);
        System.out.println(strArray[0].length);
        System.out.println(one1.numIslands(strArray));
    }
}
