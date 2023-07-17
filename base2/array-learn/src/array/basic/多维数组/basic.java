package array.basic.多维数组;

import java.util.Arrays;

/**
 * CLassName:Admin
 * Description:
 *
 * @author undef1ned
 * @version 1.0
 * @create 2023-07-17-21:53
 */
public class basic {
    public static void main(String[] args) {
    //  声明和静态初始化
    String[][] a = new String[][]{{"a","b"},{"c","d"}};
    System.out.println(Arrays.deepToString(a));
   // 声明和动态初始化
   int[][] b = new int[2][2];
    System.out.println(Arrays.deepToString(b));

    }

}
