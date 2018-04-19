import java.util.*;


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
            System.out.print("请输入要判定的年份");
            int year = input.nextInt();
            if ((year%4==0) && (year%100!=0) || year%400==0 ){
                System.out.println("该年份时瑞年！");
            }
            else{
                System.out.println("该年份时平年！");
            }

        }
        catch (Exception e){
            System.out.println("您输入的内容不合法！");
            Year();
        }

    }

    public static void main(String[] args){

        work_one jiou=new work_one();
        jiou.JiOu();
        work_one years=new work_one();
        years.Year();

    }
}
