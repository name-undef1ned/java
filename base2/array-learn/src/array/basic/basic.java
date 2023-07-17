package array.basic;

import java.util.Arrays;

/**
 * CLassName:Admin
 * Description:
 *
 * @author undef1ned
 * @version 1.0
 * @create 2023-07-16-19:42
 */
public class basic {
 public static void main(String[] args) {

//  数组的静态初始化 初始化确定数组元素
//  基本数据类型的数组元素可省略new关键字
 int[] countList =new int[]{1,2};
 double[] doubleList ={1.1};
 String[] strList1 = new String[]{"a1", "b2"};
System.out.println(Arrays.toString(strList1));
//数组的动态初始化 元素默认值 引用:null 整型：0 浮点型：0.0 char：0 / '\u0000' boolean:false
String[] a = new String[3];

  a[1] = "你好";

  System.out.println(Arrays.toString(a));//[null, 你好, null]


 }

}
