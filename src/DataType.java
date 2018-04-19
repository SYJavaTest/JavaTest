/**
 * Created by uccc on 2018/4/16.
 */
public class DataType {
    public static void main(String[] args)
    {
        System.out.println("输出单精度函数的长度"+Float.SIZE);
        //char型自动转换为int型
        char ch='a';
        int i=ch;
        char CH='A';
        int I=CH;
        int C=ch+CH;
        //强制转换
        char a=(char) I;
        //long类型,   长整型的值后面必须加  L
        long L=14313241341234213L;

        System.out.println("输出i："+i);
        System.out.println("输出I："+I);
        System.out.println("输出C："+C);
        System.out.println("输出a："+a);
        System.out.println("输出L："+L);
    }
}
