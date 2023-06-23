//整型和浮点型的变量
public class Variable {
public static void main(String[] args){
    //Byte 1字节 -127 - 128
      byte b1 = -127;
      byte b2 =127;

      //short 2字节  -32768 -- 32767
      short s1= -32768;
      short s2= 32767;

      //int 类型  4字节  21亿
      int i1 = 666;

      //long 类型 8字节
      long l1 =999;
      System.out.println(b1);
      System.out.println(l1);

      //float 单精度 需要携带后缀
      float f1=0.12138f;

      //double 双精度
      double d1 = 0.111111111;

      System.out.println(f1);
      System.out.println(d1);

      char a='a';
      byte b='a';

      System.out.println(b);

      byte b3 =5;
      short s3 =3;
      short t3 = (short)(s3 + b3);
      System.out.println(t3);

      byte b22 = -128;
      b22--;
      System.out.println(b22); //127

      byte b23 = 127;
      b23++;
      System.out.println(b23); //-128
}
}
