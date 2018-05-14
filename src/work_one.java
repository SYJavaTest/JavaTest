import java.util.*;
import java.lang.Math;


/**
 * Created by uccc on 2018/4/18.
 * 题目：
 * 1. 要求用户输入一个整数，如果是偶数就输出他是一个偶数，否则就输出他是一个奇数
 * 2. 要求用户输入一个年份，然后告诉用户这年时瑞年还是平年
 */
public class work_one {
    public static void JiOu(){
        Scanner input = new Scanner(System.in);
        System.out.println("请输入一个整数：");

        try{
            int number =input.nextInt();
            if (number%2==0){
                System.out.println("该数字为偶数");
            }
            else{
                System.out.println("该数字为奇数");
            }
        }
        catch(Exception e) {
            System.out.println("您输入的内容不是整数，不符合要求");
            JiOu();
        }

    }
    public static void Year(){
        try{
            Scanner input = new Scanner(System.in);
            System.out.println("请输入要判定的年份");
            int year = input.nextInt();
            if ((year%4==0) && (year%100!=0) || year%400==0 ){
                System.out.println("该年份为瑞年！");
            }
            else{
                System.out.println("该年份为平年！");
            }

        }
        catch (Exception e){
            System.out.println("您输入的内容不合法！");
            Year();
        }

    }
    public static void Mora(){
        int hand;
        int x=(int)(1+Math.random()*3);//随机数的范围在1-3区间内
        String hand1="剪刀",hand2="石头",hand3="布";
        System.out.println("-----------猜拳游戏-----------");
        System.out.println("请出拳：1（剪刀）、2（石头）、3（布）");
        System.out.println("您选择出的拳头是：");
        try{
            Scanner input = new Scanner(System.in);
            hand = input.nextInt();
            if(hand < 1 || hand > 3){
                System.out.println("您输入的值不合法！3秒后重新输入！");
                Thread.sleep(3000);
                Mora();
            }
            else{
                Random random=new Random();
                random.nextInt(x);
                if ((hand==1 && random.nextInt(x)==2)||(hand==2 && random.nextInt(x)==3)||(hand==3 && random.nextInt(x)==1))
                {
                    if(hand==1) {
                        System.out.println("您出的是" + hand1 + "电脑出的是" + hand2);
                        System.out.println("您输了！");
                    }
                    else if(hand==2){
                        System.out.println("您出的是" + hand2 + "电脑出的是" + hand3);
                        System.out.println("您输了！");
                    }
                    else{
                        System.out.println("您出的是" + hand3 + "电脑出的是" + hand1);
                        System.out.println("您输了！");
                    }
                }
                else if(hand == random.nextInt(x))
                {
                    System.out.println("您与电脑出的拳头一致，平局了！");
                }
                else
                {
                    if(hand==1) {
                        System.out.println("您出的是" + hand1 + "电脑出的是" + hand3);
                        System.out.println("您赢了！");
                    }
                    else if(hand==2){
                        System.out.println("您出的是" + hand2 + "电脑出的是" + hand1);
                        System.out.println("您赢了！");
                    }
                    else
                    {
                        System.out.println("您出的是" + hand3 + "电脑出的是" + hand2);
                        System.out.println("您赢了！");
                    }
                }

            }
        }
        catch (Exception e){
            System.out.println("您输入的值不合法！");
            Mora();
        }

    }

    public static void main(String[] args){

        work_one jiou=new work_one();
        jiou.JiOu();
        work_one years=new work_one();
        years.Year();
        work_one mora=new work_one();
        mora.Mora();

    }
}
