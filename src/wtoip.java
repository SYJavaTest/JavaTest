import java.util.Scanner;

/**
 * name:尚莹
 * Created by wtoip on 2018/11/5
 */

public class wtoip {
    public static void main(String args[]){
        Scanner input= new Scanner(System.in);
        System.out.println("请输入判定等级（A/B/C/D/F）：");
        String z=input.next();
        char grade=z.charAt(0);
        switch (grade){
            case 'A':
                System.out.println("优秀");
                break;
            case 'B':
            case 'C':
                System.out.println("良好");
                break;
            case 'D':
                System.out.println("及格");
                break;
            case 'F':
                System.out.println("你需要在努力！");
                break;
             default:
                 System.out.println("未知等级");

        }
        System.out.println("你的等级是："+grade);
    }
}
