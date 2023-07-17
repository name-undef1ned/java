package array.basic;

import java.util.Scanner;

/**
 * CLassName:Admin
 * Description:
 *
 * @author undef1ned
 * @version 1.0
 * @create 2023-07-17-20:07
 */
public class basicPra {

    public static void main(String[] args){

        String[] weeks ={"星期1","星期2","星期3","星期4","星期5","星期6","星期日"};
        Scanner s1 = new Scanner(System.in);
        System.out.println("please input the day you want display!");
        int userInput = s1.nextInt();

        if(userInput > 7 | userInput < 1){
            System.out.println("your input is error!");

        }else{
            System.out.println(weeks[userInput - 1]);
        }

        s1.close();

    }
}
