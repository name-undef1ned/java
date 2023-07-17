package array.basic;

import java.util.Arrays;
import java.util.Scanner;

/**
 * CLassName:Admin
 * Description:
 *
 * @author undef1ned
 * @version 1.0
 * @create 2023-07-17-20:22
 */
public class basicPra2 {

    public static void main(String[] args) {
        System.out.print("请输入学生人数！");
        Scanner s1 = new Scanner(System.in);
        int studentCount = s1.nextInt();
        double[] scoreList = new double[studentCount];
        System.out.print("请输入" + studentCount + "个成绩！");
        String[] rangList = new String[scoreList.length];
        for (int i = 0 ; i < scoreList.length;i++){
            double userInput = s1.nextDouble();
            scoreList[i] = userInput;
            if(userInput<=100 & userInput >=80){
                rangList[i]="student 0 score is :"+ userInput +",grade is A";
            }else if(userInput<80 & userInput >=60){
                rangList[i]="student 0 score is :"+ userInput +",grade is B";
            }else if(userInput<60 & userInput >=40){
                rangList[i]="student 0 score is :"+ userInput +",grade is c";
            }else if(userInput<40 & userInput >=20){
                rangList[i]="student 0 score is :"+ userInput +",grade is D";
            }else if(userInput<20 & userInput >=0){
                rangList[i]="student 0 score is :"+ userInput +",grade is E";
            }

        }

        s1.close();



        double temp;
        for (int i = 0 ; i < scoreList.length;i++) {
            for (int j =0;j < scoreList.length;j++){
                if((j+1)< scoreList.length ){
                    if( scoreList[j]>scoreList[j+1]) {
                        temp=scoreList[j];
                        scoreList[j]=scoreList[j+1];
                        scoreList[j+1]=temp;
                    }
                }
            }
        }
        System.out.println("排序结果：" + Arrays.toString(scoreList));

        System.out.println("最高分为：" + scoreList[scoreList.length - 1]);

        for (String s : rangList) {
            System.out.println(s);
        }

    }
}
