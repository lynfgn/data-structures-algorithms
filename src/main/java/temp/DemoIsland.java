package temp;
import java.util.Scanner;

/**
 * 计算岛屿问题
 */
public class DemoIsland {


        public static int numIslands(char [] [] grid) {
            int count = 0;
            if(grid.length == 0) {
                return 0;
            }
            int row = grid.length;
            int l = grid[0].length;
            char [][] vist = new char [row][l];
            for( int i = 0; i < row; i++) {
                for( int j= 0; j < l;j++) {
                    if(vist[i][j] !='1' && grid[i][j] == '1') //如果没有访问过，且为陆地，计数加1。
                    {
                        count ++;
                    }
                    FS(grid,vist,i,j); //遍历这个区域周围，将与自己相连的区域 vist全置为1(相连接的 1 为一块)
                }
                //继续下一个位子
            }
            return count;
        }
        //将与这个1相连所有区域全部置为访问过。
        public static void FS(char [][]grid,char[][] vist,int i, int j) {
            if( i < 0 || i > grid.length-1 || j < 0 || j > grid[0].length -1 ) {
                return ;
            }
            if(grid[i][j] == '0'){ //访问到海洋返回
                return;
            }
            if(vist[i][j] == '1') { //访问过的陆地 返回。
                return;
            }
            //没访问过 先置1
            vist [i][j] = '1';
            //上下左右遍历
            FS(grid,vist,i+1,j);
            FS(grid,vist,i-1,j);
            FS(grid,vist,i,j+1);
            FS(grid,vist,i,j-1);
            return;

        }

        //主函数
        public static void main(String[] args) {
            System.out.print("您输入的二维数组行大小为 ：");
            Scanner row = new Scanner(System.in);
            int r = row.nextInt();

            System.out.print("您输入的二维数组列大小为 ：");
            Scanner ll = new Scanner(System.in);

            int l = ll.nextInt();

            char [] [] grid = new char[r][l];

            for(int i = 0 ; i < r ; i++ ) {
                System.out.print("输入第"+i+"行数据:");
                Scanner in = new Scanner(System.in);
                String str = in.next();
                char[] c = str.toCharArray();
                for(int j = 0 ; j < l ;j++) {
                    grid[i][j] = c[j];
                }

            }
            for(int i = 0 ; i < r ; i++ ) {

                for(int j = 0 ; j < l ;j++) {
                    System.out.print(grid[i][j]);
                }
                System.out.println();
            }
            int count = numIslands(grid);

            System.out.println(count);
        }

    }
